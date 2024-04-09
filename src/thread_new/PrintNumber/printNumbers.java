package thread_new.PrintNumber;

public class printNumbers implements Runnable{
    int toPrint;
    public printNumbers(int toPrint ){
        this.toPrint = toPrint;
        //System.out.println("In Constructor" + this);
    }

    @Override
    public void run(){
        System.out.println("The thread of this string is: " + Thread.currentThread().getName() +" value: " + toPrint);
    }

    //for execution look at client class
}
