/**
 * Created by Zsuzska on 2016. 11. 15..
 */
public class Workshop03 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println("Testing Animal");
        animal.speak();
        animal.sleep();
        System.out.println(animal.toString());
        // how does it speak, sleep, and tell me about its lifeExpectancy and if its a carnivore

        System.out.println("\nTesting Bird");
        bird.speak();
        bird.sleep();
        bird.fly();
        System.out.println(bird.toString());

        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore

        System.out.println("\nTesting Dog");
        dog.speak();
        dog.sleep();
        dog.beg();
        dog.eat();
        System.out.println(dog.toString());

        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?


        System.out.println("\nTesting Dog2");
        Animal dog2 = new Dog();
        dog2.speak();
        dog2.sleep();
        dog2.eat();
        dog2.toString();
        System.out.println("Casting dog2 into Y to see if it begs...");
        if (dog2 instanceof Dog){
            Dog y = (Dog)dog2;
            ((Dog) dog2).beg();
            System.out.println("And a dog2 cast as (Dog)" + dog2.toString());
        }

        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?

        System.out.println("\nTesting Dog 'd'");
        System.out.println("WTF is Dog 'd'???");

        // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?

    }
}
