package ExecutorsAndCallables.Second;

public class NumberPrinter implements Runnable {
    int toPrint;

    public NumberPrinter(int toPrint){
        this.toPrint = toPrint;
    }


    @Override
    public void run() {
        System.out.println("The thread : " + Thread.currentThread().getName() +
                " value is : " + toPrint);

    }
}
