package thread_new;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class mergeSorter implements Callable<List<Integer>> {
    List<Integer> list;
    public mergeSorter(List<Integer> list) {
        this.list = list;
    }

    @Override
    public List<Integer> call() throws Exception {
        //Logic of the merge sort
        if(list.size() <= 1){
            return list;
        }

        int mid = list.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i = 0 ; i < mid ; i++){
            leftArray.add(list.get(i));
        }

        for(int i = mid ; i < list.size() ; i++){
            rightArray.add(list.get(i));
        }

        mergeSorter leftMerge = new mergeSorter(leftArray);
        mergeSorter rightMerge = new mergeSorter(rightArray);

        ExecutorService es = Executors.newCachedThreadPool();


        Future<List<Integer>> leftSortedArrayfut = es.submit(leftMerge);
        Future<List<Integer>> rightSortedArrayfut = es.submit(rightMerge);

        //our code will wait until it gets the left and right sorted array futures filled
        List<Integer> leftSortedArray = leftSortedArrayfut.get();
        List<Integer> rightSortedArray = rightSortedArrayfut.get();

        //merge the two sorted array
        int i =0;
        int j =0;
        List<Integer> finalAns = new ArrayList<>();

        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                finalAns.add(leftSortedArray.get(i));
                i++;
            }
            else{
                finalAns.add(rightSortedArray.get(j));
                j++;
            }
        }

        while(i<leftSortedArray.size()){
            finalAns.add(leftSortedArray.get(i));
            i++;
        }
        while(j<rightSortedArray.size()){
            finalAns.add(rightSortedArray.get(j));
            j++;
        }

        return finalAns;
    }
}
