import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortExample {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(5);
        myList.add(2);
        myList.add(9);
        myList.add(1);
        myList.add(7);

        System.out.println("Before sorting: " + myList);

        // Sort the ArrayList in ascending order
        Collections.sort(myList);

        System.out.println("After sorting: " + myList);
    }
}

