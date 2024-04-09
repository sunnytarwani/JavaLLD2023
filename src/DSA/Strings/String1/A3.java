package DSA.Strings.String1;

public class A3 {
    public static void main(String[] args) {
        //String A = "Hello"
        String A = "tHiSiSaStRiNg";
        String result = "";

//        for(int i = 0 ; i < A.length() ; i++){
//            result += (char)(A.charAt(i) ^ (1<<5));
//        }
//        System.out.println(result);

        char [] B = A.toCharArray();
        for(int i = 0 ; i < B.length ; i++){
            if(B[i] >= 'A' && B[i] <= 'Z'){
                B[i] = (char)('a' + (B[i] - 'A'));
            }
            else if(B[i] >= 'a' && B[i] <= 'z'){
                B[i] = (char)('A' + (B[i] - 'a'));
            }
        }
        A = String.valueOf(B);
        System.out.println(A);

    }
}
