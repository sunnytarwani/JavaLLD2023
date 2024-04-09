package DSA.Prefix_SubArrays;

import java.util.Arrays;

public class A3 {
    public static void main(String[] args) {
       int [] A =  {15, 11, 11, 11, 10};

       for(int i = A.length-2 ; i >= 0 ; i--){
           if(A[i] < A[i+1]){
                A[i] = A[i+1];
           }
       }

        System.out.println(Arrays.toString(A));
    }
}
