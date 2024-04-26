package src.OOps_14;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab196 {
    public static void main(String[] args) {

        Queue<Integer> que = new PriorityQueue<>();
        que.add(1);

        System.out.println(que);
        System.out.println(que.poll());
    }
}
