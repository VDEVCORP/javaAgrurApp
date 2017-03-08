public class Lot {
 private String idLot;
    private String calibre;
    private String libelleTypeProduit;
    private String nomCommune;
    private String nomVariete;
   
    public Lot (String idLot, String calibre, String libelleTypeProduit, String nomCommune, String nomVariete){
        this.idLot=idLot;
        this.calibre=calibre;
        this.libelleTypeProduit=libelleTypeProduit;
        this.nomCommune=nomCommune;
        this.nomVariete=nomVariete;
    }
    
    public String getIdLot() {
        return idLot;
    }

    public void setIdLot(String idLot) {
        this.idLot = idLot;
    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    public String getLibelleTypeProduit() {
        return libelleTypeProduit;
    }

    public void setLibelleTypeProduit(String libelleTypeProduit) {
        this.libelleTypeProduit = libelleTypeProduit;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public String getNomVariete() {
        return nomVariete;
    }

    public void setNomVariete(String nomVariete) {
        this.nomVariete = nomVariete;
    }
   
}
