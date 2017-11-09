package Model.Article;

/**
 * Created by Loan on 24/10/2017.
 */
public class Cassette extends Support {

    private float prixCoef= (float) 1.2;

    @Override
    public float getPrixCoef() {
        return prixCoef;
    }
    public String toString(){return " Cassette ";}

}
