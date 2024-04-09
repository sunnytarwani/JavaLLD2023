package DSA.Deque;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class A1 {
    public static void main(String[] args) {
        //String A = "abadbc";
        String A = "abcabc";

        HashMap<Character , Integer> hashMap = new HashMap<>();
        Deque<Character> deque = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0 ;i < A.length() ; i++){
            char ch = A.charAt(i);
            if(hashMap.containsKey(ch)){
                hashMap.put(ch , hashMap.get(ch) + 1);
            }
            else{
                hashMap.put(ch , 1);
                deque.addLast(ch);
            }


            while(!deque.isEmpty()  && hashMap.get(deque.peekFirst()) > 1){
                deque.removeFirst();
            }

            if(deque.isEmpty()){
                stringBuilder.append("#");
            }
            else{
                stringBuilder.append(deque.peekFirst());
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
