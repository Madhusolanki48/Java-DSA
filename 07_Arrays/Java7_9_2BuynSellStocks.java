/*You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different
day in the future to sell that stock.Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.
 */
public class Java7_9_2BuynSellStocks {
    public static int buyAndSellStocks(int prices[]){
        int buyPrices=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrices<prices[i]){ //profit
                int profit=prices[i]-buyPrices; //today's profit
                maxProfit=Math.max(maxProfit,profit);
                } else{
                buyPrices=prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
    }
}


//Time complexity = O(n)
