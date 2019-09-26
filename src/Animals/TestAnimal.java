package Animals;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();                //Meow!
        Dog dog1 = new Dog();
        dog1.greeting();                //Woof!
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();             //Wooow!

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();             //Meow!
        Animal animal2 = new Dog();
        animal2.greeting();             //Woof!
        Animal animal3 = new BigDog();
        animal3.greeting();             //Wooow!
//        Animals.Animal animal4 = new Animals.Animal();  //can't create an instance of an abstract class

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;        // I was wrong, this instantiates just fine
        //Animals.Cat cat2 = (Animals.Cat)animal2;      //fail - animal2 is an instance of dog - will not run
        dog2.greeting(dog3);            //wooooooooooof!
        dog3.greeting(dog2);            // I was wrong, because dog3 works, this would be woooooowwwww!
                                        //big dog greeting dog... WHY?
        dog2.greeting(bigDog2);         //wooooooooooof!
        bigDog2.greeting(dog2);         //wooooooowwwww!
        bigDog2.greeting(bigDog1);      //wooooooowwwww!
    }
}
