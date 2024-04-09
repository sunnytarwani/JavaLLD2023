package DSA.Searching.Searching1;

public class H3 {
    public static void main(String[] args) {
        int [][]A = {{1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        int B = 3;

        int a = A.length;
        int b = A[0].length;
        int size = a*b-1;
        int s = 0;
        while(s <= size){
            int mid = (s+size)/2;
            int i = mid/b;
            int j = mid%b;

            System.out.println(mid + " --> " + i + " --> " + j);
            if(A[i][j] == B){
                System.out.println(1);
            }
            if (A[i][j] < B){
                s = mid + 1;
            }
            else{
                size = mid - 1;
            }
        }
    }
}
