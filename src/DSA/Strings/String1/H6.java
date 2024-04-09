package DSA.Strings.String1;

import java.util.Arrays;

public class H6 {
    public static void main(String[] args) {
        String A = "abcabbccd";
        int B = 3;


        int n = A.length();
        //edge cases
        if (B >= n) {
            System.out.println(1);;
        }


        //create a frequency array
        int freq[] = new int[26];
        for (int i = 0; i < n; i++) {
            int index = A.charAt(i) - 'a';
            freq[index]++;
        }


        //calculate total charaters
        int total = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                total++;
            }
        }


        //sort the freq array
        Arrays.sort(freq);
        //Calculate changes
        int changes = 0;
        for (int i = 0; i <26; i++) {
            if (freq[i] != 0 && B - freq[i] >= 0) {
                B -= freq[i];
                changes++;
            }
        }

        //return min distinct characters
        System.out.println(total-changes);

    }
}
