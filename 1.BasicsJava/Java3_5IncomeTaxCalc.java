//---------Income Tax Calculator----------
import java.util.*;
public class Java3_5IncomeTaxCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income :");
        int income=sc.nextInt();
        int tax;
        if(income<500000){
           tax=0;
        }else if(income>=500000 && income<=1000000){
           tax=(int) (income*0.2);
        }else{
            tax=(int)(income*0.3);
        }
        System.out.println("Tax paid = "+tax);
    }
}
