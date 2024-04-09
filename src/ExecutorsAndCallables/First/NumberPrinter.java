package ExecutorsAndCallables.First;

public class NumberPrinter implements Runnable{

    int toPrint;

    public NumberPrinter(int toPrint){
        this.toPrint = toPrint;
    }
    @Override
    public void run() {
        System.out.println("Name of the thread: " + Thread.currentThread().getName()
                + " Value of the variable: " + toPrint);

    }
}
