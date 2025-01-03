// -------------Print if a number is even or odd-----------
import java.util.*;
public class Java3_3EvenOddNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Number is even.");
        }else{
            System.out.println("Number is odd. ");
        }

    }
}
