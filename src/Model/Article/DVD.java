package Model.Article;

/**
 * Created by Loan on 19/10/2017.
 */
public class DVD extends Film {
    private float prixCoef;

    public float getPrixCoef() {
        return prixCoef;
    }

    @Override
    public float getPrix() {
        float p = prixCoef + super.getPrixFilm();

        return p;
    }
}
