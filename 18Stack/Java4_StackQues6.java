import java.util.*;
public class Java4_StackQues6 {
    /*Next Greater Element
      The next greater element of some element x in an array 
      is the first greater element that is to the right of x 
      in the same array.
      arr = [6, 8, 0, 1, 3]  
      next Greater = [8, -1, 1, 3, -1]
     */

     public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nxtGreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //2 if-else
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            }else{
                nxtGreater[i]=arr[s.peek()];
            }
            //3 push in s
            s.push(i);
        }
        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();

        //Next Greater Right
        //Next Greater Left
        //Next Smaaller Right
        //Next Smaller Left
     }   
}
