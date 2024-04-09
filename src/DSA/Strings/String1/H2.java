package DSA.Strings.String1;

public class H2 {
    public static void main(String[] args) {
        String A = "the sky is blue";
        A.trim();

        int s = A.length()-1;
        StringBuilder stringBuilder = new StringBuilder();
        String result = "";
        while(s>=0){
            if(A.charAt(s) != ' '){
                stringBuilder.append(A.charAt(s));
            }
            if(A.charAt(s) == ' ' || s == 0){
                result += stringBuilder.reverse().toString() + " ";
                stringBuilder.setLength(0);
            }

            s--;
        }
        System.out.println(result);
    }
}
