import java.util.Scanner;

public class StringComparison{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the two strings: ");
        String s1 = sc.nextLine();
        
        //System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();

        System.out.println("Using '== ' ");
        if(s1==s2)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
        
        System.out.println("Using 'compareTo()' method ");
        int cmp = s1.compareTo(s2);
        if(cmp>0)
            System.out.println("First string is greater");
        else if(cmp<0)
            System.out.println("First string is smaller");
        else
            System.out.println("Both strings are equal");

        System.out.println("Using 'equals()' method ");
        if(s1.equals(s2))
            System.out.println("Both strings are equal");
        else
            System.out.println("Strings are not equal");

        sc.close();
    }
}