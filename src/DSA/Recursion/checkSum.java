package DSA.Recursion;

import java.util.Scanner;

public class checkSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        System.out.println(sumTotal(a , 0));
    }

    public static  int sumTotal(int a , int sum) {
        if(a == 0){
            //System.out.println(sum);
            return 0;
        }
        return a + sumTotal(a-1 , sum );
    }
}
