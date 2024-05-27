package DSA.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

class Pair{
    int start;
    int end;

    public Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class NMeetingInOneRoom {
    public static void main(String[] args) {
        int s [] = {1,3,0,5,8,5};
        int f [] = {2,4,6,7,9,9};

        Pair[] newPair = new Pair[s.length];
        for(int i = 0 ; i < s.length ; i++){
            newPair[i] = new Pair(s[i] , f[i]);
        }

        Arrays.sort(newPair, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.end > o2.end){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });

        int count = 1;
        int i = 0;
        int j = 1;

        while(j < newPair.length){
            if(newPair[i].end < newPair[j].start){
                count++;
                i=j;
            }
            j++;
        }
        System.out.println(count);
    }
}
