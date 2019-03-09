/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCollections;

import java.util.*;
/**
 *
 * @author Tyden R
 */
public class queueExample {
    
    public static void queueEx() {
       
       //Creating a new Queue
       Queue<Integer> newQueue = new LinkedList<>();
       
       //Queue is populated by this for loop
       for (int i = 0; i < 10; i++)
           newQueue.add(i);
       
       System.out.println("Current numbers held in Queue are " + newQueue);
       
       //Shows initial size, shows first number in queue, drops first number in queue
       //then redisplays the new first in queue then shows the new size.
       int initial = newQueue.size();
       System.out.println("Number of numbers in Queue is " + initial);
       int first = newQueue.peek();
       System.out.println("Current head of Queue " + first);
       int removeFirst = newQueue.remove();
       System.out.println("First in Queue dropped is " + removeFirst);
       int newFirst = newQueue.peek();
       System.out.println("The new first in Queue is " + newFirst);
       int newSize = newQueue.size();
       System.out.println("New Queue size is " + newSize);
   }
}
