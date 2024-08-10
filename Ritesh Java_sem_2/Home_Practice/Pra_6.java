class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Usage example
public class Pra_6 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.makeSound(); // calling the parent class method
        d.makeSound(); // calling the overridden method
    }
}
