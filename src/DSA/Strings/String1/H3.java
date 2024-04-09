package DSA.Strings.String1;

public class H3 {
    public static void main(String[] args) {
        //String [] A = {"abcdefgh", "aefghijk", "abcefgh"};
        String [] A = {"abab", "ab", "abcd"};

        String result = A[0];
        for(int i = 1 ; i < A.length ;i++){
            result = check(result , A[i]);
        }

        System.out.println(result);
    }

    public static String check(String A , String B){
      int minLength = Math.min(A.length() , B.length());

      StringBuilder stringBuilder = new StringBuilder();
      for(int i = 0 ; i < minLength ; i++){
          if(A.charAt(i) == B.charAt(i)){
              stringBuilder.append(A.charAt(i));
          }
      }
      return stringBuilder.toString();
    }
}
