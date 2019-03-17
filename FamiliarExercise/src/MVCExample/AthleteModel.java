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



//Model Creation
public class AthleteModel {
    private String athleteNum;
    private String name;
    
    public String getAthleteNum() {
        return athleteNum;
    }
    
    public void setAthleteNum(String athleteNum) {
        this.athleteNum = athleteNum;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}