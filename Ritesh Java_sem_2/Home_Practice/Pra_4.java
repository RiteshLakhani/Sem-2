//Demonstrate the use of Super Keyword 

public class Pra_4 {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy", "Labrador");
        d.makeSound(); // calling the overridden method
        d.printNameAndBreed(); // calling the child and parent class methods
    }
}

class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void makeSound() {
        System.out.println("Animal sound");
    }
    
    public void printName() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name); // calling the parent class constructor with 'super'
        this.breed = breed;
    }
    
    public void makeSound() {
        System.out.println("Bark");
    }
    
    public void printBreed() {
        System.out.println("Dog breed: " + breed);
    }
    
    public void printNameAndBreed() {
        super.printName(); // calling the parent class method with 'super'
        printBreed(); // calling the child class method
    }
}