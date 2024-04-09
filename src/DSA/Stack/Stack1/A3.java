package DSA.Stack.Stack1;

import java.util.Stack;

public class A3 {
    public static void main(String[] args) {
        String A = "abccbc";
        //String A = "ab";

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < A.length() ; i++){
            if(!stack.isEmpty() && stack.peek() == A.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(A.charAt(i));
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        System.out.println(stringBuilder.reverse().toString());

    }
}
