/**
Main.java

Functionality for testing Virtual Pet classes
*/
public class Main {
    public static void main(String[] args) {
		// Define starting pets
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Luna");

		// Print information about the pets
        System.out.println("Welcome to Virtual AND Pets!");

        dog.bark();
        cat.meow();

        dog.feed();
        cat.play();

        // Demonstrate new dog features
        dog.sit();
        dog.rollOver();

        // Demonstrate new cat feature
        cat.pout();

        dog.showStatus();
        cat.showStatus();
    }
}
