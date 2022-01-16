package potvizsga.feladat2;

import java.util.function.Consumer;

public class PersonLL {
    private String name;
    private int age;
    private PersonLL next;

    public PersonLL(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void add(PersonLL p) {
        int a = this.age;
        PersonLL s = this.next;
        if(this.next != null) this.next.add(p);
        else this.next = p;
    }

    public void process(Consumer<PersonLL> personLLConsumer) {
        personLLConsumer.accept(this);
        if(this.next != null) {
            this.next.process(personLLConsumer);
        }
    }
}
