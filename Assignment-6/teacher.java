class tinfo{
    String name, degree;
    int age, exp;
    tinfo(String name, int age, String degree, int exp){
        this.name=name;
        this.age=age;
        this.degree=degree;
        this.exp=exp;
    }
    void display(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nQualification: "+degree+"\nExperience: "+exp+" years\nProfession: Teacher\n");
    }
}
class sinfo{
    String name, roll;
    int age;
    sinfo(String name, int age, String roll){
        this.name=name;
        this.roll=roll;
        this.age=age;
    }
    void display(){
        System.out.println("Name: "+name+"\nRoll: "+roll+"\nAge: "+age+"\nProfession: Student\n");
    }
}

public class teacher{
    public static void main(String[] args){
        tinfo t1=new tinfo("Surajit Sen", 34, "PhD in Mathematics", 5);
        tinfo t2=new tinfo("Akash Dutta", 42, "PhD in BioTechnology", 15);
        sinfo s1=new sinfo("Mrinmoy Ghoshal", 20, "22-ECE-78");
        sinfo s2=new sinfo("Tarun Jana", 24, "20-ME-178");
        t1.display();
        t2.display();
        s1.display();
        s2.display();
    }
}