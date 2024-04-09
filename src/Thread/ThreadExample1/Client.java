package Thread.ThreadExample1;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is from the main class");

        HelloWorldPrinter hp = new HelloWorldPrinter();
        Thread t1 = new Thread(hp);

        t1.start();
    }
}
