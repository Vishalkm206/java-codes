import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<>();

        myHashSet.add("Apple");
        myHashSet.add("Banana");
        myHashSet.add("Orange");

        System.out.println("Elements in HashSet: " + myHashSet);

        myHashSet.remove("Banana");

        System.out.println("Elements in HashSet after removal: " + myHashSet);
    }
}

