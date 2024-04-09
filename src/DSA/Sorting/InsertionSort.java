package DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] A = {5,1,8,7,3,2,9,6,4};
        for(int i = 1 ; i < A.length ; i++){
            int key = A[i];
            int j = i-1;
            while(j>=0 && A[j] > key){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] =key;
        }

        System.out.println("Sorted Array is --> " + Arrays.toString(A));
    }
}
