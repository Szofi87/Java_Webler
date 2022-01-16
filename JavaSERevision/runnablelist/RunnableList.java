package runnablelist;

public class RunnableList {
    private RunnableNode head;

    public void schedule(Runnable runnable) {
        if(head == null) {
            head = new RunnableNode(runnable, null);
        } else {
            head.schedule(runnable);
        }
    }

    public void run(){
        if(head != null) {
            head.run();
        }
    }
}
