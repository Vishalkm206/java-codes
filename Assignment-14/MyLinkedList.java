import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        System.out.println("Elements in LinkedList: " + myList);

        myList.remove("Banana");

        System.out.println("Elements in LinkedList after removal: " + myList);
    }
}
