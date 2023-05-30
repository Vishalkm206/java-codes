import java.util.*;

class Student{
    private String name;
    private String roll;
    void setdata(String n, String r){
        name=n;
        roll=r;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
    }
}

class studentData{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Student s1=new Student();
        System.out.println("Enter the name of 1st student: ");
        String str1=sc.nextLine();
        System.out.println("Enter roll number: ");
        String rol1=sc.nextLine();
        s1.setdata(str1,rol1);

        Student s2=new Student();
        System.out.println("Enter the name of 2nd student: ");
        String str2=sc.nextLine();
        System.out.println("Enter roll number: ");
        String rol2=sc.nextLine();
        s2.setdata(str2,rol2);

        Student s3=new Student();
        System.out.println("Enter the name of 3rd student: ");
        String str3=sc.nextLine();
        System.out.println("Enter roll number: ");
        String rol3=sc.nextLine();
        s3.setdata(str3,rol3);

        System.out.println("Details of 1st student: ");
        s1.display();

        System.out.println("Details of 2nd student: ");
        s2.display();

        System.out.println("Details of 3rd student: ");
        s3.display();

        sc.close();
    }
}