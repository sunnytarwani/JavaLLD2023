package DSA.DynamicProgrammingTUF;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String A = "adebe";
        StringBuilder stringBuilder = new StringBuilder();
        printString(A , stringBuilder , 0 , A.length());
    }

    public static void printString(String a, StringBuilder stringBuilder, int i, int length) {
        if(i == length){
            System.out.println(stringBuilder.toString());
            return;
        }
        stringBuilder.append(a.charAt(i));
        printString(a , stringBuilder , i+1 , length);
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        printString(a , stringBuilder , i+1 , length);
    }

}
