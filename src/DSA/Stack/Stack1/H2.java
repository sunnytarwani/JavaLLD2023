package DSA.Stack.Stack1;

import java.util.Stack;

public class H2 {
    public static void main(String[] args) {
        //String A = "((a+b))";
        String A = "(a+(a+b))";


        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < A.length() ; i++){
            if(A.charAt(i) != ')'){
               stack.push(A.charAt(i));
            }
            else{
                int count = 0;
                while(!stack.isEmpty() && stack.peek() != '('){
                    count++;
                    stack.pop();
                }
                if(count <= 1){
                    System.out.println(1);
                }
                stack.pop();
            }
        }

        System.out.println(0);
    }
}
