package DSA.Searching.Searching1;

public class H2 {
    public static void main(String[] args) {
        int A = 5;
        int [] B = {2, 5, 6, 9, 18};
        int C = 7;

        int ans = -1;
        for(int i = 0 ; i < B.length ; i++){
            if(B[i]>=C){
                System.out.println(B[i]);
                break;
            }
        }
        System.out.println(-1);
    }
}
