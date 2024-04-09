package DSA.Sorting.SortingProblems.PART3;

import java.util.Arrays;
import java.util.Comparator;

public class A32 {
    static class Activity{
        public int start;
        public int end;

        public Activity(int start , int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        int [] A = {5, 1, 3, 0, 5, 8};
        int [] B = {9, 2, 4, 6, 7, 9};

        Activity [] activities =new Activity[A.length];
        for(int i = 0 ; i < A.length ; i++){
            activities[i] = new Activity(A[i] , B[i]);
        }

        Arrays.sort(activities, new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                if(o1.end > o2.end){
                    return 1;
                }
                else if (o1.end < o2.end){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });

        int e = 1;
        for(Activity a : activities){
            System.out.println(e++ + " " + a.start + " " +a.end);
        }

        int count = 1;
        int i = 0;

        for(int j = 1 ; j < A.length ; j++){
            if(activities[j].start >= activities[i].end){
                count++;
                i = j;
            }
        }

        System.out.println(count);
    }
}
