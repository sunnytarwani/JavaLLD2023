package DSA.Stack.Stack1;

import java.util.Stack;

public class A2 {
    public static void main(String[] args) {
        String  A = "{([])}";

        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < A.length()){
            if(A.charAt(i) == ']' && stack.peek() == '['){
                stack.pop();
            }
            else if(A.charAt(i) == '}' && stack.peek() == '{'){
                stack.pop();
            }
            else if (A.charAt(i) == ')' && stack.peek() == '('){
                stack.pop();
            }
            else {
                stack.push(A.charAt(i));
            }
            i++;
        }

        if(stack.isEmpty()){
            System.out.println(1);
        }
        System.out.println(0);
    }
}
