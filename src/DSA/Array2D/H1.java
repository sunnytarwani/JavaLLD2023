package DSA.Array2D;

public class H1 {
    public static void main(String[] args) {
        int [][]A = {{0, 0, 0, 0},
        {0, 0, 0, 1},
                {0, 0, 1, 1},
        {0, 1, 1, 1}};

        int i = 0;
        int j = A.length-1;
        int ans = 0;

        while(i < A.length && j >= 0){
            if(A[i][j] == 1){
                j--;
                ans = i;
            }
            else{
                i++;
            }
        }
        System.out.println(ans);
    }

}
