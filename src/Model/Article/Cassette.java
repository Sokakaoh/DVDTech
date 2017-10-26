package Model.Article;

/**
 * Created by Loan on 24/10/2017.
 */
public class Cassette extends Film {

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
