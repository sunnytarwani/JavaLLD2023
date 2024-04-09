package DSA.Strings.Strings2;

import java.util.HashMap;

public class H2 {
    public static void main(String[] args) {
        String A = "abcde";
        //String A = "abbaee";

        int n = A.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){

            char ch = A.charAt(i);
            if(map.containsKey(ch)){
                //remove the Character
                map.remove(ch);
            }
            else{
                //adding in map
                map.put(ch,1);
            }
        }


        if( map.size() == 0 || map.size() == 1 ){
            System.out.println(1);
        }
        System.out.println(0);

    }
}
