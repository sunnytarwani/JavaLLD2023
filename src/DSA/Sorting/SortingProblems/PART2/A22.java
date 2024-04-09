package DSA.Sorting.SortingProblems.PART2;

import java.util.ArrayList;
import java.util.Comparator;

public class A22 {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(9);
//        arrayList.add(6);
//        arrayList.add(8);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(7);

        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return factor(o1) - factor(o2);
            }
        });

        System.out.println(arrayList);
    }

    public static int factor(int a){
        int count = 0;
        for(int i = 1 ; i <= a/2 ; i++){
            if(a%i == 0){
                count++;
            }
        }
        return count;
    }
}
