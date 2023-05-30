import java.util.LinkedHashSet;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet<>();

        myLinkedHashSet.add("Apple");
        myLinkedHashSet.add("Banana");
        myLinkedHashSet.add("Orange");

        System.out.println("Elements in LinkedHashSet: " + myLinkedHashSet);

        myLinkedHashSet.remove("Banana");

        System.out.println("Elements in LinkedHashSet after removal: " + myLinkedHashSet);
    }
}

