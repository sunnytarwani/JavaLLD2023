package DSA.Hashing;

import java.util.HashSet;

public class A3 {
    public static void main(String[] args) {
        int [] A = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> hashSet = new HashSet<>();

        for(int x: A){
            hashSet.add(x);
        }

        int maxLength = Integer.MIN_VALUE;
        for(int i = 0 ;i < A.length ; i++){
            int val = A[i];
            int length = 0;
            if(!hashSet.contains(A[i]-1)){
                while(hashSet.contains(val)){
                    val++;
                    length++;
                }
                maxLength = Math.max(maxLength , length);
            }
        }

        System.out.println(maxLength);
    }
}
