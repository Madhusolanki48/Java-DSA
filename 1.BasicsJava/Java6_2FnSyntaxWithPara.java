import java.util.*;
public class Java6_2FnSyntaxWithPara {
    public static void calculateSum(int num1, int num2){
        int sum=num1 + num2;
        System.out.println("Sum of num1 & num2 = " +sum);

        /*public static int calculateSum(int num1, int num2){
        int sum=num1+num2;
        return sum;
         */

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number a : ");
        int a=sc.nextInt();
        System.out.println("Enter a number b : ");
        int b=sc.nextInt();

        /*int sum=calculateSum(a,b)
        System.out.println("Sum is : "+sum);
         */
        calculateSum(a, b);
    }
    }

