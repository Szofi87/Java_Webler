package ConsoleListener;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Console {

    private Scanner scanner = new Scanner(System.in);
    private Thread thread;
    private List<ConsoleEventListener> eventListeners = new ArrayList<>();

    public Console() {
        thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " started");
            while (!Thread.currentThread().isInterrupted()) {
                String input = scanner.nextLine();
                ConsoleEvent consoleEvent = new ConsoleEvent(new Date().getTime(), input);
                for (ConsoleEventListener eventListener : eventListeners) {
                    eventListener.event(consoleEvent);
                }
            }
        }, "Console Listener Thread");
        thread.start();
    }

    public void triggerConsoleEvent(String string) {
        ConsoleEvent consoleEvent = new ConsoleEvent(new Date().getTime(), string);
        for (ConsoleEventListener eventListener : eventListeners) {
            eventListener.event(consoleEvent);
        }
    }

    public void addConsoleEventListener(ConsoleEventListener consoleEventListener) {
        eventListeners.add(consoleEventListener);
    }

    public void stop(){
        thread.interrupt();
    }

}
