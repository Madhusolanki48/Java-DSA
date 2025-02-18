public class Java7_9_0KadaneWithNegative{
    public static void kadanesAlgo(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        boolean allNegative = true;
        int smallestNegative = Integer.MIN_VALUE;

        for (int i=0;i<numbers.length;i++) {
            int num = numbers[i];
            smallestNegative = Math.max(smallestNegative, num);
            currentSum += num;
            maxSum = Math.max(currentSum, maxSum);

            if (currentSum < 0) {
                currentSum = 0;
            }

            if (num >= 0) {
                allNegative = false;
            }
        }
        if(allNegative){
            maxSum=smallestNegative;
        }
        System.out.println("Our max subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};  // Mixed elements
        kadanesAlgo(numbers);

        int numsAllNegative[] = {-5, -2, -3, -1, -8}; // All negative elements
        kadanesAlgo(numsAllNegative);
    }
}

