public class example {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("Task 1 is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 1 is complete.");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Task 2 is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2 is complete.");
        });

        thread1.start();
        thread1.join(); // wait for thread1 to complete before moving on
        thread2.start();
    }
}
