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

//creates a control layer that checks to make sure the map data should be displayed.
public class carController {
    private HashMap<String,carHandler> carMap = new HashMap();

    public void handleReq(String command, HashMap<String,Object> data) {
        
        carHandler oneCmndHandler = carMap.get(command);
        if (oneCmndHandler != null) {
            oneCmndHandler.carHand(data);
        }
    }

    public void mapCommand(String aCommand, carHandler acHandler) {
        carMap.put(aCommand,acHandler);
    }
}
