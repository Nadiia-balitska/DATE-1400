package lesson11AbstractInterface;


public class Main {
    public static void main(String[] args) {
        // Not possible as Animal now is abstract
        // Animal benny = new Animal("Benny");

        Animal passop = new Dog("Passop", false, 0, true);
        Cat mia = new Cat("Mia", true, 0, "Royal Canin");
        // Testing the dog
        // Look what happens when the object has a toString method:
        System.out.println(passop);
        passop.makeSound();
        // Why doesn't his work ?!?
        //passop.fetchTheStick();

        // Testing the cat
        System.out.println(mia);
        mia.makeSound();
        mia.blockViewToScreen();
    }
}