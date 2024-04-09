package DSA.Sorting.SortingProblems.PART2;

import java.util.Arrays;

public class H22 {
    public static void main(String[] args) {
        int [] A = { 1,2,1,3,2,4,5};
        //int [] A = { 1,1,3};

        int steps = 0;
        Arrays.sort(A);
        for(int i = 0; i < A.length-1 ; i++){
            if(A[i] >= A[i+1]){
                steps += (A[i] - A[i+1]) + 1;
                A[i+1] = A[i] + 1;
            }
            //System.out.println(Arrays.toString(A));
        }
        System.out.println(steps);
    }
}
