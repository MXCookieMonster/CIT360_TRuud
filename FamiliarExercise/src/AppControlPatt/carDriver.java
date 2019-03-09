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

//populates the hashmaps with new data and commands
public class carDriver {
    
    public static void mainDrive() {
        carController appManage = new carController();

        appManage.mapCommand("Cmnd One", new carCatch());
        appManage.mapCommand("Cmnd Two", new carCatch());

        String cmndOne = "Cmnd One";

        HashMap data = new HashMap();
        data.put("Lemon","Meh");
        data.put("Car","Awesome");
        data.put("Super Car","Incredible");

        
        appManage.handleReq(cmndOne,data);
        
        appManage.handleReq("Cmnd Two",data);
       
        appManage.handleReq("Access Denied",data);

    }
}
