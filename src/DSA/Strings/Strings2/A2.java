package DSA.Strings.Strings2;

import java.io.FilterOutputStream;

public class A2 {

    public static boolean checkPalindrome(int [] A , int [] B){
        for(int i = 0 ;i < A.length ; i++){
            if(A[i] != B[i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String A = "abc";
        String B = "abcbacabc";

//        String A = "aca";
//        String B = "acaa";

        int [] countA = new int [26];
        int [] countB = new int [26];

        for(int i = 0 ; i < A.length() ; i++){
            countA[A.charAt(i)-'a']++;
        }

        for(int i = 0 ; i < A.length() ; i++){
            countB[B.charAt(i)-'a']++;
        }

        int ans = 0;
        if(checkPalindrome(countA , countB)){
            ans++;
        }


        for(int i = A.length() ; i< B.length() ; i++){
            countB[B.charAt(i)-'a']++;
            countB[B.charAt(i-A.length()) - 'a']--;

            if(checkPalindrome(countA , countB)){
                ans++;
            }
        }

        System.out.println(ans);
    }
}
