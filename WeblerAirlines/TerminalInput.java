package WeblerAirlines;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TerminalInput {

    private static final Scanner scanner = new Scanner(System.in);

    public static int select(String prompt, Object... options) {
        StringBuilder menu = new StringBuilder(prompt);
        for (int i = 0; i < options.length; i++) {
            menu.append("\n").append(i).append(", ").append(options[i]);
        }

        int selection = getInteger(menu.toString());
        if (selection >= 0 && selection < options.length) return selection;
        else {
            System.out.println("ERROR: Invalid selection");
            return select(prompt, options);
        }
    }

    public static Date getDate(String prompt) {
        SimpleDateFormat parser = new SimpleDateFormat("dd-MM-yyyy HH:mm");

        System.out.printf("%n%s%nEnter date in following format: 27-04-2020 18:45%n> ", prompt);

        try {
            return parser.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("ERROR: Invalid date entered");
            return getDate(prompt);
        }
    }

    public static int getInteger(String prompt) {
        System.out.printf("%n%s%n> ", prompt);

        try {
            int input = scanner.nextInt();
            scanner.nextLine();
            return input;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("ERROR: Please enter a valid integer");
            return getInteger(prompt);
        }
    }

    public static String getString(String prompt) {
        System.out.printf("%n%s%n> ", prompt);

        String input = scanner.nextLine();

        if (input.equals("")) {
            System.out.println("ERROR: Please enter a valid text");
            return getString(prompt);
        } else {
            return input;
        }
    }
}
