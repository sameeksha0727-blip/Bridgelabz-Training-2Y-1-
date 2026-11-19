package Stack.Basic;

public class Main2 {
    public static void main(String[] args) {
        StackOps2 st = new StackOps2();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        st.display();

        System.out.println();

        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();

        st.display();

        System.out.println();

        System.out.println(st.peek());
    }
}
