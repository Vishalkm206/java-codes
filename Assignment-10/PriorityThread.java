public class PriorityThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        PriorityThread myThread = new PriorityThread();
        System.out.println("Default thread priority: " + myThread.getPriority());

        myThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("New thread priority: " + myThread.getPriority());

        myThread.start();
    }
}
