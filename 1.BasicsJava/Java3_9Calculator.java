import java.util.*;
public class Java3_9Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a=sc.nextInt();
        System.out.println("Enter other number :");
        int b=sc.nextInt();
        System.out.println("Enter a operator :");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+' :
                System.out.println("Sum = " +(a+b));
                break;
            case '-':
                System.out.println("Difference = "+(a-b));
                break;
            case '*':
                System.out.println("Product = "+(a*b));
                break;
            case '/':
                System.out.println("Quotient = "+(a/b));
                break;
            case '%':
                System.out.println("Remainder = "+(a%b));
                break;
            default:
                System.out.println("Wrong Operator");

        }


    }
}
