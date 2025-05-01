public class Java5_palindromeLL {
    //Check if a Linked List is a palindrome 
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

    //Slow-Fast Approach
    public Node findMid(Node head){
       Node slow=head;
       Node fast=head;
       while(fast != null && fast.next != null){
        slow=slow.next; //+1
        fast=fast.next.next;//+2
       } 
       return slow; //slow is my midNode
    }
    public static void main(String[] args) {
        
    }
}
    

