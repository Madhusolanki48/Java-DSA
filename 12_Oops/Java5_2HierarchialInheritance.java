public class Java5_2HierarchialInheritance {
    public static void main(String[] args) {
        Mammal dog=new Mammal();
        dog.color="Black";
        System.out.println("Mammal color is "+dog.color);
        dog.eat();
        dog.walk();

        Fish starFish=new Fish();
        starFish.color="White";
        System.out.println("StarFish color is "+starFish.color);
        starFish.breathe();
        
    }
    
}

//Base class
class Animal{
    String color;
    
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
