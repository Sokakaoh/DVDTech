package Model.Article;

import Model.Catégorie.Catégorie;

/**
 * Created by Loan on 19/10/2017.
 */
public class DVD extends Support {
    private float prixCoef = (float) 1.5;

    @Override
    public float getPrixCoef() {
        return prixCoef;
    }
    public String toString(){return " DVD ";}
}
