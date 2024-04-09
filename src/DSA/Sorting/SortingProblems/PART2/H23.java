package DSA.Sorting.SortingProblems.PART2;

public class H23 {
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 0};
        int max = 0;
        int steps = 0;

        for(int i = 0 ; i < A.length ; i++){
            max = Math.max(A[i] , max);
            if(i >= max){
                steps++;
            }
        }

        System.out.println(steps);
    }
}
