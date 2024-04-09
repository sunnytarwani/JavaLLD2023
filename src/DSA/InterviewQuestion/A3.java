package DSA.InterviewQuestion;

import java.util.HashSet;

public class A3 {
    public static void main(String[] args) {
        int []A = {3, 4, -1, 1};
        HashSet<Integer> hs = new HashSet<>();
        for(int x : A){
            hs.add(x);
        }
        int a = 0;
        for(int i = 1 ; i <= A.length +1 ; i++){
            if(!hs.contains(i)){
                a = i;
                break;
            }
        }
        System.out.println(a);
    }
}
