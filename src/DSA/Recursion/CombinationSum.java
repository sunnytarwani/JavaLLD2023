package DSA.Recursion;

import java.util.ArrayList;

public class CombinationSum {
    public static void main(String[] args) {
        int target = 7;
        int[] a = {2,3,6,7};
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> finalArrayList = new ArrayList<>();
        checkSum(0 , arrayList , finalArrayList  , target , a);
        System.out.println(finalArrayList);
    }

    public static void checkSum(int i , ArrayList<Integer> arrayList , ArrayList<ArrayList<Integer>> finalArrayList , int target , int []a ){
        if(i == a.length){
           if(target == 0){
               finalArrayList.add(new ArrayList<>(arrayList));
           }
           return;
        }

        if(a[i] <= target){
            arrayList.add(a[i]);
            checkSum(i  , arrayList , finalArrayList  , target - a[i] , a);
            arrayList.remove(arrayList.size()-1);
        }
        checkSum(i+1 , arrayList , finalArrayList , target , a);
    }
}
