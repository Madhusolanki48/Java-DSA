public class Java6_9_2DecimalToBinary {
    public static void decimalToBinary(int n){
        int myNum=n;
        int pow=0;
        int binNum=0;
        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary Form of "+myNum+" = "+binNum);

    }

    public static void main(String[] args) {
        decimalToBinary(15);
    }
}
