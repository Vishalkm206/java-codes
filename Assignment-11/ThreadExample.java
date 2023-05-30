public class ThreadExample {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Task 1 is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 1 is complete.");
            
            System.out.println("Task 2 is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2 is complete.");
            
            System.out.println("Task 3 is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 3 is complete.");
        });

        thread.start();
    }
}
