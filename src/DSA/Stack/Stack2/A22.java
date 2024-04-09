package DSA.Stack.Stack2;

import java.util.Arrays;
import java.util.Stack;

public class A22 {
    public static void main(String[] args) {
        //int [] A = {4, 5, 2, 10, 8};
        int [] A = {3, 2, 1};

        int [] ans = new int [A.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(A[0]);
        ans[0] = -1;
        for(int i = 1 ; i < A.length ; i++){
            while (!stack.isEmpty() && stack.peek() > A[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
            }
            stack.push(A[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
}
