public class Java5_Inheritance{
    public static void main(String[] args){
        Fish shark= new Fish();
        shark.eat();
        Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);

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

    //Multiple Inheritance
    class Mammal extends Animal{
        int legs;
    }
    class Dog extends Mammal{
        String breed;
    }

    //Derived class
    class Fish extends Animal{
        int fins;

        void swim(){
            System.out.println("swims in water");
        }
    }