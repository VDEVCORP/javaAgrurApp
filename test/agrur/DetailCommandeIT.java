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
public class DetailCommandeIT {
    
    public DetailCommandeIT() {
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
     * Test of getLibelleConditionnement method, of class DetailCommande.
     */
    @Test
    public void testGetLibelleConditionnement() {
        System.out.println("getLibelleConditionnement");
        DetailCommande instance = null;
        String expResult = "";
        String result = instance.getLibelleConditionnement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantite method, of class DetailCommande.
     */
    @Test
    public void testGetQuantite() {
        System.out.println("getQuantite");
        DetailCommande instance = null;
        int expResult = 0;
        int result = instance.getQuantite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
