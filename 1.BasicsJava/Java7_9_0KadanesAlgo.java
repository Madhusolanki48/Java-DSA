public class Java7_9_0KadanesAlgo {
    public static void kadanesAlgo(int numbers[]){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<numbers.length;i++){
            currentSum=currentSum+numbers[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(currentSum,maxSum);
        }
        System.out.println("Our max subarray sum is : "+maxSum);


    }

    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanesAlgo(numbers);
    }
}
