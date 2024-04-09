package DSA.Prefix_SubArrays;

public class A4 {
    public static void main(String[] args) {
        int [] A = {0, 1, 0, 2};

        int [] B = new int [A.length];
        int [] C = new int [A.length];

        B[0] = A[0];
        C[A.length-1] = A[A.length-1];

        for(int i = 1 ; i < A.length ; i++){
            B[i] = Math.max(B[i-1] , A[i]);
        }

        for(int i = A.length-2 ; i>=0 ; i--){
            C[i] = Math.max(C[i+1] , A[i]);
        }

        int finalAns = 0;
        for(int i = 0 ; i < A.length ; i++){
            finalAns += ((Math.min(B[i] , C[i])) - A[i]);
        }

        System.out.println(finalAns);
    }
}
