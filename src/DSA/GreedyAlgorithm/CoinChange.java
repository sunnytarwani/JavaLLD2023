package DSA.GreedyAlgorithm;

import java.lang.reflect.Array;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;

public class CoinChange {
    public static void main(String[] args) {
        int [] coins = {1 , 2 , 5 , 10 , 20 , 50 , 100 , 500 , 1000};
        ArrayList<Integer> arrayList =new ArrayList<>();

        int change = 49;

        for(int i = coins.length-1 ; i>=0 ; i--){

            while(change>=coins[i]){
                change-=coins[i];
                arrayList.add(coins[i]);
            }
        }

        System.out.println(arrayList);
    }
}
