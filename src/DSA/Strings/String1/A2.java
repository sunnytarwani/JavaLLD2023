package DSA.Strings.String1;

public class A2 {
    public static void main(String[] args) {
        //String A = "aaaabaaa";
        String A = "abbacaabbaaf";

        String ans = "";
        for(int i = 0 ; i < A.length() ; i++){
            if(check(A , i , i).length() > ans.length()){
                ans = check(A , i , i);
            }
            if(check(A , i , i+1).length() > ans.length()){
                ans = check(A , i , i+1);
            }
        }

        System.out.println(ans);
    }
    public static String check(String A , int start , int end){
        while(start >= 0 && end < A.length() && A.charAt(start) == A.charAt(end) ){
            start--;
            end++;
        }

        return A.substring(start+1 , end);
    }
}
