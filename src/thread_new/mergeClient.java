package thread_new;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class mergeClient {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(7,3,4,1,9,8,2,6);
        mergeSorter ms = new mergeSorter(list);

        ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Integer>> sortedList = es.submit(ms);
        System.out.println(sortedList.get());
    }
}
