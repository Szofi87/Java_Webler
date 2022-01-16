package ConsoleListener;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        console.addConsoleEventListener(consoleEvent -> System.out.println("Console event triggered"));
        console.addConsoleEventListener(Main::handleConsoleEvent);
        console.addConsoleEventListener(consoleEvent ->  {
            if(consoleEvent.getInput().equals("exit")){
                console.stop();
            }
        });

        new Thread(() -> {
            console.triggerConsoleEvent("This is a test input");
        }, "Testing Thread").start();

    }

    static void handleConsoleEvent(ConsoleEvent consoleEvent) {
        System.out.println("%s - user entered: \"%s\"".formatted(new Date(consoleEvent.getTime()), consoleEvent.getInput()));
    }
}
