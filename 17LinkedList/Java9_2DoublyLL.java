public class Java9_2DoublyLL {
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
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
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

    //remove - removeLast
    public void removeLast() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size ==1){
            int val = head.data;
            head = tail = null;
            return val;

        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
        
    }

public static void main(String[] args) {
    Java9_2DoublyLL dll = new Java9_2DoublyLL();
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.printList();
    System.out.println(dll.size);
}
}
