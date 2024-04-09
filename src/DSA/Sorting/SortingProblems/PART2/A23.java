package DSA.Sorting.SortingProblems.PART2;

import java.util.ArrayList;
import java.util.Comparator;

public class A23 {
    public static void main(String[] args) {
//        int [] A = {3, 30, 34, 5, 9};
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(30);
        arrayList.add(34);
        arrayList.add(5);
        arrayList.add(9);


        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String alpba = Integer.toString(o1) + Integer.toString(o2);
                String beta = Integer.toString(o2) + Integer.toString(o1);

                return beta.compareTo(alpba);
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for(int a : arrayList){
            stringBuilder.append(a);
        }

        System.out.println(stringBuilder.toString());
    }
}
