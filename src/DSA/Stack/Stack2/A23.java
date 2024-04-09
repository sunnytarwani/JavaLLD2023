package DSA.Stack.Stack2;

import java.util.Arrays;
import java.util.Stack;

public class A23 {
    public static void main(String[] args) {

        int [] A = {2, 1, 5, 6, 2, 3};
        //int [] A = {2};
        //-1 -1 1 5 1 2      1 6 2 2 6 6

        Stack<Integer> s = new Stack<>();
        int [] arr = new int[A.length];
        for(int i = 0 ; i < A.length ; i++){
            while(!s.isEmpty() && A[s.peek()]>=A[i]){
                s.pop();
            }

            if(s.isEmpty()){
                arr[i] = -1;
            }
            else{
                arr[i] = s.peek();
            }
            s.push(i);
        }

        System.out.println(Arrays.toString(arr));



        Stack<Integer> s1 = new Stack<>();
        int [] arr1 = new int[A.length];
        for(int i = A.length-1 ; i >= 0 ; i--){
            while(!s1.isEmpty() && A[s1.peek()]>=A[i]){
                s1.pop();
            }

            if(s1.isEmpty()){
                arr1[i] = A.length;
            }
            else{
                arr1[i] = s1.peek();
            }
            s1.push(i);

        }
        System.out.println(Arrays.toString(arr1));


        int ans = 0;
        int max = 0;
        for(int i = 0 ; i < A.length ; i++){
            ans = (arr1[i] - arr[i] - 1)*A[i] ;
            max = Math.max(ans , max);
        }
        System.out.println(max);

    }
}
