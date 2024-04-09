package DSA.Stack.Stack1;

import java.util.Stack;

public class H1 {
    public static void main(String[] args) {
        int A = 10;
        int B = 23;
        int [] C = {86, 63, 60, 0, 47, 0, 99, 9, 0, 0};
//        int A = 1;
//        int B = 1;
//        int [] C = {2};

        Stack<Integer> s1 = new Stack<>();
        s1.push(B);
        for(int i = 0 ; i < C.length ; i++){
            if(C[i]>0){
                s1.push(C[i]);
            }
            else {
                s1.pop();
            }
        }
        System.out.println(s1.peek());
    }
}
