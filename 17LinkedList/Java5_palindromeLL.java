public class Java5_palindromeLL {
    // Check if a Linked List is a palindrome
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Slow-Fast Approach
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);

        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // step3- check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // Helper method to add a node to the linked list
    public static void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public static void main(String[] args) {
        Java5_palindromeLL list = new Java5_palindromeLL();

        // Test case 1: Palindrome list
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);

        System.out.println("Is the linked list a palindrome? " + list.checkPalindrome()); // Output: true

        // Test case 2: Non-palindrome list
        list = new Java5_palindromeLL();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        System.out.println("Is the linked list a palindrome? " + list.checkPalindrome()); // Output: false
    }
}