package DSA.Strings;

public class ValidPalindrome125 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase();

        int i = 0 ;
        int j = s.length()-1;

        while(i < j){

            if(!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 0 && s.charAt(i) <= 9)){
                i++;
                continue;
            }

            if(!(s.charAt(j) >= 'a' && s.charAt(j) <= 'z' || s.charAt(j) >= 0 && s.charAt(j) <= 9)){
                j--;
                continue;
            }

            if(s.charAt(i) != s.charAt(j)){
                System.out.println(false);
            }

            i++;
            j--;
        }

        System.out.println(true);
    }
}
