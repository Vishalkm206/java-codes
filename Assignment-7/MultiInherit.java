public class MultiInherit {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculate();
        circle.calculateArea();
    }
}

interface circum {
    void calculate();
}

interface area {
    void calculateArea();
}

class Circle implements circum, area {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    //Override
    public void calculate() {
        System.out.println("Circumference is: "+2*Math.PI*r);
    }

    //Override
    public void calculateArea() {
        System.out.println("Area of circle: " +(Math.PI)*Math.pow(r, 2));
    }
}
