public class DoublyLL{
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            // this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;

    
    public static void displayFromHead(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void displayFromHTail(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }

    public static void displayFromHRandom(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        // displayFromHead(a);
        // displayFromHTail(e);
        displayFromHRandom(d);
    }
}