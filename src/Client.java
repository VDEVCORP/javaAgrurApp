
public class Client {
    private String idClient;
    private String nomClient;
    private String adresseClient;
    private String nomResponsable ;

    public Client(String idClient, String nomClient, String adresseClient, String nomResponsable){
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.adresseClient = adresseClient;
        this.nomResponsable = nomResponsable;
    }
  
    public String getIdClient() {
        return idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public String getNomResponsable() {
        return nomResponsable;
    }
}
