package DSA.Deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class A2 {
    public static void main(String[] args) {
//        int [] A = {1, 3, -1, -3, 5, 3, 6, 7};
//        int B = 3;
//        int [] A = {1, 2, 3, 4, 2, 7, 1, 3, 6};
//        int B = 6;

        int[] A = {10,9,8,7,6,5,4,3,2,1};
        int B = 3;

        int [] ans = new int [A.length-B+1];
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0 ; i < B ; i++){
            while(!deque.isEmpty() && A[deque.peekFirst()] < A[i]){
                deque.removeFirst();
            }
            deque.addLast(i);
        }
        int alpha= 0;
        ans[alpha++] = A[deque.peekFirst()];

        for(int i = B ; i < A.length ; i++){
            while(!deque.isEmpty() && A[deque.peekFirst()] < A[i]){
                deque.removeFirst();
            }

            //this is for the array 10 9 8 7 6 5 4 3 2 1
            while (!deque.isEmpty() && deque.peekFirst()<=i-B ){
                deque.removeFirst();
            }


            deque.addLast(i);
            ans[alpha++] = A[deque.peekFirst()];
        }

        System.out.println(Arrays.toString(ans));
    }
}
