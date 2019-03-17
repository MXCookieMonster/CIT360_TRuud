/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCExample;

/**
 *
 * @author Tyden R
 */

//Creates the MVC pull pattern
public class AthleteRetrive {
    public static void retriveAthlete() {
        //Gets Athlete From Database
        AthleteModel model = retriveAthleteFromData();
        
        //Creates a new view for the student
        AthleteView view = new AthleteView();
        
        AthleteControl control = new AthleteControl(model, view);
        
        control.updateView();
        
        //Updates the model layers information
        control.setAthleteName("Ronald");
        control.updateView();
    }
    
    private static AthleteModel retriveAthleteFromData(){
        AthleteModel athlete = new AthleteModel();
        athlete.setName("Greg");
        athlete.setAthleteNum("74");
        return athlete;
    
    }
}
