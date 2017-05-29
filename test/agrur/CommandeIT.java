/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

import java.util.Date;
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
public class CommandeIT {
    
    public CommandeIT() {
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
     * Test of getIdCommande method, of class Commande.
     */
    @Test
    public void testGetIdCommande() {
        System.out.println("getIdCommande");
        Commande instance = null;
        int expResult = 0;
        int result = instance.getIdCommande();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSoumission method, of class Commande.
     */
    @Test
    public void testGetSoumission() {
        System.out.println("getSoumission");
        Commande instance = null;
        Date expResult = null;
        Date result = instance.getSoumission();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatue method, of class Commande.
     */
    @Test
    public void testGetStatue() {
        System.out.println("getStatue");
        Commande instance = null;
        String expResult = "";
        String result = instance.getStatue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
