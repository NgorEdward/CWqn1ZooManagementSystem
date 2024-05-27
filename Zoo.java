package vu.animal1;

public class Zoo {
    public static void main(String[] args) {
        // Polymorphism example
        Animal[] animals = {
            new Lion("Simba", 5),
            new Elephant("Dumbo", 10),
            new Monkey("Abu", 3)
        };

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            System.out.println();

            animal.makeSound(2);
            animal.eat("fruit");
            System.out.println();
        }
    }
}
