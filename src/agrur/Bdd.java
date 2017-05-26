package agrur;



import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

public class Bdd {

    //initialisation des variables
    private final String  utilisateur = "root";
    private final String mdp = "root";
    private final String url = "jdbc:mysql://localhost:8889/agrur";
    private Connection con;
    private Statement st;
    private ResultSet rst;
    
    public  void connexion() throws ConnectException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.con= DriverManager.getConnection(this.url, this.utilisateur, this.mdp);
        } catch (ClassNotFoundException | SQLException e){
           throw new ConnectException(e.getMessage());
        }        
    }
    
    /**
     * 
     * @return 
     * @throws java.lang.Exception
     */
    public ArrayList<String> listeNomClient() throws Exception{
        ArrayList<String> lesClients = new ArrayList();
         try{
            st = con.createStatement();
            rst = st.executeQuery("SELECT nomClient FROM client");
            while(rst.next()){
              lesClients.add(rst.getString("nomClient"));
            }
        }
        catch (SQLException e){
            throw new Exception("Impossible de générer la liste des noms des clients: "+ e.getMessage());
        } 
        return lesClients;
    }
    
    /**
     *
     * @param nomClient
     * @return
     * @throws Exception
     */
    public ArrayList<Commande> getListeCommande(String nomClient) throws Exception{
        ArrayList<Commande> lesCommandes = new ArrayList();
        try{
           
            st = con.createStatement();
            rst = st.executeQuery("SELECT * FROM commande INNER JOIN status ON commande.idStatus = status.idStatus INNER JOIN client ON commande.idClient = client.idClient WHERE nomClient = '" + nomClient+"' AND status.idStatus != 3");
            while(rst.next()){
                lesCommandes.add(new Commande(rst.getInt("idCommande") , rst.getDate("soumission") ,rst.getString("libelleStatus")));
            }
        }
        catch (SQLException e){
            throw new Exception("Impossible de générer la liste des commandes: "+ e.getMessage());
        }  return lesCommandes;
    }
    
    public ArrayList<DetailCommande> getDetailCommande(int idCommande) throws Exception{
        ArrayList<DetailCommande> lesdetailCommande = new ArrayList();
         try{
            st = con.createStatement();
            rst = st.executeQuery("SELECT * FROM detailcommande INNER JOIN conditionnement ON conditionnement.idConditionnement = detailcommande.idConditionnement WHERE detailcommande.idCommande='"+idCommande+"'");
            while(rst.next()){
                lesdetailCommande.add(new DetailCommande(rst.getString("libelleConditionnement") ,rst.getInt("quantiteCommandee")));
            }
        }catch (SQLException e){
            throw new Exception("Impossible de modifier la commande: "+ e.getMessage());
        }
         return lesdetailCommande;
    }
    
    public void retireProduit(String nomProduit, int idCommande) throws Exception{
        try{
            connexion();
            this.st = con.createStatement();
            st.executeUpdate("DELETE FROM detailcommande WHERE detailcommande.idConditionnement IN (SELECT conditionnement.idConditionnement FROM conditionnement WHERE conditionnement.libelleConditionnement ='"+nomProduit+"') AND idCommande ="+idCommande+" ");
        }catch (SQLException e){
            throw new Exception("Impossible de retirer le produit : "+ e.getMessage());
        }   
    }
    
     public ArrayList getListeLibelle() throws Exception{
        ArrayList<String> lesConditionnement = new ArrayList();
         try{
            st = con.createStatement();
            rst = st.executeQuery("SELECT DISTINCT libelleConditionnement FROM detailcommande INNER JOIN conditionnement ON conditionnement.idConditionnement = detailcommande.idConditionnement");
            while(rst.next()){
                lesConditionnement.add(rst.getString("libelleConditionnement"));
            }
        }catch (SQLException e){
            throw new Exception("Impossible de modifier la commande: "+ e.getMessage());
        }
         return lesConditionnement;
    }
    
  
    public void supprimeCommande(int numeroCommande) throws Exception {
        try{
            connexion();
            this.st = con.createStatement();
            st.executeUpdate("DELETE FROM commande WHERE idCommande = '" + numeroCommande+"'");
        }catch (SQLException e){
            throw new Exception("Impossible de supprimer la commande: "+ e.getMessage());
        }        
    }

    public void changeStatus(int idCommande, int idStatus) throws Exception{
         try{
            connexion();
            this.st = con.createStatement();
            st.executeUpdate("UPDATE commande SET commande.idStatus = "+idStatus+" WHERE commande.idCommande = " + idCommande+"");
        }catch (SQLException e){
            throw new Exception("Impossible de changer le Statut: "+ e.getMessage());
        }   
    }
    
     public ArrayList getListeProduit() throws Exception{
        ArrayList<String> lesConditionnement = new ArrayList();
         try{
            st = con.createStatement();
            rst = st.executeQuery("SELECT libelleConditionnement FROM Conditionnement");
            while(rst.next()){
                lesConditionnement.add(rst.getString("libelleConditionnement"));
            }
        }catch (SQLException e){
            throw new Exception("Impossible de modifier la commande: "+ e.getMessage());
        }
         return lesConditionnement;
    }
}
