package Question_3;
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof! Woof!");
    }

    // Unique behavior
    public void fetch() {
        System.out.println(getName() + " is fetching the ball!");
    }
}