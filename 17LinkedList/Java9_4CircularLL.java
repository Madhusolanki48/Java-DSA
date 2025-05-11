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
    static Node addEnd(Node last,int data){
        if(last==null)
        return addToEmpty(last, data);
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=last.next;
        last.next=newNode;
        last=newNode;
        return last;
    }
    static Node addAfter(Node last,int data,int item){
        if(last==null)
        return null;

        Node newNode,p;
        p=last.next;
        do{
            if(p.data==item){
                newNode=new Node();
                newNode.data=data;
                newNode.next=p.next;
                p.next=newNode;
                if(p==last)
                    last=newNode;
                return last;
            }
            p=p.next;
            }while(p!=last.next);
            System.out.println(item+"The given node is not present in the list");
            return last;
            }
    public static void main(String[] args) {
        Node last=null;
        last=addToEmpty(last, 6);
        last =addFront(last, 2);
        last=addEnd(last, 8);
        last=addAfter(last,10 , 2);
    }
    }
