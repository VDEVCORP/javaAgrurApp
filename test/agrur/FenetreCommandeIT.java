/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
public class FenetreCommandeIT {
    
    public FenetreCommandeIT() {
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
     * Test of getLaBdd method, of class FenetreCommande.
     */
    @Test
    public void testGetLaBdd() {
        System.out.println("getLaBdd");
        FenetreCommande instance = null;
        Bdd expResult = null;
        Bdd result = instance.getLaBdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnIdCommande method, of class FenetreCommande.
     */
    @Test
    public void testGetUnIdCommande() {
        System.out.println("getUnIdCommande");
        FenetreCommande instance = null;
        int expResult = 0;
        int result = instance.getUnIdCommande();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getbExporter method, of class FenetreCommande.
     */
    @Test
    public void testGetbExporter() {
        System.out.println("getbExporter");
        FenetreCommande instance = null;
        JButton expResult = null;
        JButton result = instance.getbExporter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getbSupprimer method, of class FenetreCommande.
     */
    @Test
    public void testGetbSupprimer() {
        System.out.println("getbSupprimer");
        FenetreCommande instance = null;
        JButton expResult = null;
        JButton result = instance.getbSupprimer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getbAjouter method, of class FenetreCommande.
     */
    @Test
    public void testGetbAjouter() {
        System.out.println("getbAjouter");
        FenetreCommande instance = null;
        JButton expResult = null;
        JButton result = instance.getbAjouter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjScrollPane1 method, of class FenetreCommande.
     */
    @Test
    public void testGetjScrollPane1() {
        System.out.println("getjScrollPane1");
        FenetreCommande instance = null;
        JScrollPane expResult = null;
        JScrollPane result = instance.getjScrollPane1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableauCommande method, of class FenetreCommande.
     */
    @Test
    public void testGetTableauCommande() {
        System.out.println("getTableauCommande");
        FenetreCommande instance = null;
        JTable expResult = null;
        JTable result = instance.getTableauCommande();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
