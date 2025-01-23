// Parent class
class Animal {
    String name = "Animal";

    void sound() {
        System.out.println("Animals make sound.");
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";

    void sound() {
        super.sound(); // Call the parent class method
        System.out.println("Dogs bark.");
    }

    void displayNames() {
        System.out.println("Name in child class: " + name); // Access child class variable
        System.out.println("Name in parent class: " + super.name); // Access parent class variable
    }
}

// Main class
public class Super {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();        // Call the overridden method
        dog.displayNames(); // Display names from both classes
    }
}
