package DSA.Stack.Stack1;

import java.util.Arrays;
import java.util.Stack;

public class A1 {
    public static void main(String[] args) {
        //String [] A =   {"2", "1", "+", "3", "*"};
        String [] A =   {"4", "13", "5", "/", "+"};

        Stack<Integer> stack = new Stack<>();
        int a,b;
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] == "+"){
                a = stack.pop();
                b = stack.pop();
                stack.push(a+b);
            }
            else if(A[i] == "-"){
                a = stack.pop();
                b = stack.pop();
                stack.push(b-a);
            }
            else if(A[i] == "*"){
                a = stack.pop();
                b = stack.pop();
                stack.push(a*b);
            }
            else if(A[i] == "/"){
                a = stack.pop();
                b = stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.parseInt(A[i]));
            }
        }

        System.out.println(stack.peek());
    }
}
