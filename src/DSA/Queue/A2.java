package DSA.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class A2 {
    public static void main(String[] args) {

        int A = 3;
        //int A = 7;
        Queue<Integer> q = new LinkedList<>();
        int [] ans = new int[A];

        q.add(1);
        q.add(2);
        q.add(3);
        int i = 0;
        while (i<A){
            int num = q.poll();
            ans[i++] = num;

            q.add((num*10)+1);
            q.add((num*10)+2);
            q.add((num*10)+3);
        }

        System.out.println(Arrays.toString(ans));
    }
}
