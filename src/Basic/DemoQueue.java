package Queue.Basic;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayBlockingQueue<>(4);
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);

//        try{
//        q1.add(50);
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        q1.offer(50);

        System.out.println(q1);
    }
}
