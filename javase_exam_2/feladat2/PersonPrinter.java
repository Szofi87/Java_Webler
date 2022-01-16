package potvizsga.feladat2;

import java.util.function.Consumer;

// The PersonPrinter class should consume PersonLL objects and print them on the console
public class PersonPrinter implements Consumer<PersonLL> {

    @Override
    public void accept(PersonLL personLL) {
        System.out.println(personLL.getName() + " " + personLL.getAge());
    }
}
