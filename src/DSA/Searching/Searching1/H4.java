package DSA.Searching.Searching1;

public class H4 {
    public static void main(String[] args) {
        int [] A = {3, 9, 10, 20, 17, 5, 1};
        int B = 20;


        //To find the mid of biotonic array
        int s = 0;
        int max = 0;
        int e = A.length-1;

        while(e>=s){
            int mid = (s+e)/2;
            if(A[mid] > A[mid-1] && A[mid] > A[mid+1] ){
                max = mid;
                break;
            }
            else if (A[mid] > A[mid+1]){
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }


        //first part of biotonic array (Normal Array)
        s = 0;
        e = max;
        while(e>=s){
            int mid = (s+e)/2;
            if(A[mid]==B){
                System.out.println(mid);;
            }
            else if (A[mid]<B){
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }

        //Second part of the biotonic array (Not normal array)
        s = max;
        e = A.length-1;
        while(e>=s){
            int mid = (s+e)/2;
            if(A[mid]==B){
                System.out.println(mid);
            }
            else if (A[mid]>B){
                s = mid+1;
            }
            else {
                e = mid -1;
            }
        }
        System.out.println(-1);
    }
}
