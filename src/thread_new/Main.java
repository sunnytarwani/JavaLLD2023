package thread_new;

import javax.swing.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        for(int i = 1 ; i<= 100 ; i++) {
            ExecutorService es = Executors.newSingleThreadScheduledExecutor();

        }
    }
}

/*
steps to create your own threads
if the system is paralle it means it is concurrent.
if the system is concurrent, it is not compulsory that the system is parallel.

Don't think what threads are required.
Rather think in the terms of the task that needs to be done in paralle.

for every task that needs to be done parallel, we will create thread
via class.

Make this class implement an interface called runnable.
Make class with a noun name.

class definePrinter implements Runnable{
   void Run{
    ------
    ------
   }
}
*/