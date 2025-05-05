import java.util.LinkedList;   //functions are optimized
public class Java8_LLinCollections {

    public static void main(String[] args) {
        //create - objects int, String, double, boolean, char, float, long, byte, short
        LinkedList<Integer>  ll=new LinkedList<Integer>();
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);


    }
}
