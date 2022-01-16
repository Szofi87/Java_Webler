import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Practice {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Date date = new Date(new Date().getTime() + 10000);

        timer.schedule(date, new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from the future");
            }
        });

        timer.schedule(date, () -> System.out.println("Hello from the future"));

        Printer printer = new Printer();

//        String[] strings = {"A", "B", "C"};
//
//        printer.print(new Supplier<String>() {
//            @Override
//            public String get() {
//               return strings[new Random().nextInt(strings.length)];
//            }
//        });

//        printer.print(() -> strings[new Random().nextInt(strings.length)]);

        List<String> stringList = new ArrayList<>();
        stringList.add("Budapest");
        stringList.add("Debrecen");
        stringList.add("Miskolc");
        stringList.add("Nyiregyhaza");
        stringList.add("Pallag");
        System.out.println(stringList.stream().reduce(new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return s + ", " + s2;
            }
        }).get());


        System.out.println(stringList.stream().reduce((s, s2) -> s + ", " + s2).get());

        String s2 = "";
        for (String s : stringList) s2 = s + ", " + s2;
        System.out.println(s2);

        stringList.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if(s.contains("e")) System.out.println(s);
            }
        });

        System.out.println(stringList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("e");
            }
        }).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("e");
            }
        }).count());

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.stream().filter(new OTTest()).count();

        Button button = new Button();
        button.addActionListener(e -> System.out.println(e));


    }
}
