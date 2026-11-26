package Stack.Basic;

public class StackWithLinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node top = null;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public void peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("top element is "+top.data);
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }

        top = top.next;
    }

    public void display(){
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        StackWithLinkedList st= new StackWithLinkedList();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();

        System.out.println();

        st.peek();

        st.pop();
        st.pop();

        st.display();
    }

}
