import java.util.*;
public class Java4_8BreakStatement {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I'm out of the loop");


        //Keep printing numbers till user enters a multiple of 10

        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter your numbers :");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
