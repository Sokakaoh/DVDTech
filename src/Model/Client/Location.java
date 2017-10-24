package Model.Client;

import Model.Article.Article;

import java.time.LocalDate;

/**
 * Created by msif on 19/10/17.
 */
public class Location {
    private Double prix;
    private Double penalite;
    private LocalDate date;
    private long dureeLoc;
    private Article article;
    private Client clientLoc;
    private Facture factureLoc;

    public Location(Client c,Article article,long duree ){
        this.clientLoc = c;
        this.article = article;
        this.date = LocalDate.now();
        this.dureeLoc=duree;
        this.penalite = 0.0;
        this.prix = article.getPrix() ;
    }
    public int tempsRestant(){
        LocalDate dateRetour = date.plusDays(dureeLoc);
        LocalDate dateAujourdHui = LocalDate.now();
        return dateRetour.compareTo(dateAujourdHui);
    }

    public void addPenaliter(){
        this.penalite = -(tempsRestant()*prix);
    }

    }
