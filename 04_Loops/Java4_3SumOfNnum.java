//-----------Print sum of n natural numbers---------
import java.util.*;
public class Java4_3SumOfNnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            sum +=i;
            i++;
        }
        System.out.println("Sum of first "+n+" natural numbers is "+sum);
    }

}
