package DSA.Searching.Searching3;

public class H1 {
    public static void main(String[] args) {
        int [] A = {12, 34, 67, 90};
        int B = 2;
//        int [] A = {12, 15, 78};
//        int B = 4;

        int low = A[0];
        int sum = A[0];
        for(int i = 1 ; i < A.length ; i++){
            low = Math.max(low , A[i]);
            sum += A[i];
        }

        int high = sum;
        int ans = -1;

        while(low <= high){
            int mid = (low +  high)/2;
            if(check(A , mid , B)){
                ans = mid;
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean check(int [] A , int mid , int B ){
        int reader = 1;
        int pages = 0;
        for(int i = 0 ; i < A.length ; i++){
            pages += A[i];
            if(pages > mid){
                reader++;
                pages = A[i];
            }
        }

        if(reader > B){
            return false;
        }

        return true;
    }
}
