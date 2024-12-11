package LAB5;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public boolean isPalindrome(ListNode head) {
        List<Integer>values= new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        int left = 0, right = values.size() - 1;
        while (left < right && values.get(left).equals(values.get(right))) {
            left++;
            right--;
        }
        return left >= right;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        PalindromeLinkedList solution = new PalindromeLinkedList();
        boolean result = solution.isPalindrome(head);
        System.out.println("Is palindrome? " + result);
    }
}
