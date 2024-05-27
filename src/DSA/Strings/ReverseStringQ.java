package DSA.Strings;

import java.util.Arrays;
import java.util.logging.Level;

public class ReverseStringQ {
    public static void main(String[] args) {
        String s = "a good   example";
        String [] words= s.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1 ; i>=0 ; i--){
            sb.append(words[i]).append(" ");
        }


        System.out.println(sb.toString().trim());
//        StringBuilder stringBuilder = new StringBuilder();
//        s.trim();
//        int len = s.length()-1;
//        String ans = "";
//
//        while(len >= 0){
//            if(s.charAt(len) != ' '){
//                stringBuilder.append(s.charAt(len));
//            }
//            if(s.charAt(len) == ' '|| len == 0){
//                if(stringBuilder.isEmpty()){
//                    ans.trim();
//                }
//                ans += stringBuilder.reverse().toString() + " ";
//                stringBuilder.setLength(0);
//            }
//
//            len--;
//
//        }
//
//        System.out.println(ans);
    }
}
