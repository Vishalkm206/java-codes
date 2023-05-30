import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Charlie");
        names.add("Bob");
        names.add("Dave");

        System.out.println("Unsorted names: " + names);

        Collections.sort(names);

        System.out.println("Sorted names: " + names);
    }
}
