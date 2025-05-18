class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}
public class Java9_5LinkedListQues5 {
    //Merged K Sorted Lists
    /*We have K sorted linked lists of size N each,merge them & print the sorted output.
     * Sample Input: k=2, n=2
     * l1=1->3->NULL   l2=6->8->NULL   l3=9->10->NULL
     * Sample Output:1->3->6->8->9->10->NULL
     */
    
     public static Node SortedMerge(Node a, Node b) {
        Node result = null;
        if (a == null)
            return b;
        else if (b == null)
            return a;

        if (a.data <= b.data) {
            result = a;
            result.next = SortedMerge(a.next, b);
        } else {
            result = b;
            result.next = SortedMerge(a, b.next);
        }
        return result;
    }
    public static Node MergeKLists(Node arr[], int last) {
        while(last != 0) {
            int i = 0, j = last;
            while (i < j) {
                arr[i] = SortedMerge(arr[i], arr[j]);
                i++;
                if (i >= j)
                    break;
                j--;
                if (i >= j)
            last = j;
        }
    }
    return arr[0];
    }
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Java9_5LinkedListQues5 list = new Java9_5LinkedListQues5();
        int k = 3;
        int n = 4;
        Node arr[] = new Node[k];
        arr[0] = new Node(1);
        arr[0].next = new Node(3);      
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);
        
        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        Node head = MergeKLists(arr, k - 1);
        printList(head);
    }

    
}
