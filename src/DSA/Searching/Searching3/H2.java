package DSA.Searching.Searching3;

public class H2 {
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        int B = 10;

//        int [] A = {5, 17, 100, 11};
//        int B = 130;

        int low = 1;
        int high = A.length;

        int ans = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(check(A , mid , B)){


            }
        }
        System.out.println(ans);
    }

    public static boolean check(int [] A , int mid , int B){
        int sum = 0;
        for(int i = 0 ; i < mid ; i++){
            sum += A[i];
        }

        int max = sum;

        for(int i = mid ; i < A.length ; i++){
            sum += A[i] - A[i-mid];
            max = Math.max(max , sum);
        }

        if(max <= B){
            return true;
        }
        return false;
    }
}
