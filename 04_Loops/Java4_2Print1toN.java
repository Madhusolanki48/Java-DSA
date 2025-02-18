import java.util.*;
public class Java4_2Print1toN {
    public static void main(String[] args) {
        //Print Numbers from 1 to 10
        int count = 1;
        while (count <= 10) {
            System.out.print(count +" ");
            count++;
        }

        System.out.println();
        // Print Numbers from 1 to n taking user input
        Scanner sc=new Scanner(System.in);
        int counter=1;
        System.out.println("Enter a range of numbers to be print :");
        int range=sc.nextInt();
        while(counter<=range){
            System.out.print(counter +" ");
            counter++;
        }

    }
}
