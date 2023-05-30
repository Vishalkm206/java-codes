class Demo {
    String name;
    int salary;

    Demo(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class employee{

    public static void main(String[] args) {
        Demo employee1 = new Demo("John", 8000);
        Demo employee2 = new Demo("Jenny", 9000);
        
        employee1.display();
        employee1.display();
        
        if (employee1.salary > employee2.salary) {
            System.out.println(employee1.name + " has higher salary");
        } else if (employee1.salary < employee2.salary) {
            System.out.println(employee2.name + " has higher salary");
        } else {
            System.out.println("Both employee has same salary");
        }
    }
}
