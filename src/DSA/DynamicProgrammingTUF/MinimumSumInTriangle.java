package DSA.DynamicProgrammingTUF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumSumInTriangle {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        int N = 4;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        arrayList.add(al);

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(3);
        al1.add(4);
        arrayList.add(al1);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(6);
        al2.add(5);
        al2.add(7);
        arrayList.add(al2);

        ArrayList<Integer> al3 = new ArrayList<>();
        al3.add(4);
        al3.add(1);
        al3.add(8);
        al3.add(3);
        arrayList.add(al3);

       int [][] dp = new int [N][N];
       for(int [] a : dp){
           Arrays.fill(a , -1);
       }

        System.out.println(minSum(0,0,dp,arrayList,N));
    }

    public static int minSum(int i, int j, int[][] dp, ArrayList<ArrayList<Integer>> arrayList , int N) {
        if(i==N-1){
            return arrayList.get(N-1).get(j);
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int down = arrayList.get(i).get(j) + minSum(i+1, j , dp , arrayList , N);
        int diagonal= arrayList.get(i).get(j) + minSum(i+1, j+1 , dp , arrayList , N);


        return dp[i][j] = Math.min(down , diagonal);
    }
}
