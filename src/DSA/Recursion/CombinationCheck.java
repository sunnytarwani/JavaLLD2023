package DSA.Recursion;

import java.util.ArrayList;
import java.util.HashSet;

public class CombinationCheck {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;

        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<ArrayList<Integer>> hashSet = new HashSet<>();

        checkCombination( 1 , n , k , arrayList , hashSet );
        System.out.println(hashSet);
    }

    public static void checkCombination( int j ,int n, int k, ArrayList<Integer> arrayList, HashSet<ArrayList<Integer>> hashSet) {

        if(arrayList.size() == k){
            hashSet.add(new ArrayList<>(arrayList));
            return;
        }

        for(int i = j ; i <= n ; i++){
            arrayList.add(i);
            checkCombination(i+1 , n , k , arrayList , hashSet);
            arrayList.remove(arrayList.size()-1);

        }
    }

}
