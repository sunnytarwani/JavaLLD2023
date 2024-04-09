package DSA.Searching.Searching2;

public class H1 {
    public static void main(String[] args) {
        int A = 4;
        int B = 2;
        int C = 3;

        int low = Math.min(B,C);
        int high = A * low;
        int lcm = (B*C)/gcd(B , C);
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;

            //remember the formula, the complete question is based on this formula
            if((mid/B) + (mid/C) - (mid/lcm) == A){
                ans = mid;
                high = mid - 1;
            }
            else if ((mid/B) + (mid/C) - (mid/lcm) > A){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b , a%b);
    }
}
