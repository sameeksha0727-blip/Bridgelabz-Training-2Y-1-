package LinkedList.Leetcode;

import java.util.Scanner;

public class Leetcode_206 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            return prev;
        }

        public static void display(ListNode head) {
            ListNode temp = head;

            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }

            System.out.println("null");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of nodes:");
            int n = sc.nextInt();

            ListNode head = null;
            ListNode tail = null;

            System.out.println("Enter node values:");

            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();

                ListNode newNode = new ListNode(value);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }

            System.out.println("Original Linked List:");
            display(head);

            head = reverseList(head);

            System.out.println("Reversed Linked List:");
            display(head);
    }
}
