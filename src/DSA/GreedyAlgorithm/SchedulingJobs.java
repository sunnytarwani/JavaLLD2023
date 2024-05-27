package DSA.GreedyAlgorithm;


import java.util.Arrays;
import java.util.Comparator;

class Triplet{
    int idx;
    int jobId;
    int value;

    public Triplet(int idx, int jobId, int value) {
        this.idx = idx;
        this.jobId = jobId;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "idx=" + idx +
                ", jobId=" + jobId +
                ", value=" + value +
                '}';
    }
}
public class SchedulingJobs {
    public static void main(String[] args) {
        int N = 4;
        int [][]jobs = {{1,4,20},{2,1,10},{3,1,40},{4,1,30}};

        Triplet[] triplets = new Triplet[jobs.length];

        for(int i = 0 ; i < triplets.length ; i++){
            triplets[i] = new Triplet(jobs[i][0] , jobs[i][1] , jobs[i][2]);
        }

        int [] keepCheck = new int[N+1];
        Arrays.fill(keepCheck , -1);
        int totalValue = 0;


        Arrays.sort(triplets, new Comparator<Triplet>() {
            @Override
            public int compare(Triplet o1, Triplet o2) {
                if(o1.value > o2.value){
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });

        for(Triplet t : triplets){
            System.out.println(t);
        }
        for(int i = 0 ; i < triplets.length ;i++){
            int alpha = triplets[i].jobId;
            if(keepCheck[alpha] == -1){
                keepCheck[alpha] = triplets[i].idx;
                totalValue += triplets[i].value;
            }
        }

        System.out.println(Arrays.toString(keepCheck) +" " + totalValue);
    }
}
