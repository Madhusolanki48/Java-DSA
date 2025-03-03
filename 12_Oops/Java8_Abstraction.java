public class Java8_Abstraction {
    public static void main(String[] args) {
        // Horse h=new Horse();
        // h.eat();
        // h.walk();

        // Chicken c=new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(h.color);

        Mustang myHorse=new Mustang();
        //Animal->Horse->Mustang

    //    Animal a=new Animal();   can't make object of instance class
    }
}
 abstract class Animal{
    String color;
    Animal(){
        color="brown";
        System.out.println("Animal Constructor called.");
    }
    void eat(){
        System.out.println("Animal eats.");
    }
    abstract void walk();
 }

 class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void changeColor(){
        color="Dark Brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs.");
    }
 }

 class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called");
    }
 }

 class Chicken extends Animal{
    void changeColor(){
        color="Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs.");

    }
 }