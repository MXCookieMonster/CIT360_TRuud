package jUnitTest;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 *
 * @author Tyden R
 * 
 * jUnit testing is an invaluable help to programmers as they check their programs
 * functionality, with a gigantic library of tests you can check anything that you need 
 * to. This ensures the functionality of your code and can save you an incredible 
 * amount of time as you try to create an application.
 */
public class jUnitEx {
    
    //This populates the jTest class with values that will be checked through the jUnit Test
    jTest jeremy =new jTest("Jeremy", 34, true);
      
    //This first test checks that the names match
    @Test
    public void name() throws Exception  {
        assertEquals("Jeremy", jeremy.getPlayerName());
    }

    //This test checks the players number does not equal the given number    
    @Test
    public void number() throws Exception {
        assertNotEquals(36, jeremy.getPlayerNumber());
    }

    //This is a reassurance to check to make sure our object is storing correctly 
    @Test
    public void checkNull() throws Exception {
        assertNotNull(jeremy.getPlayerNumber());
    }
    
    //This test uses the boolean to make sure that the objects refere to one another.
    @Test
    public void verify() throws Exception {
        assertSame(true, jeremy.playerChecker());
    }
    
    //Checks to make sure that strings don't match
    @Test
    public void notSame() throws Exception {
        assertNotSame("Fred", jeremy.playerChecker());
    }
    
    @Test
    public void check() throws Exception {
        assertThat(jeremy.getPlayerNumber(), is(notNullValue()));
    }
    
    @Test
    public void testfalse() throws Exception {
        assertTrue("false", jeremy.playerChecker());
    }
    
}
