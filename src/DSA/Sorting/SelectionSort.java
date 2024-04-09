package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] A = {4,6,7,5,2,9,1,8,3};
        for(int i = 0 ; i < A.length-1 ; i++){
            int min_element = i;
            for(int j = i ; j < A.length ; j++){
                if(A[j] < A[min_element]){
                    min_element = j;
                }
            }
            int temp = A[i];
            A[i] = A[min_element];
            A[min_element] = temp;
        }

        System.out.println("Sorted Arrays is -->" + Arrays.toString(A));
    }
}
