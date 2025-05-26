import java.util.*;
public class Java4_StackQues8 {
    /*Ques1: Palindrome Linked List
    We have a singly linked list of characters, write a function that returns true 
    if the given list is a palindrome, else false.
    Input:A->B->B->C->B->A
    Output:Yes It is Palindrome
     */
    public static void main(String[] args) {
        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3); 
        Node four=new Node(2);
        Node five=new Node(1);
        one.ptr=two;
        two.ptr=three;
        three.ptr=four;
        four.ptr=five;
        five.ptr=null;
        boolean condition=isPalindrome(one);
        System.out.println("Palindrome: "+condition);
    }
    static boolean isPalindrome(Node head){
        Node slow=head;
        boolean isPalin=true;
        Stack<Integer> stack=new Stack<>();

        while(slow!=null){
            stack.push(slow.data);
            slow=slow.ptr;
        }
        while(head!=null){
            int i=stack.pop();
            if(head.data==i){
                isPalin=true;
            }
            else{
                isPalin=false;
                break;
            }
            head=head.ptr;
        }
        return isPalin;
    }
    
}
class Node {
    int data;
    Node ptr;
    Node(int data) {
        this.data = data;
        this.ptr = null;
    }
}
