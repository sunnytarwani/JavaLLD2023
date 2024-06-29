package DSA.SlidingWindow;

import java.util.LinkedList;
import java.util.Queue;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        String s = "abcabcbb";

        Queue<Character> queue = new LinkedList<>();

        int i = 0;
        int j = 0;
        int maxSize = 0;

        while(j < s.length()){
            if(!queue.contains(s.charAt(j))){
                queue.add(s.charAt(j));
                maxSize =Math.max(maxSize , queue.size());
                j++;
            }
            else{
                while(queue.contains(s.charAt(j))){
                    queue.remove(s.charAt(i));
                    i++;
                }
            }
        }

        System.out.println(maxSize);
    }
}
