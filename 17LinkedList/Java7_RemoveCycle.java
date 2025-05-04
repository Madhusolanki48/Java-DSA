public class Java7_RemoveCycle {
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

    // check cycle exists
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if (slow == fast) {
                return true; // Cycle exists
            }
        }
        return false; // No cycle
    }

    // Method to remove a cycle if it exists
    public void removeCycle() {
        // Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if (slow == fast) {
                cycle = true;
                System.out.println("Cycle exists");
                break; // Cycle detected
            }
        }

        if (!cycle) {
            return; // No cycle
        }

        // Find the meeting point
        slow = head;
        Node prev = null; // Last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next; // +1
            fast = fast.next; // +1
        }

        // Remove cycle -> last.next = null
        prev.next = null;
        System.out.println("Cycle removed");
    }

    public static void main(String[] args) {
        Java7_RemoveCycle list = new Java7_RemoveCycle();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // Creates a cycle

        // 1 -> 2 -> 3 -> 1 (cycle)
        System.out.println("Cycle detected? " + list.isCycle()); // Output: true
        list.removeCycle();
        System.out.println("Cycle detected? " + list.isCycle()); // Output: false
    }
}