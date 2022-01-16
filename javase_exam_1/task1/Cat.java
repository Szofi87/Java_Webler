package javase_exam_1.task1;

public class Cat extends Animal {

    int livesLeft = 9;

    public Cat(String name, int age, Colour colour) {
        super(name, age, colour);
    }

    @Override
    void makeSound() {
        for (int i = 0; i < this.livesLeft; i++) {
            System.out.println("meow");
        }
    }
}
