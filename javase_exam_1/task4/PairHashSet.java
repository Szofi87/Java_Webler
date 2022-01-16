package javase_exam_1.task4;

import java.util.HashSet;

// over engineering
public class PairHashSet extends HashSet<Main.Pair> {

    @Override
    public boolean add(Main.Pair pair) {
        if(!this.contains(pair)) {
            return super.add(pair);
        } else return false;
    }

    @Override
    public boolean contains(Object o) {
        if(o instanceof Main.Pair){
            return this.stream().anyMatch(pair -> pair.equals(o));
        }
        return false;
    }
}
