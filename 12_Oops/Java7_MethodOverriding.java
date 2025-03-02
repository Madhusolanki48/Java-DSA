public class Java7_MethodOverriding {
    public static void main(String[] args) {
        Deer d=new Deer();  
        d.eat();      //calls the function of deer class only
        
    } 
}

class Animal{
    void eat(){
        System.out.println("eats everything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }

}


