public class Java2_Search {
    //Search by Iterative approach
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
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp != null){
            if(temp.data==key){  //key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found
        return -1;
    }

        //Search by recursive approach

        public int helper(Node head,int key){   //O(n)
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=helper(head.next, key);
            if(idx==-1){
                return -1;
            }
            return idx+1;

        }
        public int recSearch(int key){
            return helper(head,key);

        }
        

    public static void main(String[] args) {
        Java2_Search ll=new Java2_Search();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        System.out.println(ll.itrSearch(30));
        System.out.println(ll.recSearch(3));
    }
    
}
