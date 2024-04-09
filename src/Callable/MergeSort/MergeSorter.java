package Callable.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> arrayToSort;

    public MergeSorter(List<Integer> arrayToSort){
        this.arrayToSort = arrayToSort;
    }


    @Override
    public List<Integer> call() throws Exception {
       if(arrayToSort.size() <= 1){
           return arrayToSort;
       }

       int mid = arrayToSort.size()/2;

       List<Integer> leftArray = new ArrayList<>();
       List<Integer> rightArray = new ArrayList<>();

       for(int i = 0 ; i < mid ; i++){
           leftArray.add(arrayToSort.get(i));
       }

        for(int i = mid ; i < arrayToSort.size() ; i++){
            rightArray.add(arrayToSort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftArray);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray);

        List<Integer> leftSortedArray = leftMergeSorter.call();
        List<Integer> rightSortedArray = rightMergeSorter.call();


        //Merge the two sorted array
        int i = 0;
        int j = 0;

        List<Integer> finalSortedArray = new ArrayList<>();

        while(i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                finalSortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else if(leftSortedArray.get(i) > rightSortedArray.get(j)){
                finalSortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while (i < leftSortedArray.size()){
            finalSortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j < rightSortedArray.size()){
            finalSortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return finalSortedArray;
     }
}
