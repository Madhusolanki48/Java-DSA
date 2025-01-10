import java.util.*;
public class Java4_9_1Exercise {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Ques1. How many times 'Hello' is printed ?
        for(int i=0; i<5;i++){
            System.out.println("Hello");
            i+=2;
            //ans. Hello
            //     Hello
        }

        //Ques2.Write a program that reads a set of integers, & then prints the sum of the even and odd integers.
        System.out.println("Enter the number of integers to be input :");
        int num=sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        System.out.println("Enter "+num+" integers : ");
        for(int i=0;i<num;i++){
            int choice=sc.nextInt();
            if(choice %2==0){
                evenSum+=choice;
            }else{
                oddSum+=choice;
            }
            System.out.println("Sum of Even Numbers = "+evenSum);
            System.out.println("Sum of Odd Numbers = "+ oddSum);

        }

        //Ques3.Write a program to find the factorial of any number entered by the user.
        System.out.println("Enter a number : ");
        int num2=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num2;i++){
            fact*=i;

        }
        System.out.println("The Factorial of the given number is : "+fact);


        //Ques4. Write a program to print the multiplication table of a number N,entered by the user
        System.out.println("Enter a number : ");
        int num3=sc.nextInt();
        System.out.println("The multiplication table of "+num3+" is : ");
        for(int i=1;i<=10;i++){
            System.out.println(num3+" * "+ i +" = "+num3*i);
        }



    }
}
