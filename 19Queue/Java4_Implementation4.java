import java.util.*; 
public class Java4_Implementation4 {
   //Queue Implementation using Java Collection Framework
        public static void main(String[] args) {
             // Queue<Integer> q =new LinkedList<>();  // ArrayDeque
            Queue<Integer> q = new ArrayDeque<>(); // Using ArrayDeque as Queue implementation
            q.add(1);
            q.add(2);
            q.add(3);
            
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }

         
    } 
}
