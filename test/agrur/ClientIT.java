/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author smily
 */
public class ClientIT {
    
    public ClientIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdClient method, of class Client.
     */
    @Test
    public void testGetIdClient() {
        System.out.println("getIdClient");
        Client instance = null;
        String expResult = "";
        String result = instance.getIdClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomClient method, of class Client.
     */
    @Test
    public void testGetNomClient() {
        System.out.println("getNomClient");
        Client instance = null;
        String expResult = "";
        String result = instance.getNomClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdresseClient method, of class Client.
     */
    @Test
    public void testGetAdresseClient() {
        System.out.println("getAdresseClient");
        Client instance = null;
        String expResult = "";
        String result = instance.getAdresseClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomResponsable method, of class Client.
     */
    @Test
    public void testGetNomResponsable() {
        System.out.println("getNomResponsable");
        Client instance = null;
        String expResult = "";
        String result = instance.getNomResponsable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
