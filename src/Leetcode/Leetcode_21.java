package LinkedList.Leetcode;

import java.util.Scanner;

public class Leetcode_21 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        }

        if (list2 != null) {
            temp.next = list2;
        }

        return dummy.next;
    }

    public static ListNode createList(Scanner sc, int n) {
        ListNode head = null;
        ListNode tail = null;

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

        return head;
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

        System.out.println("Enter size of first linked list:");
        int n1 = sc.nextInt();

        System.out.println("Enter first sorted list:");
        ListNode list1 = createList(sc, n1);

        System.out.println("Enter size of second linked list:");
        int n2 = sc.nextInt();

        System.out.println("Enter second sorted list:");
        ListNode list2 = createList(sc, n2);

        System.out.println("First Linked List:");
        display(list1);

        System.out.println("Second Linked List:");
        display(list2);

        ListNode result = mergeTwoLists(list1, list2);

        System.out.println("Merged Linked List:");
        display(result);
    }
}

