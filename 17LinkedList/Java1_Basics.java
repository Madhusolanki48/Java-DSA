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

        // Print a linked list
        public void print(){
            if(head==null){
                System.out.println("LL is empty");
                return;
            }
            Node temp=head;
            while (temp != null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
    }

    //Add in the middle
    public void add(int idx, int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        //i=idx-1;temp->prev
        newNode next=temp.next;
        temp.next=newNode;

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

        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();

        ll.add(2,9);
        ll.print();

        
    }
    
}
