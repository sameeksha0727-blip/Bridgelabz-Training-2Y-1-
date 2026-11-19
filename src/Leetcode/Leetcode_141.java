package LinkedList.Leetcode;

import java.util.*;

public class Leetcode_141 {

   public static class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
        public static boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast)
                    return true;
            }
            return false;
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

            int pos = sc.nextInt();

            if (pos != -1) {
                ListNode curr = head;
                for (int i = 0; i < pos; i++)
                    curr = curr.next;

                temp.next = curr;
            }

            System.out.println(hasCycle(head));
        }
}

