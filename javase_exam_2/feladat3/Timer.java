package potvizsga.feladat3;

import java.util.ArrayList;
import java.util.Scanner;

public class Timer {

    private static ArrayList<Thread> threads = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int input = TerminalInput.select("Timer Application", "Set Reminder", "Set Repeating Timer","Delete all timers","Animated text", "Exit");
        switch (input) {
            case 0:
                String message = TerminalInput.getString("Message");
                int delay = TerminalInput.getInteger("Delay");

                Thread t = new Thread(() -> {
                    try {
                        Thread.sleep(delay * 1000 * 60);
                        System.out.println(message);
                    } catch (InterruptedException e) {
                        System.out.println("Timer Cancelled");
                    }
                });

                t.start();
                threads.add(t);

                // 1. ask user for a reminder message
                // 2. ask user for a time in minutes
                // 3. start a thread in the background and print the reminder message after the given number of minutes passed
                // TODO implement
                break;
            case 1:
                message = TerminalInput.getString("Message");
                delay = TerminalInput.getInteger("Delay");
                int count = TerminalInput.getInteger("Count");

                Thread t2 = new Thread(() -> {
                    try {
                        for (int i = 0; i < count; i++) {
                            Thread.sleep(delay * 1000 * 60);
                            System.out.println(message);
                        }
                    } catch (InterruptedException e) {
                        System.out.println("Repeating Timer Cancelled");
                    }
                });

                t2.start();
                threads.add(t2);

                // 1. ask user for a reminder message
                // 2. ask user for a time in minutes
                // 3. ask the user how many times they want to receive the notification
                // 4. start a thread in the background and print the reminder message after the given number of minutes passed
                // 5. keep reminding the user every X minutes N times
                // TODO implement
                break;
            case 2:
                for (Thread thread : threads) {
                    if(thread.isAlive()) thread.interrupt();
                }
                // This option should cancel/delete all currently set timers/repeating timers
                break;
            case 3:
                message = TerminalInput.getString("Message");
                // 1. Ask the user for a text input
                // 2. Print the text letter by letter from left to right. The time between two letters appearing should be 250ms

                Thread t3 = new Thread(() -> {
                    for (int i = 0; i < message.length(); i++) {
                        try {
                            Thread.sleep(250);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.print(message.charAt(i));
                    }
                });

                t3.start();
                break;
            case 4:
                System.out.println("Exiting in 10 seconds. Press enter to cancel.");
                Thread t4 = new Thread(() -> {
                    try {
                        Thread.sleep(10000);
                        System.exit(0);
                    } catch (InterruptedException e) {
                        System.out.println("Exit cancelled");
                    }
                });
                t4.start();
                new Scanner(System.in).nextLine();
                t4.interrupt();

                // 1. tell the user that the program will exit in 10 seconds
                // 2. allow the user to press enter
                // 3. if the user press enter cancel the exiting process
                // 4. if the user does not press enter exit the application
                // TODO implement
                break;
        }
        menu();
    }
}
