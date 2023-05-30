abstract class Area{
    public void calculate(){};
}

class rect extends Area{
    int l,b;
    public rect(int l, int b){
        this.l=l;
        this.b=b;
    }
    public void calculate(){
        System.out.println("The area of reactangle is: "+l*b);
    }
}

class square extends Area{
    int b;
    public square(int b){
        this.b=b;
    }
    public void calculate(){
        System.out.println("The area of square is: "+b*b);
    }
}

class tri extends Area {
    int l,b;
    public tri(int l, int b){
        this.l=l;
        this.b=b;
    }
    public void calculate(){
        System.out.println("The area of triangle is: "+(0.5*l*b));
    }
}

public class area {
    public static void main(String[] args){
        rect r= new rect(4,6);
        square s= new square(3);
        tri t = new tri(3,9);

        r.calculate();
        s.calculate();
        t.calculate();
    }
}
