package DSA.Strings;

import java.util.Arrays;

public class PatternMatching {
    public static void main(String[] args) {
        String A = "abababa";
        String B = "aba";
//        String A = "mississipi";
//        String B = "ss";
//        String A = "hello";
//        String B = "hi";

        String check = B+ "@" + A;
        int [] LPS = checkLPS(check);

        int count = 0;
        System.out.println(Arrays.toString(LPS));
        for(int i = 0 ; i < LPS.length ; i++){
            if(LPS[i] == B.length()){
                count++;
            }
        }

        System.out.println(count);
    }
    public static int[] checkLPS(String A){
        int length = A.length();
        int [] LPS = new int[length];
        LPS[0] = 0;

        for(int i = 1 ; i < length ; i++){
            int x = LPS[i-1];
            while(A.charAt(i) != A.charAt(x)){
                if(x == 0){
                    x = -1;
                    break;
                }
                x = LPS[x-1];
            }

            LPS[i] = x+1;
        }
        return LPS;

    }
}
