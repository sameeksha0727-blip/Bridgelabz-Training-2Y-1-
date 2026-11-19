package LinkedList.Leetcode;

import java.util.*;

public class Leetcode_2095 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
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

        head = deleteMiddle(head);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
