package ConsoleListener;

public class ConsoleEvent {
    private long time;
    private String input;

    public ConsoleEvent(long time, String input) {
        System.out.println("Console Event created in " + Thread.currentThread().getName());
        this.time = time;
        this.input = input;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
