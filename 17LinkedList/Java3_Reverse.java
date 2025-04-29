public class Java3_Reverse {
    //Iterative Approach
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = newNode;
}
public void reverse(){
    Node prev=null;
    Node curr=head;
    Node next;
    while(curr != null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}

public void print() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
    }
    System.out.println("null");
}

public static void main(String[] args) {
    Java3_Reverse ll=new Java3_Reverse();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        ll.print();

        ll.reverse();

        ll.print();

    
}
    
}
