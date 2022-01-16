import java.util.Date;

public class Timer {

    public void schedule(Date date, Runnable runnable) {
        new Thread(() -> {
            while(new Date().before(date)) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            runnable.run();
        }).start();
    }

}
