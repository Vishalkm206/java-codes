import java.util.ArrayList;

public class ArrayListSearchExample {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        String searchElement = "Banana";
        boolean found = false;

        // Iterate through the ArrayList to check if the search element is present
        for (String element : myList) {
            if (element.equals(searchElement)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchElement + " is present in the ArrayList");
        } else {
            System.out.println(searchElement + " is not present in the ArrayList");
        }
    }
}
