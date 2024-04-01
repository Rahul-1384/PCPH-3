public class LinkedList_3 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // addLast
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    // addMiddle
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;

        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    // removeFirst
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
        }
        if(size==1){
            int val=head.data;
            head=null;
            tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    // removeLast
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
        }
        if(size==1){
            int val=head.data;
            head=null;
            tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        return val;
    }

    // iterative search
    public int iterativeSearch(int key){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public void display(){
        Node temp=head;
        System.out.print("head--->");
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        LinkedList_3 ll=new LinkedList_3();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        System.out.println(ll.iterativeSearch(4));
        // ll.removeFirst();
        // ll.removeLast();
        // ll.addMiddle(2, 100);
        ll.display();
        // System.out.println(ll.size);
    }
}
