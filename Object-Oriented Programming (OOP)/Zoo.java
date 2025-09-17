// Parent class
class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class inheriting Animal
class Dog extends Animal {
    // Method overriding
    void sound() {
        System.out.println("Bark");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();  // Polymorphism

        myAnimal.sound();  // Output: Some generic animal sound
        myDog.sound();     // Output: Bark (overridden method)
    }
}
