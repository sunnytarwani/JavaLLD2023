package Callable.MergeSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(6,4,5,3,1,2);

        MergeSorter mergeSorter = new MergeSorter(list);

        List<Integer> finalAnswer = mergeSorter.call();

        System.out.println(finalAnswer);
    }
}
