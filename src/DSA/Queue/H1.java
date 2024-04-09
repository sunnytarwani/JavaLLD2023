package DSA.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class H1 {
    public static void main(String[] args) {
        int [] A = {2, 3, 1, 5, 4};
        int [] B = {1, 3, 5, 4, 2};
        //int [] A = {1};
        //int [] B = {1};

        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0 ; i < A.length ; i++){
            q.add(A[i]);
        }


        int i = 0;
        int count = 0;
        while(i<B.length){
            if(B[i] == q.peek()){
                //    count++;
                i++;
                q.poll();
            }
            else{
                q.add(q.poll());
                //    count++;
            }

            count++;
        }

        System.out.println(count);
    }
}
