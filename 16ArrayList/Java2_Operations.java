import java.util.ArrayList;
public class Java2_Operations {
    /* 1. Add Element           O(1)
     * 2. Get Element           O(1)
     * 3. Remove Element        O(n)
     * 4. Set Element at index  O(n)
     * 5. Contains Element      O(n)
     */
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

    //list.add ---to add element to a list
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);

     list.add(1,9);   //if we add an element at a particular index then T.C. = O(n)

     System.out.println(list);

    //  list.get ---to get the index of a element
    int element=list.get(2);
     System.out.println(element);

     //list.remove ---to remove element from a given index
     list.remove(3);
     System.out.println(list);

     //list.set ---to set an element at a index
     list.set(2,10);
     System.out.println(list);

    //  list.contains ---to check whether an element exists or not
    System.out.println(list.contains(1));  //returns true
    System.out.println(list.contains(11)); //returns false


     }

    
}
