package DSA.Recursion;

public class printFibonacci {
    public static void main(String[] args) {
        int a = 5;
       for(int i = 0 ; i < a ; i++){
           System.out.print(getFibonacci(i) + " ");
       }
    }

    public static int getFibonacci(int a) {
        if(a<=1){
            return a;
        }

        return getFibonacci(a-1) + getFibonacci(a-2);
    }
}
