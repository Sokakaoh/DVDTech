package Model.Client;

import Model.Article.Article;
import Model.MoyenFacturation.MoyenFacturation;

import java.time.LocalDate;

/**
 * Created by msif on 19/10/17.
 */
public class Location {
    private float prix;
    private LocalDate date;
    private long dureeLoc;
    private Article article;
    private Client clientLoc;
    private Facture factureLoc;

    public Location(Client c,Article article,long duree,MoyenFacturation moyenFacturation ){
        this.clientLoc = c;
        this.article = article;
        this.date = LocalDate.now();
        this.dureeLoc=duree;
        this.prix = article.getPrix() ;
        this.factureLoc = new Facture(this,moyenFacturation);

    }
    public int getTempsRestant(){
        LocalDate dateRetour = date.plusDays(dureeLoc);
        LocalDate dateAujourdHui = LocalDate.now();
        return dateRetour.compareTo(dateAujourdHui);
    }

    public void addPenaliter(){
        float penalite = -(getTempsRestant()*prix);
        factureLoc.setPenaliter(penalite);
    }
    public float getPrix(){
        return prix;
    }

    }
