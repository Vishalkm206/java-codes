import java.util.EmptyStackException;

public class Stack {
    private int[] elements;
    private int top;
    private int size;

    public Stack(int size) {
        elements = new int[size];
        top = -1;
        this.size = size;
    }

    public void push(int element) {
        if (top == size - 1) {
            throw new StackOverflowError();
        }
        elements[++top] = element;
    }

    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        return elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int size() {
        return top + 1;
    }
}

