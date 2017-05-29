package agrur;

/**
 *
 * @author smily
 */
public class Client {
    private String idClient;
    private String nomClient;
    private String adresseClient;
    private String nomResponsable ;

    /**
     *
     * @param idClient
     * @param nomClient
     * @param adresseClient
     * @param nomResponsable
     */
    public Client(String idClient, String nomClient, String adresseClient, String nomResponsable){
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.adresseClient = adresseClient;
        this.nomResponsable = nomResponsable;
    }
  
    /**
     *
     * @return
     */
    public String getIdClient() {
        return idClient;
    }

    /**
     *
     * @return
     */
    public String getNomClient() {
        return nomClient;
    }

    /**
     *
     * @return
     */
    public String getAdresseClient() {
        return adresseClient;
    }

    /**
     *
     * @return
     */
    public String getNomResponsable() {
        return nomResponsable;
    }
}
