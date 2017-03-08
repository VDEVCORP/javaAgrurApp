import java.util.Date ;
public class Commande {
    private String numCommande;
    private Date dateEnvoie;
    private int nbUniteCommandee;
    private Date dateConditionnement;
    
    public Commande(String numCommande, Date dateEnvoie, int nbUniteCommandee, Date dateConditionnement){
        this.numCommande = numCommande;
        this.dateEnvoie = dateEnvoie;
        this.nbUniteCommandee=nbUniteCommandee;
        this.dateConditionnement=dateConditionnement;
    }

    public String getNumCommande() {
        return numCommande;
    }

    public void setNumCommande(String numCommande) {
        this.numCommande = numCommande;
    }

    public Date getDateEnvoie() {
        return dateEnvoie;
    }

    public void setDateEnvoie(Date dateEnvoie) {
        this.dateEnvoie = dateEnvoie;
    }

    public int getNbUniteCommandee() {
        return nbUniteCommandee;
    }

    public void setNbUniteCommandee(int nbUniteCommandee) {
        this.nbUniteCommandee = nbUniteCommandee;
    }

    public Date getDateConditionnement() {
        return dateConditionnement;
    }

    public void setDateConditionnement(Date dateConditionnement) {
        this.dateConditionnement = dateConditionnement;
    }
}
