import java.util.ArrayList;

public class ArrayListGetExample {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        int index = 1;

        if (index >= 0 && index < myList.size()) {
            String element = myList.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Invalid index");
        }
    }
}
