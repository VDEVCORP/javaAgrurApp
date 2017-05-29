package agrur;

import java.util.Date ;

/**
 *
 * @author smily
 */
public class Commande {
    private int idCommande;
    private Date soumission;
    private String status;

    /**
     *
     * @return
     */
    public int getIdCommande() {
        return idCommande;
    }

    /**
     *
     * @return
     */
    public Date getSoumission() {
        return soumission;
    }

    /**
     *
     * @return
     */
    public String getStatue() {
        return status;
    }
    
    /**
     *
     * @param idCommande
     * @param soumission
     * @param status
     */
    public Commande(int idCommande, Date soumission, String status){
        this.idCommande=idCommande;
        this.soumission = soumission;
        this.status = status;
    }

}