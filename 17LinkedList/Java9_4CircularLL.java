public class Java9_4CircularLL {
    static class Node {
        int data;
        Node next;
    };

    static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;
        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;
        return last;
    }
    
    static Node addFront(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }
    public static void main(String[] args) {
        Node last=null;
        last=addToEmpty(last, 6);
        last =addFront(last, 2);
    }
    }
