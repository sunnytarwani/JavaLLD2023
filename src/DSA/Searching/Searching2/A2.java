package DSA.Searching.Searching2;

public class A2 {
    public static void main(String[] args) {
        int [] A = {4, 5, 6, 7, 0, 1, 2, 3};
        int B = 2;

//        int [] A : {9, 10, 3, 5, 6, 8 };
//        int B : 5;


        int s = 0;
        int e = A.length-1;
        int ans = 0;

        while(s<=e){
            int mid = (s+e)/2;
            if(A[mid] == B){
                ans = mid;
                break;
            }
            else if(A[mid] >= A[s]){
                if(A[s] <= B && A[mid] >= B ){
                    e = mid - 1;
                }
                else {
                    s = mid + 1;
                }
            }
            else {
                if(A[mid] <= B && A[e] >= B ){
                    s = mid + 1;
                }
                else {
                    e = mid - 1;
                }
            }
        }
        System.out.println(ans);
    }
}
