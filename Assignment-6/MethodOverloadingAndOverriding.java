class overloading{
    public void f1(int x,int y){
        System.out.println("Addition is: "+x+y);
    }
    public void f(int a){
        System.out.println("Class Overloading");
    }

}

class overriding{
    public void f(int a){
        System.out.println("Class Overriding");
    }
    public void f1(int x){
        System.out.println("Multiplication is: "+x*x);
    }
}

public class MethodOverloadingAndOverriding {
    public static void main(String[] args){
        overloading a1=new overloading();
        a1.f1(4,5);
        overriding a2=new overriding();
        a2.f(4);
        a2.f1(5);
    }
}
