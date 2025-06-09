import java.util.Arrays;
import java.util.Stack;
     /*Given a list of daily temperatures, return a list such that for each day, 
     it tells how many days you have to wait until a warmer temperature. If no future 
     day is warmer, put 0 instead. */
public class Java5_DailyTempProb {
    public static int[] dailyTemp(int[] temp) {
        Stack <Integer> st=new Stack<>(); //stores index
        int[] ans=new int[temp.length];

        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                //answer mil gya
                ans[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] temp= {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemp(temp);

        System.out.println(Arrays.toString(result));
    }
    
}
