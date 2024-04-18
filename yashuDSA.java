import java.util.Scanner;

public class yashuDSA {
    // Represent a node of the doubly linked list
    static class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Represent the head and tail of the doubly linked list
    static Node head;
    static Node tail = null;

    // Search for a given node in the list
    public static void searchNode(int value) {
        int position = 1;
        boolean found = false;
        Node current = head;

        while (current != null) {
            if (current.data == value) {
                found = true;
                System.out.println("Yes");
                break;
            }
            current = current.next;
            position++;
        }

        if (!found) {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // taking linked list from user
        int searchValue = sc.nextInt();
        searchNode(searchValue);
    }
}
