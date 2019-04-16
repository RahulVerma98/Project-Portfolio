/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membership.management;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rahul Verma
 */
public class NewMebershipIT {
    NewMebership test;
    
    public NewMebershipIT() {
    }
    
    @Before
    public void setUp() {
        test = new NewMebership();
    }
    
    @After
    public void tearDown() {
        test = null;
    }

    /**
     * Test of main method, of class NewMebership.
     */
    @Test
    public void testMain() {
        System.out.println("Inside main");
        String[] args = null;
        NewMebership.main(args);

    }
    
}
