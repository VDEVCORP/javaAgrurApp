package agrur;


public class DetailCommande {
    private String libelleConditionnement;
    private int quantite;
    
    public DetailCommande(String libelleConditionnement, int quantite){
        this.libelleConditionnement = libelleConditionnement;
        this.quantite=quantite;
    }

    public String getLibelleConditionnement() {
        return libelleConditionnement;
    }

    public int getQuantite() {
        return quantite;
    }

    
    
    
    
}
