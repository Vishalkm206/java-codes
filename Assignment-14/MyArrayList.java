import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        System.out.println("Elements in ArrayList: " + myList);

        myList.remove("Banana");

        System.out.println("Elements in ArrayList after removal: " + myList);
    }
}
