/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsExample;

import java.util.*;
import java.util.concurrent.*;
import threadsExample.threadRunner;
/**
 *
 * @author Tyden R
 */
public class threading {
    
    //creating a main callable that will run all threads at once
    public static void mainThread() throws Exception {
        inProgressThread();
        runThread();
        mulThread();
        exeThread();
        
    }
    
    //This line prints mainThread to show all threads run under the parent thread
    private static void inProgressThread() {
        System.out.println("Current thread in progress is: " + Thread.currentThread().getName());
    }
    
    //A multithread with the overwrite thread class implemented
    private static void mulThread() {
        for (int threadCount = 0; threadCount < 5; threadCount++) {
            overWrtThread multipleThread = new overWrtThread();
            multipleThread.start();
        }
    }
    
    //creating a method that implements multithreading using runnable
    private static void runThread() {
        for (int threadNum = 0; threadNum < 5; threadNum++) {
            Thread runningThread = new Thread(new threadRunner());
            runningThread.start();
        }
    }
    
    //Creating a multithread with the executor service implemented
    private static Executor exeThread() {
        Executor newExecutor = Executors.newCachedThreadPool();
        for (int threadNum = 0; threadNum < 5; threadNum++) {
            newExecutor.execute(new threadRunner());        
        }
        return newExecutor;
    }
    
    
    
    
    
    
}
