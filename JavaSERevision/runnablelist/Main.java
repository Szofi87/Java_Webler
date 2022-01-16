package runnablelist;

public class Main {
    public static void main(String[] args) {
        RunnableList runnableList = new RunnableList();
        runnableList.schedule(() -> System.out.println("en vagyok az elso node"));
        runnableList.schedule(() -> System.out.println("en vagyok a masodik node"));
        runnableList.schedule(() -> System.out.println("en vagyok a harmadik node"));
        runnableList.schedule(() -> System.out.println("en vagyok a negyedik node"));
        runnableList.run();
    }
}
