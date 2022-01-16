package javase_exam_1.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TerminalInput {

    private static final Scanner scanner = new Scanner(System.in);

    public static int select(String prompt, String...options) {
        String menu = prompt;
        for (int i = 0; i < options.length; i++) {
            menu +="\n" + i + ", " + options[i] ;
        }

        int selection = getInteger(menu);
        if(selection < options.length) return selection;
        else {
            System.out.println("ERROR: Invalid selection");
            return select(prompt, options);
        }
    }

    public static int getInteger(String prompt) {
        System.out.print("\n" + prompt + "\n> ");

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
        System.out.print("\n" + prompt + "\n> ");

        String input = scanner.nextLine();

        if (input.equals("")) {
            System.out.println("ERROR: Please enter a valid text");
            return getString(prompt);
        } else {
            return input;
        }
    }

}
