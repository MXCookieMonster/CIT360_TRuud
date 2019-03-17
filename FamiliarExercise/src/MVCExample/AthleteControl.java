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


//Creating the control layer
public class AthleteControl {
    private AthleteModel model;
    private  AthleteView view;
    
    public AthleteControl(AthleteModel model, AthleteView view){
        this.model = model;
        this.view = view;
    }
    
    public void setAthleteName(String name){
        model.setName(name);
    }
    
    public String getAthleteName(){
        return model.getName();
    }
    
    public void setAltheteNum(String athleteNum){
        model.setAthleteNum(athleteNum);
    }
    
    public String getAthleteNum(){
        return model.getAthleteNum();
    }
    
    public void updateView(){
        view.createAthleteRecord(model.getName(), model.getAthleteNum());
    }
}
