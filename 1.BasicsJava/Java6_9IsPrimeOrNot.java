public class Java6_9IsPrimeOrNot {
    //only for n>=2
    public static boolean isPrime(int n){
        boolean isPrime=true;

        //corner cases
        //2
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){ //completely dividing
            if(n%i==0){
                isPrime=false;   // return false
                break;   //or return isPrime;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }
}
