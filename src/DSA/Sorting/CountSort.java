package DSA.Sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int [] A = {1,1,2,2,1,1,2,3,3,2,1,3,2,1,3};

        int max = -1;
        for(int x : A){
            max = Math.max(max , x);
        }

        int [] storeNumber = new int [max+1];
        for(int x : A){
            storeNumber[x]++;
        }

        int i = 0;
        int j = 0;
        while(i <= max){
            if(storeNumber[i] > 0){
                A[j++] = i;
                storeNumber[i]--;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(A));
    }
}
