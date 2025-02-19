import java.util.*;
public class Java1_Strings {
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str1=new String("abcd");

        //Strings are IMMUTABLE i.e. cannot be changed
        System.out.println(arr);
        System.out.println(str);
        System.out.println(str1);

        //Taking Input as String
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter a name : ");
        name=sc.nextLine();

        //Length of a String
        String fullName="Tony Stark";
        System.out.println("The length of string is : "+fullName.length());

        //String Concatenation
        String firstName="Madhu";
        String lastName="Solanki";
        String fullname1=firstName+" "+lastName;
        System.out.println(fullname1);

    }
}
