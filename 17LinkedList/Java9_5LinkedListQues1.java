public class Java9_5LinkedListQues1 {
    /*Ques1: Interesection of Two Linked Lists
     *In a system there are two singly linked list. By some programming error, the end node of one
     of the linked lists got linked to the second list, forming an inverted Y-shaped list.Write a 
     * program to get the point where two linked lists merge.
     */
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public Node getIntersectionNode(Node head1,Node head2){
        while(head2 != null){
            Node temp=head1;
            while(temp!=null){
                if(temp==head2){
                    return head2;
                }
                temp=temp.next;
            }
            head2=head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        Java9_5LinkedListQues1 list=new Java9_5LinkedListQues1();        Node head1,head2;
        head1=new Node(10);
        head2=new Node(3);
        Node newNode=new Node(6);
        head2.next=newNode;
        newNode.next=new Node(9);
        head2.next.next=newNode;

        newNode=new Node(15);
        head1.next=newNode;
        head2.next.next.next=newNode;

        newNode=new Node(30);
        head1.next.next=newNode;

        head1.next.next.next=null;

        Node intersectionPoint=list.getIntersectionNode(head1,head2);

        if(intersectionPoint == null){
            System.out.println("No intersection point \n");
        }
        else{
            System.out.println("Intersection point:"+intersectionPoint.data);

        }

    }
    
}
