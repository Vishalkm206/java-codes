import java.util.Scanner;

class Demo {
    String name;
	int age;

    Demo(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("\nName: " + name + "\nAge: "+age);
    }
}

public class student{

    public static void main(String[] args) {
		int a,b;
		String s1, s2;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and age of 1st student: ");
		s1=sc.next();
		a=sc.nextInt();
		System.out.println("Enter name and age of 2nd student: ");
		s2=sc.next();
		b=sc.nextInt();
		Demo student1 = new Demo(s1,a);
        Demo student2 = new Demo(s2,b);
        student1.display();
        student2.display();
		if (a > b) {
            System.out.println("\n"+s1 + " is elder");
        } else if (b > a) {
            System.out.println("\n"+s2 + " is elder");
        } else {
            System.out.println("\nBoth student has same age");
        }
        
    }
}
