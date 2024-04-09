package DSA.Prefix_SubArrays;

import java.util.Arrays;

public class H2 {
    public static void main(String[] args) {
        int [] A = {3, 4, 1, 9, 56, 7, 9, 12};
        int B = 5;
        int minChocolates = Integer.MAX_VALUE;

        Arrays.sort(A);
        for(int i = 0 ; i <= A.length-B ; i++){
            int a = (Math.abs(A[i] - A[i+B-1]));
            minChocolates = Math.min(minChocolates , a);
        }

        System.out.println(minChocolates);
    }
}
