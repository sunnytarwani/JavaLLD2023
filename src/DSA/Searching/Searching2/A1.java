package DSA.Searching.Searching2;

public class A1 {
    public static void main(String[] args) {
        int [] A = {1, 1, 7};

        if(A.length == 1 ||A[0] != A[1]){
            System.out.println(A[0]);
        }

        if(A[A.length-1] != A[A.length-2]){
            System.out.println(A[A.length-1]);
        }

        int s = 0;
        int e = A.length-1;

        while(s<=e){
            int mid = (s+e)/2;
            if(A[mid] != A[mid-1] && A[mid] != A[mid+1] ){
                System.out.println(A[mid]);
                break;
            }
            if(A[mid] == A[mid-1]){
                mid = mid -1 ;
            }
            if(mid % 2 == 0){
                s = mid + 2;
            }
            else {
                e = mid - 1;
            }
        }
        System.out.println(-1);
    }
}
