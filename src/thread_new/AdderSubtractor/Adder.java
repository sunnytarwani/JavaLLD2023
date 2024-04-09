package thread_new.AdderSubtractor;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    Count count;
    Lock lock;

    public Adder(Count count ,  Lock lock){
            this.count = count;
            this.lock = lock;
        }
    @Override
    public void run() {
       for(int i = 1 ; i <= 1000000 ; i++){
           //lock.lock();
           synchronized (count){
               count.value += i;
           }
           //lock.unlock();
       }
    }
}

/*
 synchronous issue:

 Race condition:

 Preemption condition: A program that is in it's Critical situation
                       is premepted.


#Properties of the ideal solution for synchronization
1. Mutual Exclusion:
 only one thread to enter critical section at one time.
 as coders , we should make sure that the thread enters cs and not the other cs.

2. Progress:
the overall system should be making progress and keep working.

3. Bounded Waiting:
No thread should have to wait indefinitely.
There should be a bound on how long they need to wait.

4. No Busy Waiting:
When a thread has to continuously check if they can enter the CS

#Mutex:
mutually exclusive
Locks that enable mutual exclusion.
A thread must take a lock before entering the lock.

Lock lock = new Lock();
lock.lock();
lock.unlock();

#Another Method: Synchronized Method
Java provides an implicit lock with every object.
We can achieve synchronization without lock object.
instead of lock it will use "Synchronised(count){

                                }

Synchronised drawback is that it can't work on more that one object.
*/
