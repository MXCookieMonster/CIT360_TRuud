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
public class overWrtThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Current overwrite thread: " + Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(250);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
