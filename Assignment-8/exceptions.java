public class exceptions {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int x = 5 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
            
        try {
            // NullPointerException
            String s = null;
            int len = s.length();
            System.out.println(len);
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
            
        try {
            // ArrayIndexOutOfBoundsException
            int[] arr = new int[3];
            int element = arr[3];
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
            
        try {
            // NumberFormatException
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
            
        try {
            // ClassNotFoundException
            Class.forName("com.example.nonexistentclass");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
