class A{
    int z;
    public void f1(){
    }
}

class B extends A{
    int z;
    public void f1(){
        super.f1();
    }
    public void f2(){
        z=2;
        this.z=3;
        super.z=4;
        System.out.println("Main class value: "+super.z);
        System.out.println("Sub class value: "+z);
    }
}

public class Super {
    public static void main(String[] args){
        B obj=new B();
        obj.f1();
        obj.f2();
    }
}
