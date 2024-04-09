package DSA.Strings.String1;

public class H7 {
    public static void main(String[] args) {
        String A = "abobc";
        //String A = "bobob";

        int count = 0;
        for(int i = 0 ; i < A.length() ; i++){
            if(i+2<A.length()){
                if(A.charAt(i)=='b' && A.charAt(i+1)=='o' && A.charAt(i+2)=='b' ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
