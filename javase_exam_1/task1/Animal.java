package javase_exam_1.task1;

public abstract class Animal implements Comparable<Animal> {
    private String name;
    private int age;
    private Colour colour;

    public Animal(String name, int age, Colour colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    abstract void makeSound();

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
