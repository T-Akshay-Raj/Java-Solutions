package java_essentials.polymorphism;

public class AnimalTest {
  public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.makeSound();// woof woof

    Animal leo = new Dog();
    leo.makeSound();
    leo.run();//running..
    // leo.fetch();//Error as fetch is not known to Animal - It should be type casted

    //Type casting example
    // Upcasting
    ((Dog) leo).fetch(); //Play Fetch

    //Down casting:
    Dog rolex = (Dog) leo;
    rolex.fetch();// woof woof
    rolex.run();//running..
    rolex.makeSound();// woof woof

    leo = new Cat();
    leo.makeSound(); //Mewo..

    //Using instanceOf which returns true or false. InstanceOf return true if object created is of type child and checked with Child class or parent class
    System.out.println(
        leo instanceof Dog); //false as it assigned with type cat at line 24
    System.out.println(leo instanceof Animal);//true
    System.out.println(rolex instanceof Dog);//true
    System.out.println(rolex instanceof Animal);//true

    //Object of type parent will return false when check with child type
    Animal horse = new Animal();
    System.out.println(horse instanceof Dog);//False
    System.out.println(horse instanceof Cat);//False

    //Class cast exception when trying to cast cat object to dog, as dog is not a subtype or child of cat
    Animal kindle = new Cat();
    //Dog shadow = (Dog) kindle;//Class cast exception
    // shadow.run();

    feedFood(leo); //Cat Food
    feedFood(rolex);//Dog Food
    feedFood(kindle);//Cat Food
    feedFood(horse);//Common Food

  }

  static void feedFood(Animal animal) {
    if (animal instanceof Dog) {
      System.out.println("Dog food");
    } else if (animal instanceof Cat) {
      System.out.println("Cat Food");
    } else {
      System.out.println("Common food");
    }

  }
}

