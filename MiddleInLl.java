import java.util.Scanner;

class ListNode {
    int value;
    ListNode next;
    ListNode(int value) { this.value = value; }
}

public class MiddleInLl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of nodes
        if (n <= 0) {
            scanner.close();
            return;
        }
        
        ListNode head = new ListNode(scanner.nextInt()); // First node
        ListNode current = head;
        for (int i = 1; i < n; i++) {
            current.next = new ListNode(scanner.nextInt()); // Remaining nodes
            current = current.next;
        }
        
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps
        }
        
        System.out.println(slow.value); // Print the middle node's value
        scanner.close();
    }
}

