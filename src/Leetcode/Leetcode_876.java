package LinkedList.Leetcode;

import java.util.*;

public class Leetcode_876 {
    public static class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
        public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            }

            return slow;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            Node head = null, temp = null;

            for (int i = 0; i < n; i++) {
                Node node = new Node(sc.nextInt());

                if (head == null)
                    head = temp = node;
                else {
                    temp.next = node;
                    temp = node;
                }
            }

            Node mid = middleNode(head);
            System.out.println(mid.val);
        }
}
