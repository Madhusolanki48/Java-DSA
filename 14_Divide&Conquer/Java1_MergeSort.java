public class Java1_MergeSort {
    // 1.Divide--mid
    // 2.mergeSort(left)
    //   mergeSort(right)
    // 3.merge

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2; //(se+ei)/2
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid+1, ei); //right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        //left(0,3)=4 right
    }
    
}
