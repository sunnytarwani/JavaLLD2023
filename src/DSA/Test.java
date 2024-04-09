package DSA;

public class Test {
    public static void main(String[] args) {
        String A = "abc";
        String B = "abcbacabc";

        int n = A.length();

        int [] alphaA =  new int [26];
        int [] alphaB =  new int [26];

        for(int i = 0 ; i < n ; i++){
            alphaA[A.charAt(i)-'a']++;
        }
        for(int i = 0 ; i < n ; i++){
            alphaB[B.charAt(i)-'a']++;
        }

        int finalAns = 0;
        if(compareArrays(alphaA , alphaB)){
            finalAns++;
        }

        for(int i = n ; i< B.length() ; i++){
            alphaB[B.charAt(i)-'a']++;
            alphaB[(B.charAt(i-n) - 'a')]--;


            if(compareArrays(alphaA , alphaB)){
                finalAns++;
            }
        }

        System.out.println(finalAns);
    }


    public static boolean compareArrays(int [] A , int [] B){
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] != B[i]){
                return false;
            }
        }
        return true;
    }
}
