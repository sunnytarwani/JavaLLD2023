package Generics.UpperLowerBound;

import java.util.ArrayList;
import java.util.List;

public class MainTriplet {
    public static void main(String[] args) {
        Triplet<String> t1 = new Triplet<>("SUNNY" , "KETAN" , "JYOTI");
        Triplet<String> t2 = new Triplet<>("Tarwani" , "TARwani" , "tarwani");
        Triplet<Integer> t3 = new Triplet<>(4 , 17 , 5);
        Triplet<Integer> t4 = new Triplet<>(10 , 12 , 14);

        //List<Triplet<String>> l1 = List.of(t1 , t2);
        List<Triplet<Integer>> l2 = List.of(t3 , t4);

        //print(l1);
        //System.out.println("-------------");
        System.out.println(calculateAvg(t3));
    }

    public static <TYPE> void print(List<Triplet<TYPE>> triplets){
        for(Triplet<TYPE> t1 :triplets ){
            System.out.println(t1.getFirst() + " " +
            t1.getSecond() + " " +
             t1.getThird() + " ");
        }
    }

    /**
     * Triplet<? extends Number>
     *     this is a upper bound generic collection
     *     this says we can pass anything which is child class of number or number class.
     *     this is call upper bound, bcoz we have given the upper class.
     */
    public static double calculateAvg(Triplet<? extends Number> triplet){
        return (triplet.getFirst().doubleValue() +
                triplet.getSecond().doubleValue() +
                triplet.getThird().doubleValue()) / 3;
    }

    /**
     * Triplet<? super Integer>
     *     this is a lower bound in generic collection
     *     which means we can pass anything below integer and integer
     *     this is call lower bound bcoz we give super and upto bound value
     */
}
