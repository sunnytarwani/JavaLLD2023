package thread_new.PrintNumber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //single means it will run on single thread pool for all the task
        //ExecutorService es = Executors.newSingleThreadScheduledExecutor();

        //fixed thread pool means we will give them the numbers of threads to work on
        //just like toilet booth, if we have 4 booth and 10 people , 6 people will have to wait in the queue.
        //ExecutorService es = Executors.newFixedThreadPool(4);

        //Cached thread pool, dynamically creates threads and deletes them on its own
        ExecutorService es = Executors.newFixedThreadPool(10);

        for(int i = 1 ; i <= 100 ; i++){
            printNumbers pn = new printNumbers(i);
            //Thread t = new Thread(pn);
            //t.start();
            es.execute(pn);

        }

        es.close();

        //if we have 4 core CPU , the max threads we should assign is the number of cores we have.
        //this is good practice.
        /*
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService es1 = Executors.newFixedThreadPool(coreCount);
        */


        /*
        if the task is CPU intensive, it is advised to have thread pool equal to the CPU core count.

        if the task is input output intensive, the thread pool size can be of the highest number that we can assign,
        because the speed to complete the task is very fast, and this way we won't have many threads in the waiting pool.
         */



        /*
        Types of the thread pools
        1. FixedThreadPool
        --> This is a fixed pool of thread, for example if you a number of 10
            There will be only 10 threads available to complete the task, and apart from that
            whatever task there are available, will be put in the queue.

        2.CachedThreadPool
        --> lets take a example, if there are 100 task, initially lets say that 10 threads are created,
        task are being completed and while the 13 task come up, it is seen that none of the thread is empty,
        the cached thread pool will create a another thread automatically and assign the task to that thread.

        If any thread is idle for more than 60 seconds, it will automaticall kill the thread,
        this helps in making the process easy and helps in use of less memory.


        3. Schedules Thread Pool
        --> this is used for scheduled task, the task to run based on the time delay.

         ScheduledExecutorService s = Executors.newScheduledThreadPool(10);
        s.schedule(new ArrayCreator(3), 10 , TimeUnit.SECONDS);
        s.scheduleAtFixedRate(new ArrayCreator() , 15 , 10 , TimeUnit.SECONDS );
        s.scheduleWithFixedDelay(new ArrayCreator() , 15 , 10, TimeUnit.SECONDS);

        4. SingleThreadPool
        the single thread pool will create single task and it will complete the task sequentially.
        until the task is completed, it won't move to another task.

         */
        }
}
