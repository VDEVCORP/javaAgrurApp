package agrur;

/**
 *
 * @author smily
 */
public class Lot {
 private String idLot;
    private String calibre;
    private String libelleTypeProduit;
    private String nomCommune;
    private String nomVariete;
   
    /**
     *
     * @param idLot
     * @param calibre
     * @param libelleTypeProduit
     * @param nomCommune
     * @param nomVariete
     */
    public Lot (String idLot, String calibre, String libelleTypeProduit, String nomCommune, String nomVariete){
        this.idLot=idLot;
        this.calibre=calibre;
        this.libelleTypeProduit=libelleTypeProduit;
        this.nomCommune=nomCommune;
        this.nomVariete=nomVariete;
    }
    
    /**
     *
     * @return
     */
    public String getIdLot() {
        return idLot;
    }

    /**
     *
     * @param idLot
     */
    public void setIdLot(String idLot) {
        this.idLot = idLot;
    }

    /**
     *
     * @return
     */
    public String getCalibre() {
        return calibre;
    }

    /**
     *
     * @param calibre
     */
    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    /**
     *
     * @return
     */
    public String getLibelleTypeProduit() {
        return libelleTypeProduit;
    }

    /**
     *
     * @param libelleTypeProduit
     */
    public void setLibelleTypeProduit(String libelleTypeProduit) {
        this.libelleTypeProduit = libelleTypeProduit;
    }

    /**
     *
     * @return
     */
    public String getNomCommune() {
        return nomCommune;
    }

    /**
     *
     * @param nomCommune
     */
    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    /**
     *
     * @return
     */
    public String getNomVariete() {
        return nomVariete;
    }

    /**
     *
     * @param nomVariete
     */
    public void setNomVariete(String nomVariete) {
        this.nomVariete = nomVariete;
    }
   
}
