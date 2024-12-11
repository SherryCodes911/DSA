package LAB3;

public class MergeSortList {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val =val;
            this.next= next; }

        public Node() {

        }
    }
    public static Node mergeTwoLists(Node head1, Node head2) {
        Node sortedlist = new Node();
        Node tail = sortedlist;

        while (head1 !=null && head2!=null) {
            tail.next=(head1.val>head2.val) ? head2 : head1;
            if (head1.val>head2.val)
                head2=head2.next;
            else head1=head1.next;
            tail = tail.next;
        }
        tail.next=(head1!= null) ? head1 : head2;
        return sortedlist.next;
    }

    public static void main(String[] args) {
        // Create two sample linked lists
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        // Merge the lists
        Node mergedList = mergeTwoLists(list1, list2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}