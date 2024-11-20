package Question_3;
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method for polymorphism
    public abstract void makeSound();

    // Shared behavior
    public void eat() {
        System.out.println(name + " is eating...");
    }
}