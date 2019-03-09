package jUnitTest;


import java.util.*;


/**
 *
 * @author Tyden R
 * 
 * This test case creates an object that will be tested by the jUnit test
 * 
 */
public class jTest {
    
    String name;
    int num =0;
    boolean samePlayer= false;
    

    public jTest(String player, int playerNumber, boolean same_i_am) {
        this.name = player;
        this.num = playerNumber;
        this.samePlayer = same_i_am;
    }

    public void setPlayer(String player) {
        this.name = player;
    }

    public void setPlayerNumber(int playerNumber) {
        this.num = playerNumber;
    }

    public void setPlayerChecker(boolean samePlayer){
        this.samePlayer = samePlayer;
    }

    public String getPlayerName() {
        return name;
    }

    public int getPlayerNumber() {
        return num;
    }

    public boolean playerChecker() {
        return samePlayer;
    }
}
