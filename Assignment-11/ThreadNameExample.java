public class ThreadNameExample {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Task is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task is complete.");
        });

        thread.setName("MyThread");

        System.out.println("Starting thread " + thread.getName() + "...");
        thread.start();
    }
}
