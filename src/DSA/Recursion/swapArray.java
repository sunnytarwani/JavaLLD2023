package DSA.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class swapArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a = sc.nextInt();

        int [] arr1 = new int[a];
        for(int i = 0 ; i < a ; i++){
            arr1[i] = sc.nextInt();
        }

        //System.out.println(Arrays.toString(swap(arr1  , 0 , a-1)));
        swap(arr1  , 0 , a-1);
    }

    public static void swap(int[]a , int start , int end){
        if(start>=end){
            System.out.println(Arrays.toString(a));
            return;
        }
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;

        swap(a , start+1 , end-1);
    }
}
