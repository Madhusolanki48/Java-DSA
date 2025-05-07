public class Java9_1ZigzagLL {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head; // head

    public void zigzag() {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid = slow;

        //recursive 2nd half
        Node curr=mid.next;
        mid.next=null;  
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;    
        Node nextL,nextR;

        //alt merge - zig-zag merge
        while(left !=null && right !=null){
            nextL=left.next;
            nextR=right.next;
            left.next=right;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }

    // Function to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();   
}
public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    Node curr = head;
    while (curr.next != null) {
        curr = curr.next;
    }
    curr.next = newNode;
}
public static void main(String[] args) {
    Java9_1ZigzagLL ll = new Java9_1ZigzagLL();
    ll.addLast(1);
    ll.addLast(2); 
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    //1->2->3->4->5

    ll.printList();
    ll.zigzag();
    ll.printList();
}
    
}
