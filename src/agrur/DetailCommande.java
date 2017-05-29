package agrur;

/**
 *
 * @author smily
 */
public class DetailCommande {
    private String libelleConditionnement;
    private int quantite;
    
    /**
     *
     * @param libelleConditionnement
     * @param quantite
     */
    public DetailCommande(String libelleConditionnement, int quantite){
        this.libelleConditionnement = libelleConditionnement;
        this.quantite=quantite;
    }

    /**
     *
     * @return
     */
    public String getLibelleConditionnement() {
        return libelleConditionnement;
    }

    /**
     *
     * @return
     */
    public int getQuantite() {
        return quantite;
    }

    
    
    
    
}
