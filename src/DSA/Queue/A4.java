package DSA.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class A4 {
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        int B = 3;
//        int [] A = {5, 17, 100, 11};
//        int B = 2;

        Queue<Integer> q = new LinkedList<>();
        for(int i = B-1 ; i >=0 ; i-- ){
            q.add(A[i]);
        }
        int j = 0;
        while(!q.isEmpty()){
            A[j++] = q.poll();
        }

        System.out.println(Arrays.toString(A));
    }
}
