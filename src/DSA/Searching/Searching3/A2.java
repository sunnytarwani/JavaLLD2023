package DSA.Searching.Searching3;

import java.util.Arrays;

public class A2 {
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        int B = 3;

//        int [] A = {1, 2};
//        int B = 2;
        Arrays.sort(A);
        int low = 0;
        int high = A[A.length-1] - A[0];
        int ans = 0;

        while(low <= high){
            int mid = (low+high)/2;
            if(check(A , mid , B)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1 ;
            }
        }

        System.out.println(ans);
    }

    public static boolean check(int [] A , int mid , int B){
        int c1 = 1;
        int c2 = A[0];
        for(int i = 1 ; i < A.length ; i++){
            if(A[i] - c2 >= mid){
                c1++;
                c2 = A[i];
                if(c1 == B){
                    return true;
                }
            }
        }
        return false;
    }
}
