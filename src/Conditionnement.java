
public class Conditionnement {
    private String idConditionnement;
    private String typeConditionnement;
    private int poidsConditionnement;
    
    public Conditionnement(String idConditionnement, String typeConditionnement, int poidsConditionnement){
        this.idConditionnement = idConditionnement;
        this.typeConditionnement=typeConditionnement;
        this.poidsConditionnement=poidsConditionnement;
    }

    public String getIdConditionnement() {
        return idConditionnement;
    }

    public String getTypeConditionnement() {
        return typeConditionnement;
    }

    public int getPoidsConditionnement() {
        return poidsConditionnement;
    }
    
    
    
    
}
