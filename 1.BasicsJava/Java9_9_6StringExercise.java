import java.util.*;
import java.util.Arrays;
public class Java9_9_6StringExercise {
    //Ques1. Count how many times lowercase vowels occurred in a String entered by the user.
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Count of vowels is :" + count);

        //Ques2. What will be the output of the code
        String str1 = "ShradhaDidi";
        String str2 = "ApnaCollege";
        String str3 = "ShradhaDidi";
        System.out.println(str.equals(str2) + " " + str.equals(str3));

        //Ques3. What will be the output of the following code
        String str4 = "ApnaCollege".replace("l", "");
        System.out.println(str4);

        /*Determine if 2 Strings are anagrams of each other.
        What are anagrams?
        If two strings contain the same characters but in a different order, they can be said to be anagrams.
        Consider race and care in this case race's characters can be formed into a study or care's characters
        can be formed into rane Below is a java program to check if two strings are anagrams or not.
        */
        String str5 = "earth";

        String str6 = "heart";
        //Convert Strings to lowercase. Why? so that we don't have to check separately for lower & uppercase.
        str5 = str5.toLowerCase();
        str6 = str6.toLowerCase();
        //First check-if the lengths are the same
        if (str5.length() == str6.length()) {
            //convert strings into char array
            char[] str5charArray = str5.toCharArray();
            char[] str6charArray = str6.toCharArray();

            //sort the char array
            Arrays.sort(str5charArray);
            Arrays.sort(str6charArray);

            //if the sorted char arrays are same or identical then the strings are anagrams.

            boolean result = Arrays.equals(str5charArray, str6charArray);
            if (result) {
                System.out.println(str5 + " and " + str6 + " are anagrams of each other.");
            } else {
                System.out.println(str5 + " and " + str6 + " are not anagrams of each other.");
            }
        }
            else{
                //case when lenths are not equal
                System.out.println(str5 + " and " + str6 + " are not anagrams of each other.");
            }
        }

    }

