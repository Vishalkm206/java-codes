interface cal{
    void area();
}
class rect{
    double l, b;
    public rect(double l, double b){
        this.l=l;
        this.b=b;
    }
    public void circum(){}; 
}

class rectangle extends rect implements cal{
    public rectangle(double l, double b){
        super(l,b);
    }
    
    public void circum(){
        System.out.println("Circumference is: "+2*(l+b));
    }

    public void area(){
        System.out.println("Area of reactangle is: "+l*b);
    }
}

public class MultiInherit2 {
    public static void main(String[] args){
        rectangle r = new rectangle(8, 3);
        r.circum();
        r.area();
    }    
}
