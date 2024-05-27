package DSA.Recursion;

import java.util.Scanner;

public class PrintN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to print");
        int a = sc.nextInt();
        printNumbers(1,a);
    }

    public static void printNumbers(int i, int a) {
        if(i>a){
            return;
        }
        printNumbers(i+1 , a );
        System.out.print(i + " ");
        //printNumbers(i+1 , a );
    }
}
