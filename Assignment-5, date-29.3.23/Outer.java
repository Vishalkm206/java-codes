class outer {
    private int num;

    public outer(int num) {
        this.num = num;
    }

    public void printNum() {
        System.out.println("The value of num in Outer is: " + num);
    }

    class Inner {
        private int innerNum;

        public Inner(int innerNum) {
            this.innerNum = innerNum;
        }

        public void printInnerNum() {
            System.out.println("The value of innerNum in Inner is: " + innerNum);
            System.out.println("The value of num in Outer is: " + num);
        }
    }

    public static void main(String[] args) {
        outer outer = new outer(5);
        outer.printNum();

        outer.Inner inner = outer.new Inner(10);
        inner.printInnerNum();
    }
}
