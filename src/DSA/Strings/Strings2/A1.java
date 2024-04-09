package DSA.Strings.Strings2;

import java.util.HashSet;

public class A1 {
    public static void main(String[] args) {
        String A = "abcabcbb";
        //String A = "AaaA";

        HashSet<Character> hashSet = new HashSet<>();

        int start = 0;
        int end = 0;

        int ans = 0;

        while(end<A.length()){
            if(!hashSet.contains(A.charAt(end))){
                hashSet.add(A.charAt(end));
                end++;
                ans = Math.max(ans , hashSet.size());
            }
            else{
                hashSet.remove(A.charAt(start));
                start++;
            }
        }

        System.out.println(ans);
    }
}
