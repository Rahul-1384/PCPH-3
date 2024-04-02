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

    // recursiveSearch
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }


    public int recursiveSearch(int key){
        return helper(head,key);
    }

    // reverseLL
    public void reverseLL(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // deleteNthNodeLast
    public void deleteNthNodeLast(int idx){
        Node temp1=head;
        int i=1;
        int count=0;
        // while(temp1!=null){
        //     temp1=temp1.next;
        //     count++;
        // }
        // System.out.println("the size of LL is: "+count);
        Node temp2=head;
        while(i<size-idx){
            temp2=temp2.next;
            i++;
        }
        temp2.next=temp2.next.next;
        size--;
    }

    // pallindrome
    public Node middleNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean pallindrome(){
        if(head==null || head.next==null){
            return true;
        }
        // 1) find midNode
        Node midNode=middleNode(head);

        // 3) reverse 2nd half LL
        Node curr=midNode;
        Node prev=null;
        
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }

    // detectingCycle
    public boolean detectCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    // removingCycle
    public void removeCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                Node prev=null;
                while(fast!=slow){
                    slow=slow.next;
                    prev=fast;
                    fast=fast.next;
                }
                prev.next=null;
            }
        }
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
        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addFirst(0);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(6);
        // // ll.reverseLL();
        // // System.out.println(ll.iterativeSearch(4));
        // // System.out.println(ll.recursiveSearch(3));
        // // ll.removeFirst();
        // // ll.removeLast();
        // // ll.addMiddle(2, 100);
        // // ll.deleteNthNodeLast(3);
        // ll.display();
        // System.out.println(ll.size);
        // // System.out.println(ll.pallindrome());
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(ll.detectCycle());
        ll.removeCycle();
        System.out.println(ll.detectCycle());
        
        
    }
}
