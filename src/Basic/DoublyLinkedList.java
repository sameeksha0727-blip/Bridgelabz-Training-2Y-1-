package LinkedList.Basic;

public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
        }
    }

    public static Node head;
    public static Node tail;

    public static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
    }

    public static void reverseDisplay(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
    }

    public static void insertAtStart(int value) {
        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public static void insertAtEnd(int value) {
        Node temp = new Node(value);

        if (head == null) {
            head = temp;
            tail = temp;
        } else  {
            tail.next = temp;
            tail = temp;
        }
    }

    public static int countNodes() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static int search(int value) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == value) {
                return index;
            }

            temp = temp.next;
            index++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        head = a;
        tail = e;


        insertAtEnd(10);
        insertAtEnd(20);

        insertAtStart(5);
        insertAtStart(8);

        System.out.println("Original Linked List ");
        display();

        System.out.println();

        System.out.println("Number of Nodes: " + countNodes());
        System.out.println("Index of Element 5: " + search(5));

        System.out.println();

        System.out.println("Reverse Linked List ");
        reverseDisplay();
    }
}
