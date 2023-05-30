public class TryCatchFinally {

    public static void main(String[] args) {
        try {
            // Some code that might throw an exception
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[1]);
            System.out.println(arr[3]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            // Handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Code that will always execute, whether an exception was thrown or not
            System.out.println("Finally block executed");
        }
    }
}
