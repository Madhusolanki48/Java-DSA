public class Java9_1TilingProblem {
    /*Given a "2 x n" board and tiles of size "2 x 1",count the number
     * of tile the given board using the 2 x n tiles.
     (A tile can either be placed horizontally or vertically*/
    
     public static int tilingProblem(int n){  // 2 x n (floor size)
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //work
        //vertical choice
        int fnm1=tilingProblem(n-1);

        //horizontal choice
        int fnm2=tilingProblem(n-2);
        int totalWays=fnm1+fnm2;
       return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
