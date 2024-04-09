package DSA.InterviewQuestion;

public class H2 {
    public static void main(String[] args) {
        int [] A = {1, 12, 10, 3, 14, 10, 5};
        int B = 8;

        int w = 0;
        int s = 0;
        for(int i = 0 ; i<A.length ; i++){
            if(A[i]<=B){
                w++;
            }
        }

        for(int i = 0 ; i<w ; i++){
            if(A[i]>B){
                s++;
            }
        }

        int m = s;
        for(int i = w; i < A.length ; i++){
            if(A[i]>B){
                s++;
            }
            if(A[i-w]>B){
                s--;
            }
            m = Math.min(m,s);
        }
        System.out.println(m);
    }
}
