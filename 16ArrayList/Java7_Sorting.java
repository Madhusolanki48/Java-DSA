import java.util.ArrayList;
import java.util.Collections;

public class Java7_Sorting {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println(list);
        Collections.sort(list);   //Ascending Order
        System.out.println(list);

        //Descending Order
        Collections.sort(list,Collections.reverseOrder()); //.sort is a optimized func
        System.out.println(list);
        
        //Comparator --Functions define sorting logic

    }
    
}
