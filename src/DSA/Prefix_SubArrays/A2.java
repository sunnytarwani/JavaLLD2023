package DSA.Prefix_SubArrays;

import java.util.Arrays;
import java.util.Stack;

public class A2 {
    public static void main(String[] args) {
        int [] A = {9, 7, 6, 18, 2};

        Stack<Integer> stack = new Stack<>();
        stack.add(A[0]);
        for(int i = 1 ; i < A.length ; i++){
            if(A[i] > stack.peek()){
                stack.push(A[i]);
            }
            A[i] = stack.peek();
        }

        System.out.println(Arrays.toString(A));

//        This is a method by using for loop
//        for(int i = 1 ;i < A.length ; i++){
//            if(A[i] < A[i-1]){
//                A[i] = A[i-1];
//            }
//        }
//
//        System.out.println(Arrays.toString(A));
    }
}
