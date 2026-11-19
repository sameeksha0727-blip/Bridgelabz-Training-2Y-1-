package LinkedList.Leetcode;

import java.util.*;

public class Leetcode_203 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
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

        int val = sc.nextInt();

        head = removeElements(head, val);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

}
