public class Java9_3OopsExercise {
    public static void main(String[] args){
        /* Ques1. Print the sum, difference, and product of two complex numbers by creating a
           class named 'Complex' with separate methods for each operation, 
           whose real & imaginary parts are entered by the user. */
        
        Complex c = new Complex(6, 3);
        Complex d = new Complex(4, 3);
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);
        
        e.printComplex();
        f.printComplex();
        g.printComplex();

        final CarModel car = new ElectricCar();
        System.out.println(car.drive());

        new BlueCar();
    }
}


class Complex {
    int real, img;
    
    public Complex(int r, int i) {
        real = r;
        img = i;
    }
    
    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.img + b.img));
    }
    
    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.img - b.img));
    }
    
    public static Complex product(Complex a, Complex b) {
        return new Complex((a.real * b.real) - (a.img * b.img), ((a.real * b.img) + (a.img * b.real)));
    }
    
    public void printComplex() {
        if (real == 0 && img != 0) {
            System.out.println(img + "i");
        } else if (img == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + img + "i");
        }
    }
}

// Ques2. Output of the program
class Automobile {
    protected String drive() {  
        return "Driving vehicle";
    }
}

class CarModel extends Automobile { 
    @Override
    protected String drive() {
        return "Driving car";
    }
}

class ElectricCar extends CarModel {
    @Override
    public final String drive() {  
        return "Driving electric car";
    }
}

// Ques3. Output of the program
abstract class AbstractCar { 
    static {
        System.out.print("1");
    }
    public AbstractCar(String name) { 
        System.out.print("2");
    }
    {
        System.out.print("3");
    }
}

class BlueCar extends AbstractCar {
    {
        System.out.print("4");
    }
    public BlueCar() {
        super("blue"); 
        System.out.print("5");
    }
}
