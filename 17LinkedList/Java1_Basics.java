public class Java1_Basics {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    //Add in Linked List
    public void addFirst(int data){
        //step-1: create new node
        Node newNode=new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }

        //step-2: newNode next = head
        newNode.next=head;  //link

        //step-3: head = newNode
        head=newNode;
    }
    public static void main(String[] args) {
        Java1_Basics ll=new Java1_Basics();
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);

        //Methods
        //add()
        //remove()
        //print()
        //search()

        ll.addFirst(1);
        ll.addFirst(2);

        
    }
    
}
