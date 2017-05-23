package agrur;

import java.util.Date ;
public class Commande {
    private int idCommande;
    private Date soumission;
    private String status;

    public int getIdCommande() {
        return idCommande;
    }

    public Date getSoumission() {
        return soumission;
    }

    public String getStatue() {
        return status;
    }
    
    public Commande(int idCommande, Date soumission, String status){
        this.idCommande=idCommande;
        this.soumission = soumission;
        this.status = status;
    }

}