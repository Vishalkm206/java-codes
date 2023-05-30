class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog("Fido", 3, "Labrador");
        System.out.println("Dog's name: "+myDog.getName()); // Output: Fido
        System.out.println("Dog's age: "+myDog.getAge()); // Output: 3
        System.out.println("Breed: "+myDog.getBreed()); // Output: Labrador
    }
}