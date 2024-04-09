class ListNode {
    int value;
    ListNode next;
    ListNode(int value) { this.value = value; }
}

public class ll {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);
        ListNode oddCurrent = oddDummy;
        ListNode evenCurrent = evenDummy;
        ListNode current = head;
        boolean isOdd = true;

        while (current != null) {
            if (isOdd) {
                oddCurrent.next = current;
                oddCurrent = oddCurrent.next;
            } else {
                evenCurrent.next = current;
                evenCurrent = evenCurrent.next;
            }
            current = current.next;
            isOdd = !isOdd;
        }

        evenCurrent.next = null; // End the even list
        oddCurrent.next = evenDummy.next; // Connect odd list to even list

        return oddDummy.next; // The head of the odd list is the new head of the modified list
    }

    // Helper function to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        head = oddEvenList(head);

        System.out.println("Modified list:");
        printList(head);
    }
}
