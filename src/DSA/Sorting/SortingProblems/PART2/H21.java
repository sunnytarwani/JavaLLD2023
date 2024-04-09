package DSA.Sorting.SortingProblems.PART2;

import java.util.Arrays;
import java.util.Comparator;

public class H21 {
    public static void main(String[] args) {
        int [][]A = {{1, -1},
                {2, -1}};
        int B = 1;

        int [][]res = new int[B][A[0].length];

        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int alpha = (o1[0]*o1[0]) + (o1[1]*o1[1]);
                int beta = (o2[0]*o2[0]) + (o2[1]*o2[1]);

                return alpha-beta;
            }
        });

        for(int i = 0 ; i < B ; i++){
            res[i][0] = A[i][0];
            res[i][1] = A[i][1];
        }

        for(int [] a : res){
            System.out.println(Arrays.toString(a));
        }
    }
}
