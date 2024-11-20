package Question_3;
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps: Tweet~ Tweet~");
    }

    // Unique behavior
    public void fly() {
        System.out.println(getName() + " is flying high in the sky!");
    }
}
