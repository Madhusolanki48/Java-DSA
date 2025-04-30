public class Java4_RemoveNthNode {
    //Remove Nth node from end
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void deleteNthfromEnd(int n){
        //Calculate Size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next; //remove
            return;
        }
        //sz-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        if (prev != null && prev.next != null) {
        prev.next=prev.next.next;

        }
    }

     // Method to add a new node to the list
     public static void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Method to print the list
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);

        System.out.println("Original List:");
        printList();

        deleteNthfromEnd(2);

        System.out.println("List after deleting the 2nd node from the end:");
        printList();
        
    }


    
}
