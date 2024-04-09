package Callable.MergeSorterPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MergerPractice implements Callable<List<Integer>> {
    public List<Integer> array;

    public MergerPractice(List<Integer> array){
        this.array = array;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(array.size()<=1){
            return array;
        }

        int mid = array.size() / 2;
        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray= new ArrayList<>();

        for(int i = 0 ; i < mid ; i++){
            leftArray.add(array.get(i));
        }

        for(int i = mid ; i < array.size() ; i++){
            rightArray.add(array.get(i));
        }

        MergerPractice leftNewArray = new MergerPractice(leftArray);
        MergerPractice rightNewArray = new MergerPractice(rightArray);


        List<Integer> leftSortedArray = leftNewArray.call();
        List<Integer> rightSortedArray = rightNewArray.call();

        int i = 0;
        int j = 0;

        List<Integer> finalSortedArray = new ArrayList<>();

        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                finalSortedArray.add(leftSortedArray.get(i));
                i++;
            } else if (leftSortedArray.get(i) > rightSortedArray.get(j)) {
                finalSortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while(i<leftSortedArray.size()){
            finalSortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j<rightSortedArray.size()){
            finalSortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return finalSortedArray;

    }
}
