package potvizsga.feladat2;

public class Main {

    private static PersonLL people;

    public static void main(String[] args) {

        addPeople();

        PersonPrinter personPrinter = new PersonPrinter();

        people.process(personPrinter);

    }

    private static void addPeople() {
        PersonSupplier personSupplier = new PersonSupplier();

        // TODO uncomment these lines after implementing the PersonSupplier class
        people = personSupplier.get();
        for (int i = 0; i < 10; i++) {
            people.add(personSupplier.get());
        }
    }

}
