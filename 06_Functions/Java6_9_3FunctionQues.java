import java.util.*;
public class Java6_9_3FunctionQues {
    //Ques1. Write a java method to compute the avg of three numbers
//    public static float averageOf3Nums(float a,float b,float c) {
//        return (a + b + c) / 3;


        /*Ques2. Write a program named isEven that accepts an int argument.
        The method should return true if the argument is even,or false otherwise.
        Also write a program to test your method.
         */
//        public static boolean isEven(int n){
//            if(n % 2 == 0) {
//                return true;
//            } else {
//                return false;
//            }
//        }


    /*Ques3. Write a java program to check if a number is a palindrome in java.
     */
//    public static boolean isPalindrome(int num) {
//        int originalNum = num;
//        int reversedNum = 0;
//        while (originalNum != 0) {
//            int remainder = originalNum % 10;
//            reversedNum = reversedNum * 10 + remainder;
//            originalNum = originalNum / 10;
//        }
//        if (num == reversedNum) {
//            return true;
//        } else {
//            return false;
//        }
//    }


    //Ques4. Write a java method to compute the sum of the digits in an integer.
    public static int sumOfDigits(int number){
    int sum=0;
    while(number>0){
        int lastDigit=number%10;
        sum = sum+lastDigit;
        number=number/10;

    }
    return sum;
    }



        public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
//        System.out.println("Input the value of a : ");
//        float a=sc.nextFloat();
//        System.out.println("Input the value of b : ");
//        float b=sc.nextFloat();
//        System.out.println("Input the value of c : ");
//        float c=sc.nextFloat();
//        System.out.println("The Avg of a, b and c is = "+averageOf3Nums(a,b,c));


//        System.out.println("Enter an Integer value : ");
//        int n=sc.nextInt();
//        if(isEven(n)){
//            System.out.println("The Number is Even");
//        }else{
//            System.out.println("The Number is Odd");
//        }


//            System.out.println("Enter a number : ");
//            int num = sc.nextInt();
//            if(isPalindrome(num)) {
//                System.out.println("The number is a palindrome.");
//            } else {
//                System.out.println("The number is not palindrome.");
//            }
//        }


            System.out.println("Enter a Number : ");
            int number = sc.nextInt();
            System.out.println("The sum of digits is = " + sumOfDigits(number));


        }
}

