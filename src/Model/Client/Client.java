package Model.Client;

import Model.Article.Article;
import Model.Article.Film;
import Model.MoyenFacturation.MoyenFacturation;

import java.util.ArrayList;

/**
 * Created by msif on 19/10/17.
 */
public class Client {
    private ArrayList<Location> locationsClient;
    private String nomClient;
    private String prenomClient;
    private String adresseClient;
    private String mailClient;
    private String telClient;
    private MoyenFacturation prepaye;

    public Client(String nomClient, String prenomClient, String adresseClient, String mailClient, String telClient){
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.adresseClient = adresseClient;
        this.mailClient = mailClient;
        this.telClient = telClient;
    }

   public Client(){

    }

    public void faireLocation(Article a, long duree){
        this.locationsClient.add(new Location(this,a,duree));
    }

    public ArrayList<Location> getLocationsClient() {
        return locationsClient;
    }

    public void setLocationsClient(ArrayList<Location> locationsClient) {
        this.locationsClient = locationsClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public String getMailClient() {
        return mailClient;
    }

    public void setMailClient(String mailClient) {
        this.mailClient = mailClient;
    }

    public String getTelClient() {
        return telClient;
    }

    public void setTelClient(String telClient) {
        this.telClient = telClient;
    }

    public void toStringHistorique(){
        if(locationsClient != null)
        {
            for(Location location: locationsClient){
                System.out.println(locationsClient);

            }
        }
    }
    public String toString(){
        return "Nom du client : " +nomClient + " , prenom du client :" + prenomClient + " , adresse du client : " + adresseClient
                + " mail du client : " +mailClient + " telephone du client " + telClient;
    }
}
