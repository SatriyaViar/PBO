package Question_3;
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow~");
    }

    // Unique behavior
    public void climb() {
        System.out.println(getName() + " is climbing the tree!");
    }
}