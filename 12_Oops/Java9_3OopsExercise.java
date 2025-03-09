/*Print the sum, difference and product of two complex numbers by creating a 
class named 'Complex' with separate methods for each operation whose real & img
parts are entered by the user*/

class Complex{
    int real,img;
    public Complex(int r,int i){
        real=r;
        img=i;
    }
    public static Complex add(Complex a,Complex b){
        return new Complex((a.real+b.real),(a.img+b.img));
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.img-b.img));
    }
    public static Complex product(Complex a,Complex b){
        return new Complex((a.real*b.real)-(a.img*b.img),((a.real*b.img)+(a.img*b.real)));
    }
    public void printComplex(){
        if(real==0 && img!=0){
            System.out.println(img+"i");
        }
        else if(img==0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+img+"i");
        }
    }
}
public class Java9_3OopsExercise {
        public static void main(String[] args){
            Complex c=new Complex(6, 3);
            Complex d=new Complex(4, 3);
            Complex e=Complex.add(c,d);
            Complex f=Complex.diff(c,d);
            Complex g=Complex.product(c,d);
            e.printComplex();
            f.printComplex();
            g.printComplex();


        }
    }

    

