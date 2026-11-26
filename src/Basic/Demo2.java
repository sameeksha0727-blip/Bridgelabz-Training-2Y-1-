package Queue.Basic;

import java.util.LinkedList;
import java.util.Queue;

public class Demo2 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();

//        try {
//            q1.remove();
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        q1.poll();

        System.out.println(q1);
    }
}
