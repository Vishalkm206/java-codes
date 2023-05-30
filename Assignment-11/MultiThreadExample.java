public class MultiThreadExample {

    public static void main(String[] args) {
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

        Thread thread3 = new Thread(() -> {
            System.out.println("Task 3 is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 3 is complete.");
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
