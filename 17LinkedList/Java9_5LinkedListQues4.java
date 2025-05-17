public class Java9_5LinkedListQues4 {
    //Odd Even Linked List
    /*We have a Linked list of integers, write a function to modify the linked list such that all even
     * numbers appear before all the odd numbers in the modified linked list. ALso, keep the order of
     * even and odd numbers same.
     * Sample Input1: 8->12->10->5->4->1->6->NULL  Sample Output1: 8->12->10->4->6->5->1->NULL
     */
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;

        while (end.next != null) {
            end = end.next;
        }
        Node new_end = end;

        while (curr != null && curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        if (curr != null && curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    Node temp = curr;
                    curr = curr.next;
                    temp.next = null;
                    new_end.next = temp;
                    new_end = temp;
                }
            }
        } else {
            prev = curr;
        }

        if (curr != null && curr.data % 2 != 0 && new_end != end) {
            prev.next = curr.next;
            curr.next = null;
            new_end.next = curr;
        }
    }

    void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Java9_5LinkedListQues4 list = new Java9_5LinkedListQues4();
        list.push(11);
        list.push(10);
        list.push(8);
        list.push(6);
        list.push(4);
        list.push(2);
        list.push(0);
        System.out.println("Original Linked List: ");
        list.printList();
        list.segregateEvenOdd();
        System.out.println("Updated Linked List: ");
        list.printList();
    }
}
