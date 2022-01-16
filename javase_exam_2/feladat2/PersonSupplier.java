package potvizsga.feladat2;


import java.util.Random;
import java.util.function.Supplier;

// This supplier should supply random PersonLL objects with names either randomly chosen from a list or made up of random
// letters. The age should be a random number between 0-100
public class PersonSupplier implements Supplier<PersonLL> {

    private String[] names = new String[] {"Mario", "Darth Vader", "Captain America", "Kirby", "Charizard"};

    @Override
    public PersonLL get() {
        return new PersonLL(names[new Random().nextInt(names.length)], new Random().nextInt(100));
    }
}
