package DSA.Recursion;

import java.util.*;

public class PrintSubSequence {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int [] A = {3,1,2};

        printSS(0 , A , stack, A.length);
    }

    public static void printSS(int i, int[] a, Stack<Integer> stack ,int length) {

        if(i == length){
            System.out.println(stack);
            return;
        }

        stack.add(a[i]);
        printSS(i+1 , a , stack , length);
        stack.pop();
        printSS(i+1 , a , stack , length);
    }
}
