public class Java9_5RecursionExercise {
    /*For a given integer array of size N.You have to find all the occurrances(indices)
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
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,5,6,3};
        int key=3;
        allOccurances(arr, key, 0);
        System.out.println();
    }
    
}
