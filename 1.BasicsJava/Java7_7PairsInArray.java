public class Java7_7PairsInArray {
    public static void printPairs(int numbers[]){
        int totalpairs=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + curr +","+numbers[j]+")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = "+totalpairs);  //formula: tp=n(n-1)/2
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printPairs(numbers);
    }
}
