package Model.Article;

import Model.Catégorie.Catégorie;

/**
 * Created by Loan on 24/10/2017.
 */
public class Film extends Article {
    private String nomFilm;
    private Catégorie categorieFilm;
    private Support support;
    private int dureeMinute;
    private float prixFilm;

    public Film(String nomFilm,Catégorie categorieFilm,Support support,int duree, float prix){
        this.nomFilm=nomFilm;
        this.categorieFilm=categorieFilm;
        this.dureeMinute=duree;
        this.prixFilm=categorieFilm.getCoef()*prix;
        this.support=support;

    }


    public Catégorie getCategorieFilm() {
        return categorieFilm;
    }

    public String getNomFilm() {
        return nomFilm;
    }

    public int getDureeMinute() {
        return dureeMinute;
    }

    public void setCategorieFilm(Catégorie categorieFilm) {
        this.categorieFilm = categorieFilm;
    }

    public void setNomFilm(String nomFilm) {
        this.nomFilm = nomFilm;
    }

    public void setPrix(float prixFilm) {
        this.prixFilm = prixFilm;
    }

    public void setDureeMinute(int dureeMinute) {
        this.dureeMinute = dureeMinute;
    }


    public float getPrixFilm() {
        return (prixFilm * categorieFilm.getCoef())*support.getPrixCoef();
    }

    public String toString(){
        return nomFilm + ' ' + categorieFilm.toString();
    }
}



