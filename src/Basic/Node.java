package LinkedList.Basic;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }

    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Trick 1 : ");
        System.out.print(a.data + " -> ");
        System.out.print(b.data + " -> ");
        System.out.print(c.data + " -> ");
        System.out.print(d.data + " -> ");
        System.out.print(e.data + " -> ");
        System.out.println(e.next);

        System.out.print("\n");

        System.out.println("Trick 2 : ");
        System.out.print(a.data + " -> ");
        System.out.print(a.next.data + " -> ");
        System.out.print(a.next.next.data + " -> ");
        System.out.print(a.next.next.next.data + " -> ");
        System.out.print(a.next.next.next.next.data + " -> ");
        System.out.println(e.next);
    }
}
