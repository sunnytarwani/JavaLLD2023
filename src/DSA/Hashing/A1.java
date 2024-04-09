package DSA.Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class A1 {
    public static void main(String[] args) {
        int [] A = {7, 1, 3, 4, 1, 7};
        int minimumShaggyDistance = Integer.MAX_VALUE;

        HashMap<Integer , Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < A.length ; i++){
            if(hashMap.containsKey(A[i])){
                minimumShaggyDistance = Math.min(Math.abs(hashMap.get(A[i]) - i) , minimumShaggyDistance);
            }
            else{
                hashMap.put(A[i] , i);
            }
        }

        if(minimumShaggyDistance == 0){
            System.out.println("-1");
        }
        System.out.println(minimumShaggyDistance);
    }
}
