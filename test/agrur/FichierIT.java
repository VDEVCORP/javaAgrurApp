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
public class FichierIT {
    
    public FichierIT() {
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
     * Test of ouvrir method, of class Fichier.
     */
    @Test
    public void testOuvrir() throws Exception {
        System.out.println("ouvrir");
        String nomFic = "";
        String s = "";
        Fichier instance = new Fichier();
        instance.ouvrir(nomFic, s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ecrire method, of class Fichier.
     */
    @Test
    public void testEcrire() throws Exception {
        System.out.println("ecrire");
        String chaine = "";
        Fichier instance = new Fichier();
        instance.ecrire(chaine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fermer method, of class Fichier.
     */
    @Test
    public void testFermer() throws Exception {
        System.out.println("fermer");
        Fichier instance = new Fichier();
        instance.fermer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
