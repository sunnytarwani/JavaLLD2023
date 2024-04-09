package DSA.InterviewQuestion;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Interval {
    int start;
    int end;
     public Interval() {
         this.start = 0;
         this.end = 0;
     }
     public Interval(int s, int e) {
         start = s;
         end = e;
     }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public static ArrayList Solution(ArrayList<Interval> arrayList , Interval merge){
         ArrayList<Interval> result = new ArrayList<>();

         for(Interval i : arrayList){
             if(i.end < merge.start){
                 result.add(i);
             }
             else if (i.start > merge.end){
                 result.add(merge);
                 merge=i;
             }
             else{
                 merge.start = Math.min(i.start , merge.start);
                 merge.end = Math.max(i.end , merge.end);

             }
         }

         result.add(merge);
         return result;
     }

    public static void main(String[] args) {
        ArrayList<Interval> arrayList = new ArrayList<>();
        arrayList.add(new Interval(1,3));
        arrayList.add(new Interval(6,9));

        Interval test = new Interval(2,5);
        ArrayList<Interval> result = Solution(arrayList , test);
//        for(int i = 0 ; i < result.size() ; i++ ){
//            System.out.println(result.get(i));
//        }
        System.out.println(result);
    }
}
