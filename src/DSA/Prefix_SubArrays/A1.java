package DSA.Prefix_SubArrays;

import java.util.Arrays;

public class A1 {
    public static void main(String[] args) {
        int A = 5;
        int [][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};

        int [] finalAns = new int [A];
        for(int i = 0 ; i < B[0].length  ; i++){
            int alpha = B[i][0];
            int beta = B[i][1];
            finalAns[alpha-1] += B[i][2];

            if(beta >= A){
                continue;
            }

            finalAns[beta] -= B[i][2];
        }

        int [] result = new int [A];
        result[0] = finalAns[0];
        for(int i = 1 ; i < finalAns.length ; i++ ){
            result[i] = result[i-1] + finalAns[i];
        }

        System.out.println(Arrays.toString(result));

    }
}
