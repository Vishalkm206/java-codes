class Example {
    // Declare a static variable
    static int num=0;

    // Declare a static method
    static void increment() {
        num++;
    }

    public static void main(String[] args) {
        // Call the static method multiple times
        increment();
        increment();
        increment();

        // Print the value of the static variable
        System.out.println("The value of num is: " + num);
    }
}
