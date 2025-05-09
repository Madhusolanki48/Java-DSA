public class Java9_3ReverseDLL {
     static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head; // head
    public static Node tail; // tail
    public static int size; // size


    //add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }else{
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    size++;
}

    //print
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    public void reverseDll(){
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }


public static void main(String[] args) {
    Java9_3ReverseDLL dll = new Java9_3ReverseDLL();
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.printList();
    
    dll.reverseDll();
    dll.printList();

}
    
}
