package DSA.Strings.Strings2;

import java.util.Arrays;

public class H1 {
    public static void main(String[] args) {
        String A = "cat";
        String B = "bat";

//        String A = "secure";
//        String B = "rescue";

        char [] A1 = A.toCharArray();
        char [] B1 = B.toCharArray();
        Arrays.sort(A1);
        Arrays.sort(B1);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        if(A1.length == B1.length){
            for(int i = 0 ; i < A1.length ; i++){
                sb.append(A1[i]);
            }
            for(int i = 0 ; i < B1.length ; i++){
                sb1.append(B1[i]);
            }
            if(sb.toString().equals(sb1.toString())){
                System.out.println(1);
            }
        }
        System.out.println(0);
    }
}
