import java.util.*;
public class Java3_4ElseIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of a person :");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }else if(age>=13 && age<18){
            System.out.println("Teenager");
        }else{
            System.out.println("Child");
        }
    }
}
