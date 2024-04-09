package DSA.Sorting.SortingProblems.PART3;

import java.util.Arrays;

public class H31 {
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4};

        for(int i = 1 ; i < A.length ;i = i+2){
            int temp = A[i];
            A[i] = A[i-1];
            A[i-1] = temp;
        }

        System.out.println(Arrays.toString(A));
    }
}
