package DSA.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int [] A , int s , int e){
        if(s>=e){
            return;
        }
        int p = pi(A , s , e);
        quickSort(A , s , p-1);
        quickSort(A , p+1 , e);
    }

    public static int pi(int [] A , int s , int e){
        int pi = A[e];
        int i = s-1;

        for(int j = s ; j < e ; j++){
            if(A[j] < pi){
                i++;
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
        i++;
        int temp = A[i];
        A[i] = A[e];
        A[e] = temp;
        return i;
    }


    public static void main(String[] args) {
        int [] A = {3,6,5,2,1,9,7,8,4};
        quickSort(A , 0 , A.length-1);
        System.out.println(Arrays.toString(A));
    }

}
