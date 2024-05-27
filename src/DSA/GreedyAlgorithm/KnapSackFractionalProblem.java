package DSA.GreedyAlgorithm;


import java.util.Arrays;
import java.util.Comparator;

class Fraction{
    int weight;
    int value;
    double perKg;
    public Fraction(int weight , int value){
        this.weight = weight;
        this.value = value;
        perKg = (double)value / (double)weight;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "weight=" + weight +
                ", value=" + value +
                ", perKg=" + perKg +
                '}';
    }
}
public class KnapSackFractionalProblem {
    public static void main(String[] args) {
        int [] weight = {88,17,36,79,60,11,69,49,93,63,86,59,15,92,66,9,70,72,92,83,45,5,21,66,66,68,9,74,16,89,30,54,68,49,57,99,68,39,67,69,31,88,46,64,100,27,81,44,70,45,59,19,45,18,57,37,32,94,35,47,29,9,91,17,24,39,46,42,36,45,69,99,93,83,42,60,56};
        int [] value = {84,76,66,82,29,22,48,38,9,41,59,42,30,73,10,58,51,29,22,68,48,16,98,49,70,84,60,35,8,22,6,85,59,92,95,27,82,70,60,71,99,54,51,24,100,48,87,67,75,78,37,93,3,85,85,78,61,62,63,89,20,59,95,10,28,99,89,15,11,18,94,32,63,66,89,55,65};
        int givenWeight = 83;

        Fraction [] greedyCheck = new Fraction[weight.length];
        for(int i =0 ; i< weight.length ; i++){
            greedyCheck[i] = new Fraction(weight[i] , value[i]);
        }

        Arrays.sort(greedyCheck, new Comparator<Fraction>() {
            @Override
            public int compare(Fraction o1, Fraction o2) {
                if(o1.perKg > o2.perKg){
                    return -1;
                }
                else if(o1.perKg < o2.perKg) {
                    return 1;
                }
                else{
                    return 0;
                }
            }
        });

//        for(Fraction f : greedyCheck){
//            System.out.println(f);
//        }

        double totalValue = 0;

        for(int i = 0 ; i < greedyCheck.length ; i++){
            if(givenWeight >= greedyCheck[i].weight){
                givenWeight -= greedyCheck[i].weight;
                totalValue += greedyCheck[i].value;
                //System.out.println("weight: " + givenWeight + " Value: " + totalValue);
            }
            else{
                totalValue += (givenWeight) * greedyCheck[i].perKg;
                givenWeight = 0;
                //System.out.println("weight: " + givenWeight + " Value: " + totalValue);
                break;
            }
        }

        System.out.println(totalValue*100);
    }
}
