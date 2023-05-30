public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Size of stack: " + stack.size());

        System.out.println("Top element: " + stack.pop());
        System.out.println("Top element: " + stack.pop());

        System.out.println("Size of stack: " + stack.size());
    }
}
