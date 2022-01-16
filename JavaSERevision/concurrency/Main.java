package concurrency;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        int a = 0;
        new Thread(() -> {
            System.out.println(vehicle.name);
            vehicle.name = "toyota";
            a++;
            System.out.println(a);
        });
        int b = 5;
        a = b;
    }
}
