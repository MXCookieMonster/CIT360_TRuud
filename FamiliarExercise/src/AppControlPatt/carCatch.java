/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppControlPatt;

import java.util.*;
/**
 *
 * @author Tyden R
 */

public class carCatch implements carHandler {
     
    @Override
    public void carHand(HashMap<String, Object> appMap) {
        try {
            System.out.println("Displaying: "+appMap);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void carUser(HashMap<String, Object> data) {

    }
}
