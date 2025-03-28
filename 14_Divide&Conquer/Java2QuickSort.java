public class Java2QuickSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //last element
        int pivotIndex=partition(arr,si,ei);
        quickSort(arr, si, pivotIndex-1); //left
        quickSort(arr, pivotIndex+1, ei); //right
    }

    public static void partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1; //to make place for els smaller than pivot

        for(int j=0;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr, 0, );
    }
    
}
