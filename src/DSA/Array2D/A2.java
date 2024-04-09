package DSA.Array2D;

public class A2 {
    public static void main(String[] args) {
        int [][]A = {{1, 1},
        {1, 1}};

        int sum = 0;
        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < A[0].length ; j++){
                int a = (i+1) * (j+1);
                int b = (A.length-i) * (A.length-j);
                sum = sum + A[i][j] * a * b;
            }
        }
        System.out.println(sum);
    }
}
