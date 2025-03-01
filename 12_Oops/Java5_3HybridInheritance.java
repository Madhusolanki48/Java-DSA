public class Java5_3HybridInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.color = "Black";
        System.out.println("Dog color is " + dog.color);
        dog.eat();
        dog.breathe();
        dog.walk();
        dog.bark();
        Shark shark = new Shark();
        shark.color = "Gray";
        System.out.println("Shark color is " + shark.color);
        shark.eat();
        shark.breathe();
        shark.swim();
        shark.size();
        
    }
}
//Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats Food");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

//Derived class
class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flies");
    }
}

//Derived Subclasses of Mammal

class Dog extends Mammal{
    void bark(){
        System.out.println("Barks");
    }
}

class Cat extends Mammal{
    void meow(){
        System.out.println("Meows");
    }
}

class Human extends Mammal{
    void speak(){
        System.out.println("Speaks");
    }
}
//Derived Subclasses of Fish
class Tuna extends Fish {
    void teeth() {
        System.out.println("Small teeth");
    }
}

class Shark extends Fish {
    void size() {
        System.out.println("Big Size");
    }
}

//Derived Subclass of Bird
class Peacock extends Bird {
    void dance() {
        System.out.println("Dances");
    }
}
