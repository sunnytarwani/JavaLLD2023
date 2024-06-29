package DSA.Strings;

public class IsSubsequence392 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        if(s.isEmpty()){
            System.out.println(true);;
        }
        int i = 0;
        int j = 0;

        while(i<s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else {
                j++;
            }

        }
        System.out.println(i==s.length());
    }
}
