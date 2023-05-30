import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer("Orange");
        priorityQueue.offer("Banana");
        priorityQueue.offer("Apple");

        System.out.println("Elements in priority queue: " + priorityQueue);

        String element = priorityQueue.poll();
        System.out.println("Removed element: " + element);

        System.out.println("Elements in priority queue: " + priorityQueue);
    }
}
