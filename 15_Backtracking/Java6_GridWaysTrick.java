public class Java6_GridWaysTrick {
    // Using permutation
    /*To reach the bottom-right, you must make:
     * m-1 down moves
     * n-1 right moves
     * Total moves = (m - 1) + (n - 1) = m + n - 2
     * From these, choose positions for either down or right:
     * Ways = C(m + n - 2, m - 1) = (m+n-2)! / ((m-1)! * (n-1)!)
     */

    //  Time Complexity = O(m+n)
    public  static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }
    public static long gridWays(int m, int n) {
        return factorial(m + n - 2) / (factorial(m - 1) * factorial(n - 1));
    }
    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println("Number of ways: " + gridWays(m, n));
    }
}

