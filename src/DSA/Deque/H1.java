package DSA.Deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class H1 {
    public static void main(String[] args) {
        int [] A = {2, 5, -1, 7, -3, -1, -2};
        int B = 4;

//        int [] A = {2, -1, 3};
//        int B = 2;

        Deque<Integer> dequeMax = new ArrayDeque<>();
        Deque<Integer> dequeMin = new ArrayDeque<>();

        for(int i = 0 ; i < B ; i++){
            while(!dequeMax.isEmpty() && A[dequeMax.getLast()] < A[i]){
                dequeMax.removeLast();
            }
            dequeMax.addLast(i);

            while(!dequeMin.isEmpty() && A[dequeMin.getLast()] > A[i]){
                dequeMin.removeLast();
            }
            dequeMin.addLast(i);

        }
        //int [] ans = new int [A.length-B+1];
        int alpha = 0;

        alpha += A[dequeMax.getFirst()] + A[dequeMin.getFirst()];

        for(int i = B ; i < A.length ; i++){

            if(A[i-B] == A[dequeMax.getFirst()]){
                dequeMax.removeFirst();
            }

            if(A[i-B] == A[dequeMin.getFirst()]){
                dequeMin.removeFirst();
            }

            while(!dequeMax.isEmpty() && A[dequeMax.getLast()] < A[i]){
                dequeMax.removeLast();
            }
            dequeMax.addLast(i);

            while(!dequeMin.isEmpty() && A[dequeMin.getLast()] > A[i]){
                dequeMin.removeLast();
            }
            dequeMin.addLast(i);

            alpha += A[dequeMax.getFirst()] + A[dequeMin.getFirst()];
        }

        System.out.println(alpha);
    }
}
