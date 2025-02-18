import java.util.*;
public class Java3_9_0Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Ques1.Write a Java program to get a number from the user and
         print whether it is positive or negative
         */
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The given number is positive.");
        } else {
            System.out.println("The given number is negative.");

        }

        /* Ques2. Finish the following code so that it prints You have a fever if your temperature is above 100
        and otherwise prints You don't have a fever.
        double temp=103.5;
         */

        double temp = 103.5;
        if (temp > 100) {
            System.out.println("You hava a fever !!!");
        } else {
            System.out.println("You don't have a fever !!!");
        }

        /*Ques3. Write a java program to input week number(1-7) &
        print day of week name using switch case.
         */

        System.out.println("Enter the day number(1-7) :");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Funday");
        }

        // Ques4. Output of the code
        int a=63 , b=36;
        boolean x = (a<b) ? true : false;
        int y = (a>b) ? a : b;
        System.out.println(x +","+ y);
        // Ans. false,63

        /*Ques5. Write a java program that takes a year from the user &
        print whether that year is a leap or not
         */
        System.out.println("Enter a year :");
        int year=sc.nextInt();
        if(((year % 4 == 0) && (year % 100 !=0)) || (year %400==0)) {
                System.out.println("The Year is a Leap Year !!!");
        }else{
            System.out.println("The Year is not a Leap Year !!!");
        }
    }

}
