/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsExample;

/**
 *
 * @author Tyden R
 */
public class threadRunner implements Runnable {
    String threadSays;
    
    //implements the run method that will display what thread is currently running
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
        }
    }
    
    public void threadGo(String threadSays) {
        this.threadSays = threadSays;
    }
    
    public void threadGo() {
        
    }
    
    
}
