import java.util.ArrayList;

public class Java9_3ArraylistExercise {

    /*Ques 1 :Monotonic ArrayList(EASY)An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
    An Arraylist nums is monotone increasing if for all i<=j,nums.get(i)<=nums.get(j).
    An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
    Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
    Sample Input 1: nums = [1,2,2,3]  Sample Output 1: true
    Sample Input 2: nums = [6,5,4,4]  Sample Output 2: true
    Sample Input 3: nums = [1,3,2]    Sample Output 3: false 
    Constraints:●1 <= nums.size() <= 105●-105 <= nums.get(i) <= 105 
     */

     public boolean isMonotonic(ArrayList<Integer> list){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                inc=false;
            }
            if(list.get(i)<list.get(i+1)){
                dec=false;
            }
        }
        return inc || dec;
     }

     /*Question 3: Most Frequent Number following Key (EASY)
       You are given an integer ArrayList nums. You are also given an integer key, which is present in nums.
       For every unique integer target in nums, count the number of times target immediately follows an occurrence of key in nums.
       In other words, count the number of indices i such that:
       0 <= i <= nums.size() - 2,
       nums.get(i) == key, and
       nums.get(i+1) == target.
       Return the target with the maximum count.
       (Assumption: The target with maximum count is unique.) 
      */

      public int mostFrequent(ArrayList<Integer>nums,int key){
        int[] result=new int[1000];
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)==key){
                result[nums.get(i+1)-1]++;
            }
        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<1000;i++){
            if(result[i]>max){
                max=result[i];
                ans=i+1;
            }
        }
        return ans;
      }
     public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        

        
     }
    
}
