package DSA.Searching.Searching1;

public class H1 {
    public static void main(String[] args) {
//        int [] A = {1, 3, 5, 6};
//        int B = 5;

        int [] A = {1, 4, 9};
        int B = 3;

        int i = 0 ;
        int j = A.length-1;

        while(i<=j){
            int mid =(i+j)/2;
            if(A[mid] == B){
                System.out.println(mid);
                break;
            }
            else if (A[mid] > B){
                j = mid - 1;
            }
            else {
                i = mid + 1;
            }
        }

        System.out.println(i);
    }
}
