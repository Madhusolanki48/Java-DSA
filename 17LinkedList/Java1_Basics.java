public class Java1_Basics {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add in Linked List (at the beginning)
    public void addFirst(int data){
        // step-1: create new node
        Node newNode = new Node(data);
        size++;
        
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step-2: newNode next = head
        newNode.next = head;  // link

        // step-3: head = newNode
        head = newNode;
    }
     
    // Add in Last in Linked List
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
    }

    // Print a linked list
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add in the middle (at specific index)
    public void add(int idx, int data){
        if(idx < 0 || idx > size){
            System.out.println("Invalid Index");
            return;
        }
        
        Node newNode = new Node(data);
        Node temp = head;
        
        if(idx == 0){
            addFirst(data);  // If index is 0, call addFirst
            return;
        }

        int i = 0;
        while(i < idx - 1){
            temp = temp.next;
            i++;
        }

        // i = idx - 1; temp->prev (for doubly ll)
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
     // Remove from linked list
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public static void main(String[] args) {
        Java1_Basics ll = new Java1_Basics();

        // Methods
        // addFirst()
        // addLast()
        // print()
        // add()

        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();

        ll.add(2, 9);  // Add 9 at index 2
        ll.print();

        ll.removeFirst();
        ll.print();
    }
}
