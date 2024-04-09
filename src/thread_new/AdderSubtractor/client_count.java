package thread_new.AdderSubtractor;

import thread_new.AdderSubtractor.Adder;
import thread_new.AdderSubtractor.Count;
import thread_new.AdderSubtractor.Subtractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//this class will execute for adder , subtractor and count
public class client_count {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Lock lock = new ReentrantLock();
        Adder ad = new Adder(count , lock );
        Subtractor sb =new Subtractor(count ,lock);

        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(sb);

        t1.start();
        t2.start();

        //it will wait for the thread to be executed.
        //they will have to wait
        t1.join();
        t2.join();

        System.out.println("Both the threads are completed and count: " + count.value);
    }
}
