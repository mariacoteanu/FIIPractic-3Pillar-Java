package training2.practic;

class Animal{
    public void makeSound(){
        System.out.println("No sound");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof");
    }

    public void makeSound(String sound){
        System.out.println(sound);
    }
}
class Cat extends Animal{
    public  void makeSound(){
        System.out.println("Meow");
    }
}

public class More {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.makeSound();        //

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        dog1.makeSound();           //
        dog1.makeSound("Ham");      //
        cat1.makeSound();           //

        Animal animal2 = new Dog();
        Animal animal3 = new Cat();
        animal2.makeSound();        //
        animal3.makeSound();        //

        Dog dog2 = (Dog) animal1;
        Dog dog3 = (Dog) animal2;
        Cat cat2 = (Cat) animal3;
        Cat cat3 = (Cat) animal1;
        dog2.makeSound();           //
        dog2.makeSound("Ham");      //
        dog3.makeSound();           //
        dog3.makeSound("Ham");      //
        cat2.makeSound();           //
        cat3.makeSound();           //

        Animal animal4 = (Animal) dog1;
        Animal animal5 = (Animal) cat1;
        animal4.makeSound();        //
        animal5.makeSound();        //
    }
}
