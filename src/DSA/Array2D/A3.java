package DSA.Array2D;

public class A3 {
    public static void main(String[] args) {
        int [] [] A = {{-8, 1, 1},
        {-1, 6, 6},
        {7, 10, 10}};

        for(int i = A.length-1 ; i>=0 ;i-- ){
            for(int j = A.length -2 ; j>= 0 ; j--){
                A[i][j] = A[i][j] + A[i][j+1];
            }
        }

        int finalAns = 0;
        for(int i = A.length-1 ; i>=0 ;i-- ){
            for(int j = A.length -2 ; j>= 0 ; j--){
                A[j][i] = A[j][i] + A[j+1][i];
            }
        }

        for(int i = A.length-1 ; i>=0 ;i-- ){
            for(int j = A.length -2 ; j>= 0 ; j--){
                finalAns = Math.max(finalAns , A[i][j]);
            }
        }
        System.out.println(finalAns);
    }
}
