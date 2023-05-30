import java.util.Scanner;

class result {
    String name;
	int marks;

    result(String name,int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("\nName: " + name + "\nMarks: "+marks);
    }
}

public class marks{

    public static void main(String[] args) {
		int a,b;
		String s1, s2;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and marks of 1st student: ");
		s1=sc.next();
		a=sc.nextInt();
		System.out.println("Enter name and marks of 2nd student: ");
		s2=sc.next();
		b=sc.nextInt();
		result student1 = new Demo(s1,a);
        result student2 = new Demo(s2,b);
        student1.display();
        student2.display();
		if (a > b) {
            System.out.println("\n"+s1 + " has got higher marks");
        } else if (b > a) {
            System.out.println("\n"+s2 + " has got higher marks");
        } else {
            System.out.println("\nBoth student has got same marks");
        }
        
    }
}
