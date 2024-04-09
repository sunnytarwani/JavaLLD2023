package DSA.Searching.Searching2;

public class A3 {
    public static void main(String[] args) {
        int A = 11;
        //int A = 9;

        long s = 0;
        long e = A;
        long a = 0;

        while(e>=s){
            long mid = (s+e)/2;
            if( mid*mid > A){
                e = mid - 1;
            }
            else if( mid*mid <= A){
                a = mid;
                s = mid+1;
            }
        }
        System.out.println(a);
    }
}
