import java.util.*;

public class area {
    static double triangle(double h, double b){
        return (0.5*h*b);
    }

    static float square(float hand){
        return (hand*hand);
    }

    static float rectangle(float l, float s){
        return (l*s);
    }

    public static void main(String[] args){
        double ht, bt, rt;
        float lr, sr, rr;
        float hs, rs;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter height: ");
        ht=sc.nextDouble();
        System.out.println("Enter base: ");
        bt=sc.nextDouble();
        rt=triangle(ht, bt);
        System.out.println("Area is: "+rt);
        System.out.println("Enter hand of square: ");
        hs=sc.nextFloat();
        rs=square(hs);
        System.out.println("Area is: "+rs);
        System.out.println("Enter length: ");
        lr=sc.nextFloat();
        System.out.println("Enter side: ");
        sr=sc.nextFloat();
        rr=rectangle(lr, sr);
        System.out.println("Area is: "+rr);

        sc.close();
    }
}
