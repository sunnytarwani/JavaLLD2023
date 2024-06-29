package DSA.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubStringWithAllConcatenation30 {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String []words = {"foo","bar"};

        HashMap<String  , Integer> hashMap = new HashMap<>();
        for(String word : words){
            hashMap.put(word , hashMap.getOrDefault(word , 0) + 1);
        }

        int len = words[0].length();

        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i <= s.length() - len* words.length-1 ; i++){
            HashMap<String  , Integer> copyHashMap = new HashMap<>(hashMap);

            for(int j = 0 ; j < words.length ; j++){
                String str = s.substring( i + j*len , i + j*len + len);

                if(copyHashMap.containsKey(str)){
                    if(copyHashMap.get(str) == 1){
                        copyHashMap.remove(str);
                    }
                    else if (copyHashMap.get(str) > 1){
                        copyHashMap.put(str , copyHashMap.get(str) - 1);
                    }

                    if(copyHashMap.isEmpty()){
                        arrayList.add(i);
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }

        System.out.println(arrayList);
    }
}
