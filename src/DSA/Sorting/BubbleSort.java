package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] A = {8,6,7,4,5,3,2,1,9};
        for(int i = 0 ; i < A.length-1 ; i++){
            for(int j = 0 ; j < A.length-1-i ; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array is: --> " + Arrays.toString(A));
    }
}
