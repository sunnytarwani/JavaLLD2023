package DSA.Searching.Searching3;

public class A1 {
    public static void main(String[] args) {
        int A = 2;
        int B = 5;
        int [] C = {1, 10};
//        int A = 10;
//        int B = 1;
//        int [] C = {1, 8, 11, 3};

        int low = C[0];
        int sum = C[0];

        for(int i = 1 ; i < C.length ; i++){
            low = Math.max(low , C[0]);
            sum += C[i];
        }
        int high = sum;
        int ans = -1;


        while(low <= high){
            int mid = (low + high)/2;
            if(check(C , mid , A)){
                ans = mid * B;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean check(int [] A , int mid , int maxPainter){
        int count = 1;
        int time = 0;
        for(int i = 0 ; i < A.length ; i++){
            time += A[i];
            if(time > mid){
                count++;
                time = A[i];
            }
        }

        if(count > maxPainter){
            return false;
        }
        return true;
    }
}
