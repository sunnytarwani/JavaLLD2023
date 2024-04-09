package Callable.MergeSorterPractice;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> array = List.of(3, 4, 5, 7, 6, 2, 1);
        MergerPractice mergerPractice = new MergerPractice(array);

        List<Integer> ansArray = mergerPractice.call();
        System.out.println(ansArray);
    }
}
