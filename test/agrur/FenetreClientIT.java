/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class FenetreClientIT {
    
    public FenetreClientIT() {
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
     * Test of getbExporter method, of class FenetreClient.
     */
    @Test
    public void testGetbExporter() throws Exception {
        System.out.println("getbExporter");
        FenetreClient instance = new FenetreClient();
        JButton expResult = null;
        JButton result = instance.getbExporter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getbModifier method, of class FenetreClient.
     */
    @Test
    public void testGetbModifier() throws Exception {
        System.out.println("getbModifier");
        FenetreClient instance = new FenetreClient();
        JButton expResult = null;
        JButton result = instance.getbModifier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getjScrollPane1 method, of class FenetreClient.
     */
    @Test
    public void testGetjScrollPane1() throws Exception {
        System.out.println("getjScrollPane1");
        FenetreClient instance = new FenetreClient();
        JScrollPane expResult = null;
        JScrollPane result = instance.getjScrollPane1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeClient method, of class FenetreClient.
     */
    @Test
    public void testGetListeClient() throws Exception {
        System.out.println("getListeClient");
        FenetreClient instance = new FenetreClient();
        JComboBox<String> expResult = null;
        JComboBox<String> result = instance.getListeClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableauCommande method, of class FenetreClient.
     */
    @Test
    public void testGetTableauCommande() throws Exception {
        System.out.println("getTableauCommande");
        FenetreClient instance = new FenetreClient();
        JTable expResult = null;
        JTable result = instance.getTableauCommande();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remplirTableau method, of class FenetreClient.
     */
    @Test
    public void testRemplirTableau() throws Exception {
        System.out.println("remplirTableau");
        FenetreClient instance = new FenetreClient();
        instance.remplirTableau();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
