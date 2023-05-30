/*
public class FINAL {
    public static void main(String[] args) {
        
        // Declare a final variable
        final int number = 5;
        System.out.println("The value of the final variable is: " + number);
        
        // Declare a final class variable
        final String message = "Hello, world!";
        System.out.println(message);
    }
}
*/

public class FINAL {
    public static void main(String[] args) {
        
        // Create an instance of the MyNumber class
        MyNumber number = new MyNumber(5);
        
        // Call the getSquare method
        System.out.println("The square of " + number.getNumber() + " is " + number.getSquare());
    }
}

class MyNumber {
    private final int number;
    
    public MyNumber(int number) {
        this.number = number;
    }
    
    // Define a final method that returns the square of the number
    public final int getSquare() {
        return number * number;
    }
    
    // Define a method that returns the number
    public int getNumber() {
        return number;
    }
}