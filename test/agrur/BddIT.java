/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

import java.util.ArrayList;
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
public class BddIT {
    
    public BddIT() {
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
     * Test of connexion method, of class Bdd.
     */
    @Test
    public void testConnexion() throws Exception {
        System.out.println("connexion");
        Bdd instance = new Bdd();
        instance.connexion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listeNomClient method, of class Bdd.
     */
    @Test
    public void testListeNomClient() throws Exception {
        System.out.println("listeNomClient");
        Bdd instance = new Bdd();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.listeNomClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeCommande method, of class Bdd.
     */
    @Test
    public void testGetListeCommande() throws Exception {
        System.out.println("getListeCommande");
        String nomClient = "";
        Bdd instance = new Bdd();
        ArrayList<Commande> expResult = null;
        ArrayList<Commande> result = instance.getListeCommande(nomClient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetailCommande method, of class Bdd.
     */
    @Test
    public void testGetDetailCommande() throws Exception {
        System.out.println("getDetailCommande");
        int idCommande = 0;
        Bdd instance = new Bdd();
        ArrayList<DetailCommande> expResult = null;
        ArrayList<DetailCommande> result = instance.getDetailCommande(idCommande);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouteProduit method, of class Bdd.
     */
    @Test
    public void testAjouteProduit() throws Exception {
        System.out.println("ajouteProduit");
        String nomProduit = "";
        int idCommande = 0;
        int quantite = 0;
        Bdd instance = new Bdd();
        instance.ajouteProduit(nomProduit, idCommande, quantite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retireProduit method, of class Bdd.
     */
    @Test
    public void testRetireProduit() throws Exception {
        System.out.println("retireProduit");
        String nomProduit = "";
        int idCommande = 0;
        Bdd instance = new Bdd();
        instance.retireProduit(nomProduit, idCommande);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeLibelle method, of class Bdd.
     */
    @Test
    public void testGetListeLibelle() throws Exception {
        System.out.println("getListeLibelle");
        Bdd instance = new Bdd();
        ArrayList expResult = null;
        ArrayList result = instance.getListeLibelle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supprimeCommande method, of class Bdd.
     */
    @Test
    public void testSupprimeCommande() throws Exception {
        System.out.println("supprimeCommande");
        int numeroCommande = 0;
        Bdd instance = new Bdd();
        instance.supprimeCommande(numeroCommande);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeStatus method, of class Bdd.
     */
    @Test
    public void testChangeStatus() throws Exception {
        System.out.println("changeStatus");
        int idCommande = 0;
        int idStatus = 0;
        Bdd instance = new Bdd();
        instance.changeStatus(idCommande, idStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeProduit method, of class Bdd.
     */
    @Test
    public void testGetListeProduit() throws Exception {
        System.out.println("getListeProduit");
        Bdd instance = new Bdd();
        ArrayList expResult = null;
        ArrayList result = instance.getListeProduit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
