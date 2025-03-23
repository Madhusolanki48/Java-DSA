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

    /*You are given a number(eg-2019),covert it into a String of english like
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


    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,5,6,3};
        int key=3;
        allOccurances(arr, key, 0);
        System.out.println();

        //Solution 2
        printDigits(1234);
        System.out.println();
    }
    
}
