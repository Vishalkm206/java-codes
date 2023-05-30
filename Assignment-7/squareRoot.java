import java.util.Scanner;

abstract class number{
    protected double r;
    public number(double r){
        this.r=r;
    }
    public abstract void calculate();
}

class square extends number{
    public square(double r){
        super(r);
    }
    public void calculate(){
        System.out.println("Square: "+Math.pow(r, 2));
    }
}

class Squrt extends number{
    public Squrt(double r){
        super(r);
    }
    public void calculate(){
        System.out.println("Square root: "+Math.sqrt(r));
    }
}

class cube extends number{
    public cube(double r){
        super(r);
    }
    public void calculate(){
        System.out.println("Cube: "+Math.pow(r, 3)); 
    }
}

public class squareRoot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double num;
        System.out.print("Enter a number: ");
        num=sc.nextDouble(); 
        square s = new square(num);
        Squrt s1 = new Squrt(num);
        cube c= new cube(num);
        s.calculate();
        s1.calculate();
        c.calculate();
        sc.close();
    }   
}
