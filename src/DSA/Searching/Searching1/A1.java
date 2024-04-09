package DSA.Searching.Searching1;

import java.util.Arrays;

public class A1 {
    public static void main(String[] args) {
        int [] A = {5, 7, 7, 8, 8, 10};
        int B = 8;

        int l =  -1;
        int m = -1;



        int i = 0;
        int j = A.length-1;

        while(i<=j){
            int mid = (i+j)/2;
            if(A[mid] == B ){
                l = mid;
                j = mid -1;
            }
            else if(A[mid] > B){
                j = mid - 1;
            }
            else {
               i = mid+1;
            }
        }

        i = 0;
        j = A.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(A[mid] == B ){
                m = mid;
                i = mid+1;
            }
            else if(A[mid] > B){
                j = mid - 1;
            }
            else {
                i = mid +1;
            }
        }

       int [] ans = {l , m};
        System.out.println(Arrays.toString(ans));
    }
}
