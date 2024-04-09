package DSA.Stack.Stack1;

import java.util.Stack;

public class A4 {
    public static void main(String[] args) {
        //String A = "x^y/(a*z)+b";
        String A = "a+b*(c^d-e)^(f+g*h)-i";

        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0 ; i < A.length() ; i++){
            char ch = A.charAt(i);
            if(ch >= 'a' && ch<='z'){
                stringBuilder.append(ch);
            }
            else if (ch == '('){
                stack.push(ch);
            }
            else if (ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    stringBuilder.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
            }
            else {
                while(!stack.isEmpty() && pre(ch)<=pre(stack.peek())){
                    stringBuilder.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }

        System.out.println(stringBuilder.toString());

    }

    public static int pre(Character ch){
        if(ch == '^'){
            return 3;
        }
        else if(ch == '/' || ch == '*'){
            return 2;
        }
        else if (ch == '+' || ch == '-'){
            return 1;
        }
        return 0;
    }
}
