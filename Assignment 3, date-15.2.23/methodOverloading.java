import java.util.*;

class methodOverloading {

    static int sum(int x, int y){
        return (x+y);
    }

    static int sum(int x, int y, int z){
        return (x+y+z);
    }

    static float floatSum(float x, float y){
        return (x+y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, s;
        int a1, b1, c1, s1;
        float a2, b2, s2;
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();
        s = sum(a, b);
        System.out.println("Addition is: " + s);

        System.out.println("Enter 1st number: ");
        a1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b1 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        c1=sc.nextInt();
        s1 = sum(a1, b1, c1);
        System.out.println("Addition is: " + s1);

        System.out.println("Enter 1st number: ");
        a2 = sc.nextFloat();
        System.out.println("Enter 2nd number: ");
        b2 = sc.nextFloat();
        s2 = floatSum(a2, b2);
        System.out.println("Addition is: " + s2);

        sc.close();
    }

}

    
