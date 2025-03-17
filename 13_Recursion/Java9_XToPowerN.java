public class Java9_XToPowerN {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x,n-1);  //calculate x to the power (n-1)
        int xn=x*xnm1;
        return xn;

        // or simpler code - return x*power(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    } 
}

//Time Complexity - O(n)
