package DSA.Recursion;

import java.util.Stack;

public class SubsequenceSum {

    //public static HashSet<ArrayList<Integer>> hashSet = new HashSet<>();
    //public ArrayList<Integer>arrayList = new ArrayList<>();

    public static void main(String[] args) {
        int [] a = {1,2,1};
        Stack<Integer>stack = new Stack<>();
        checkSum(0 , a ,stack ,0 , 2, 3);
        //System.out.println(hashSet);
    }

    public static void checkSum(int i , int[]a , Stack<Integer>stack , int sum , int ans ,int length){
        if(i == length){
            if(sum == ans) {
                System.out.println(stack);
            }
            return;
        }
        stack.add(a[i]);
        sum += a[i];
        //        System.out.println("AL:" + stack + " i: " + i + " sum: " + sum );
        checkSum(i+1 , a , stack , sum , ans , length);
        sum -= a[i];
        stack.pop();
//        System.out.println("AL:" + stack + " i: " + i + " sum: " + sum );
        checkSum(i+1 , a , stack , sum  , ans , length);
    }
}
