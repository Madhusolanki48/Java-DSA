//----------Print Largest of three Numbers---------
import java.util.*;
public class Java3_6LargestOf3Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int A=3,B=7,C=4;
       if((A>=B) && (A>=C)){
           System.out.println("A is Largest ");
       }else if(B>=C){
           System.out.println("B is Largest");
       }else{
           System.out.println("C is Largest");
       }
    }
}
