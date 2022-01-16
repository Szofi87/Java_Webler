package runnablelist;

public class RunnableNode {
    private Runnable runnable;
    private RunnableNode next;

    public RunnableNode(Runnable runnable, RunnableNode next) {
        this.runnable = runnable;
        this.next = next;
    }

    public Runnable getRunnable() {
        return runnable;
    }

    public void setRunnable(Runnable runnable) {
        this.runnable = runnable;
    }

    public RunnableNode getNext() {
        return next;
    }

    public void setNext(RunnableNode next) {
        this.next = next;
    }

    public void schedule(Runnable runnable) {
        if(next == null) {
            next = new RunnableNode(runnable, next);
        } else {
            next.schedule(runnable);
        }
    }

    public void run() {
        runnable.run();
        if(next != null) {
            this.next.run();
        }
    }
}
