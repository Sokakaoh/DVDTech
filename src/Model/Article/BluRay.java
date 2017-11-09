package Model.Article;

/**
 * Created by Loan on 19/10/2017.
 */
public class BluRay extends Support {
    private float prixCoef= (float) 1.9;

    @Override
    public float getPrixCoef() {
        return prixCoef;
    }
    public String toString(){return "BluRay";}
}
