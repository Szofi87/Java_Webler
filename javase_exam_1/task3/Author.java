package javase_exam_1.task3;


public class Author implements Comparable<Author>{

    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Compare two authors by their names
    @Override
    public int compareTo(Author o) {
       return this.name.compareTo(o.name);
    }

    // Return the author's name
    @Override
    public String toString() {
        return this.name;
    }
}
