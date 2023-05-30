class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal {
    //Override
    public void makeSound() {
        System.out.println("The cat says meow");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.makeSound(); // Output: The animal makes a sound
        cat.makeSound(); // Output: The cat says meow
    }
}
