import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector<String> myVector = new Vector<>();

        myVector.add("Apple");
        myVector.add("Banana");
        myVector.add("Orange");

        System.out.println("Elements in Vector: " + myVector);

        myVector.remove("Banana");

        System.out.println("Elements in Vector after removal: " + myVector);
    }
}
