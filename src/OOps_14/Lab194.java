package src.OOps_14;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab194 {
    public static void main(String[] args) {

        Queue q = new PriorityQueue();
        q.offer(10);
        q.offer(30);
        q.offer(20);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.peek());

    }
}
