package DSA.Hashing;

import java.util.HashSet;

public class A2 {
    public static void main(String[] args) {
        int [][] A = {{5, 6},
                {2, 8},
                {-1, -1},
                {2, -3},
                {2, 8},
                {7, 7},
                {2, -3}};

        HashSet<String> hashSet = new HashSet<>();
        for(int i = 0 ; i < A.length ; i++){
            hashSet.add(A[i][0] + "," + A[i][1]);
        }

        System.out.println(hashSet.size());
    }
}
