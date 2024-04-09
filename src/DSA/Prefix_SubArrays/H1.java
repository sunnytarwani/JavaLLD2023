package DSA.Prefix_SubArrays;

import java.util.Arrays;

public class H1 {
    public static void main(String[] args) {
        int [] A = {1, 2, 1, 4};
        int [] [] B = {{2, 3, 2},
        {1, 4, 5},
        {4, 4, 1}};

        int [] subArray = new int [A.length];
        for(int i = 0 ; i < B[0].length ; i++){
            int alpha = B[i][0];
            int beta  = B[i][1];

            subArray[alpha-1] += B[i][2];
            if(beta >= A.length) {
                continue;
            }
            subArray[beta] -= B[i][2];
        }

        for(int i = 1 ; i < A.length ; i++){
            subArray[i] += subArray[i-1];
        }

        int [] finalArray = new int [A.length];
        for(int i = 0 ; i < A.length ; i++){
            finalArray[i] = A[i] + subArray[i];
        }

        System.out.println(Arrays.toString(finalArray));
    }
}
