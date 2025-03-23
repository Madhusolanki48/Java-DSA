public class Java9_5RecursionExercise {
    /*Ques1. For a given integer array of size N.You have to find all the occurrances(indices)
     * of a given element(key) and print them.Use Recursion.
     */
    public static void allOccurances(int arr[], int key, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        allOccurances(arr, key, i+1);
    }

    /*Ques2. You are given a number(eg-2019),covert it into a String of english like
     *"two zero one nine". Use a recursive function to solve this problem.
     *Note-The digit of the number will only be in the range 0-9
     and the last digit of a number can't be 0*/

     public static String digits[]={"zero","one","two","three","four","five","six",
                             "seven","eight","nine"};
            public static void printDigits(int num){
                if(num==0){
                    return;
                }
                int lastDigit=num%10;
                printDigits(num/10);
                System.out.print(digits[lastDigit]+" ");
            }
            
    //Ques3. Write a program to find Length of a String using Recursion
    public static int lengthOfString(String str){
        if(str.length()==0){
            return 0;
        }
        return lengthOfString(str.substring(1 ))+1;
    }


    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        allOccurances(arr, key, 0);
        System.out.println();

        
        printDigits(1947);
        System.out.println();


        String str="hello";
        System.out.println(lengthOfString(str));

        
    }
    
}
