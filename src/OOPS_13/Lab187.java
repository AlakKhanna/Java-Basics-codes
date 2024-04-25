package src.OOPS_13;

import java.util.Stack;

public class Lab187 {
    public static void main(String[] args) {


        Stack s = new Stack<>();
        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
