package DSA.Array2D;

import java.util.Arrays;

public class A1 {
    public static void main(String[] args) {
        int [][]A = {{1, 2, 3},
                {4, 5, 6},
        {7, 8, 9}};
        int [] B = {1, 2};
        int [] C = {1, 2};
        int [] D = {2, 3};
        int [] E = {2, 3};

        for(int i = 0 ;i < A.length ; i++){
            for(int j = 0 ; j < A[0].length ; j++){
                if(j!=0){
                    A[i][j] += A[i][j-1];
                }
            }
        }

        for(int i = 0 ;i < A.length ; i++){
            for(int j = 0 ; j < A[0].length ; j++){
                if(j!=0){
                    A[j][i] += A[j-1][i];
                }
            }
        }

        int [] finalAns = new int [B.length];

        for(int i = 0 ; i < B.length ; i++){
            int a1 = B[i]-1;
            int a2 = C[i]-1;
            int b1 = D[i]-1;
            int b2 = E[i]-1;
            int sum = A[b1][b2];

            if(a1!=0 && a2!=0){
                sum += A[a1-1][a2-1];
            }
            if(a1!=0){
                sum -= A[a1-1][b2];
            }
            if(a2!=0){
                sum -= A[b1][a2-1];
            }

            finalAns[i] = sum;
        }

        System.out.println(Arrays.toString(finalAns));

    }
}
