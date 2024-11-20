package Question_3;
public class PolymorphismMain {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Buddy"),
            new Cat("Kitty"),
            new Bird("Tweety")
        };

        interactWithAnimal(new Dog("Rex"));
        interactWithAnimal(new Cat("Whiskers"));

        System.out.println("--- Animals in the Collection ---");
        for (Animal animal : animals) {
            animal.makeSound(); 
            animal.eat();
            
            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Cat) {
                ((Cat) animal).climb();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
            System.out.println();
        }
    }

    public static void interactWithAnimal(Animal animal) {
        System.out.println("Interacting with " + animal.getName() + ":");
        animal.makeSound();
        animal.eat();
    }
}