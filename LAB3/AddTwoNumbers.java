package LAB3;

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        // Constructor to initialize a node
        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0, carry = 0;
        ListNode l3 = new ListNode();
        ListNode head = l3;

        while (l1 != null || l2 != null) {
            sum = 0;


            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            sum = sum + carry;
            carry = sum / 10;
            sum = sum % 10;
            l3.next = new ListNode(sum);
            l3 = l3.next;
        }

        if (carry != 0) {
            l3.next = new ListNode(carry);
        }
        return head.next;

    }
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        
    }
}
