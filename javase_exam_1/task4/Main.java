package javase_exam_1.task4;

import java.util.Objects;
import java.util.Set;

public class Main {

    static class Pair {
        int a, b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if(o instanceof Pair) {
                return (((Pair) o).a == this.a && ((Pair) o).b == this.b) ||
                        (((Pair) o).a == this.b && ((Pair) o).b == this.a);
            }

            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }

        @Override
        public String toString() {
            return "(" + this.a + "," + this.b + ")";
        }
    }

    public static void main(String[] args) {

        Set<Pair> amicablePairs = new PairHashSet();

        int sumDivisors = 0;

        for (int i = 220; i < 10000; i++) {
            for (int j = 1; j < i; j++) {
                if(i%j==0) sumDivisors += j;
            }

            int i2 = sumDivisors;

            sumDivisors = 0;
            for (int j = 1; j < i2; j++) {
                if(i2%j==0) sumDivisors += j;
            }

            if(sumDivisors == i){
                Pair p = new Pair(i, i2);
                amicablePairs.add(p);
            }
            sumDivisors = 0;
        }

        amicablePairs.forEach(System.out::println);

    }



}
