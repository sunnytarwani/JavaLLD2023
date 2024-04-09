package Synchronization.SynchroSolution;

public class Subtractor implements Runnable{
    Count count;

    public Subtractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1 ; i <= 10000 ; i++){
            synchronized (count) {
                count.value -= i;
            }
        }
    }
}
