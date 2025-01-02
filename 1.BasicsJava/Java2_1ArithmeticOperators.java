//   ----------- Binary Operators---------------
import java.util.*;
public class Java2_1ArithmeticOperators {
    public static void main(String[] args) {
        int A=10;
        int B=6;
        System.out.println("Sum= "+(A+B));
        System.out.println("Difference= "+(A-B));
        System.out.println("Product= "+(A*B));
        System.out.println("Quotient= "+(A/B));
        System.out.println("Remainder= "+(A%B));

//   -------------Unary Operators----------------
        // pre Increment
        int a=10;
        int b=++a;
        System.out.println(a);
        System.out.println(b);

        // post Increment
        int c=10;
        int d=c++;
        System.out.println(c);
        System.out.println(d);

        // pre Decrement
        int x=15;
        int y=--x;
        System.out.println(x);
        System.out.println(y);

        // post Decrement
        int u=15;
        int v=u--;
        System.out.println(u);
        System.out.println(v);

    }
}
