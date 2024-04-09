package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class A3 {
    public static void main(String[] args) {
        int A = 4;
        //int A = 3;

        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");

        int i = 1;
        while(i<A){
            String alpha = queue.poll();
            queue.add(alpha+"1");
            queue.add(alpha+"2");
            i++;
        }

        StringBuilder stringBuilder = new StringBuilder(queue.poll());
        System.out.println(stringBuilder.toString() + stringBuilder.reverse().toString());
    }
}
