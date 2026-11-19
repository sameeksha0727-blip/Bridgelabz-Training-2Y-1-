package LinkedList.Leetcode;

import java.util.*;

public class Leetcode_2487 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode removeNodes(ListNode head) {
        if (head == null) return null;

        head.next = removeNodes(head.next);

        if (head.next != null && head.val < head.next.val)
            return head.next;

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ListNode head = null, temp = null;

        for (int i = 0; i < n; i++) {
            ListNode node = new ListNode(sc.nextInt());

            if (head == null)
                head = temp = node;
            else {
                temp.next = node;
                temp = node;
            }
        }

        head = removeNodes(head);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
