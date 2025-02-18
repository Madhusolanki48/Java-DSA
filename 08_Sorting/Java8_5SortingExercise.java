public class Java8_5SortingExercise {
    /*Use the following sorting algorithms to sort an array in Descending order.
    a. Bubble sort
    b. Selection sort
    c.Insertion sort
    d. Counting sort
    You can use this array as an example:[3,6,2,1,8,7,3,1]
     */

    public static void bubbleSortDescending(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSortDescending(int arr[]){
        for(int turn=0;turn<arr.length;turn++){
            int minPos=turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[turn];
            arr[turn]=arr[minPos];
            arr[minPos]=temp;
        }
    }

    public static void insertionSortDescending(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev >=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void countingSortDescending(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j]=1;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,3,1};
        bubbleSortDescending(arr);
//        selectionSort(arr);
//        insertionSort(arr);
//        countingSort(arr);
        printArr(arr);

    }


}
