package DSA.Hashing;

import java.util.HashSet;

public class H1 {
    public static void main(String[] args) {
        int A = 236;

        char[] B = Integer.toString(A).toCharArray();
        HashSet<Integer> hashSet= new HashSet<>();

        for(int i = 0 ; i < B.length ; i++){
            int product =1;
            for(int j = i ; j< B.length ; j++){
                product *= B[j] - '0';
                if(hashSet.contains(product)){
                    System.out.println(0);
                }
                hashSet.add(product);
            }
        }

        System.out.println(1);
    }
}
