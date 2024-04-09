package DSA.Array2D;

public class A4 {
    public static void main(String[] argsol) {
        int [][]A = {{1, 2},
        {3, 3}};
        int B = 3;

        int i = 0;
        int j = A[0].length-1;
        int sol = 0;
        int sol1 = Integer.MAX_VALUE;

        while(i<A.length && j>=0){
            if(A[i][j] < B){
                i++;
            }
            else if(A[i][j] > B){
                j--;
            }
            else if(A[i][j] == B){
                sol = ((i+1) * 1009 )+(j+1);
                sol1 = Math.min(sol1 , sol);
                j--;
            }
        }

        if(sol1 == Integer.MAX_VALUE){
            System.out.println("-1");
        }
        System.out.println(sol1);
    }
}
