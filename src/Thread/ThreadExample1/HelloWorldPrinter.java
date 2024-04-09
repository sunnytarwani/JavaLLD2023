package Thread.ThreadExample1;



public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World This is by printer:" + java.lang.Thread.currentThread().getName() + " thread");
    }
}

