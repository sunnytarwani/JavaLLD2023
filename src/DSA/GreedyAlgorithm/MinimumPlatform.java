package DSA.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

class PairNew{
    int start;
    int end;

    public PairNew(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class MinimumPlatform {
    public static void main(String[] args) {


        int[] arrival = {50, 120, 200, 550, 700, 850};
        int[] departure = {500, 550, 600, 700, 900, 1000};

        PairNew[] train = new PairNew[arrival.length];
        for (int i = 0; i < arrival.length ; i++){
            train[i] = new PairNew(arrival[i],departure[i]);
        }

        Arrays.sort(train, new Comparator<PairNew>() {
            @Override
            public int compare(PairNew o1, PairNew o2) {
                if(o1.start > o2.start){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });

        int count = 1;
        int result = 1;

        int i = 1 ;
        int j = 0;

        while(i< arrival.length && j< arrival.length){
            if(arrival[i] <= departure[j]){
                count++;
                i++;
            } else if (arrival[i] > departure[j]) {
                count--;
                j++;
            }
            if(count>result){
                result=count;
            }
        }

        System.out.println(result);
    }
}
