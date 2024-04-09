package DSA.Prefix_SubArrays;

public class A5 {
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, -10};
        int sum = 0;
        int final_max=0;

        for(int i = 0 ;i < A.length ; i++){
            sum += A[i];
            if(sum < 0){
                sum = 0;
            }

            final_max = Math.max(final_max , sum);
        }

        if(final_max == 0){
            final_max = Integer.MIN_VALUE;
            for(int a : A){
                final_max = Math.max(final_max , a);
            }
        }

        System.out.println(final_max);

    }
}
