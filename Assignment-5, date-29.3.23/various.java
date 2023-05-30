public class various {
    int num;
    String str;

    various(int num) {
        this.num = num;
        this.str = "Hello";
    }

    various(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public void printValues() {
        System.out.println("The value of num is: " + this.num);
        System.out.println("The value of str is: " + this.str);
    }

    public void setValues(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public static void main(String[] args) {
        various example1 = new various(5);
        example1.printValues();

        various example2 = new various(10, "World");
        example2.printValues();

        example1.setValues(7, "Hi");
        example1.printValues();

        example2.setValues(15, "Goodbye");
        example2.printValues();
    }
}
