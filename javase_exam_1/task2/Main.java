package javase_exam_1.task2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Abigail", 22);
        Person p2 = new Person("Bobbie", 24);
        Person p3 = new Person("Carl", 17);
        Person p4 = new Person("David", 36);
        Person p5 = new Person("Earl", 19);
        Person p6 = new Person("Frank", 54);
        Person p7 = new Person("George", 20);
        Person p8 = new Person("Hannah", 42);

        /*
         * 1. Create a Person array containing all the instances above
         */

        Person[] people = new Person[]{p1, p2, p3, p4, p5, p6, p7, p8};

        /*
         * 2. Use a for loop to display all the people in the array
         * you have just created. Implement the toString() method
         * in the Person class and use that for printing the object
         *
         * expected output
         * "Abigail (22)
         *  Bobbie (24)
         *  Carl (17)
         *  David (36)
         *  Earl (19)
         *  Frank (54)
         *  George (20)
         *  Hannah (42)"
         */

        for (Person p : people) {
            System.out.println(p);
        }

        /*
         * 3. Calculate the average age using a for loop and print the answer
         * make sure that the answer is given as a float and not an integer
         *
         * expected output
         * "The average age is 29.25"
         */

        float sum = 0;

        for (Person p : people) {
            sum += p.getAge();
        }

        sum = sum/people.length;

        System.out.println("The average age is " + sum);

        /*
         * 4. Find the oldest person and print the answer
         *
         * expected output
         * "The oldest person is Frank (54)"
         */

        Person oldestPerson = people[0];

        for(Person p : people) {
            if(p.getAge() > oldestPerson.getAge()){
                oldestPerson = p;
            }
        }

        System.out.println("The oldest person is " + oldestPerson);

        /*
         * 5. Find the two people who are the most similar in age
         *
         * expected output
         * "The two people closest in age are Earl (19) and George (20)"
         */

        Person closestInAge1 = people[0];
        Person closestInAge2 = people[1];

        for (Person person1 : people){
            for (Person person2 : people) {
                if(person1 != person2) {
                    int diff = person1.getAge() - person2.getAge();
                    diff = Math.abs(diff);

                    int currentDiff = closestInAge1.getAge() - closestInAge2.getAge();
                    currentDiff = Math.abs(currentDiff);

                    if(diff < currentDiff) {
                        closestInAge1 = person1;
                        closestInAge2 = person2;
                    }
                }
            }
        }

        System.out.println(String.format("The two people closest in age are %s and %s", closestInAge1, closestInAge2));

    }
}
