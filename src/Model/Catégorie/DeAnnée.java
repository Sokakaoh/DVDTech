package Model.Catégorie;

/**
 * Created by Loan on 19/10/2017.
 */
public class DeAnnée extends Catégorie {
    private float coef = (float) 1.7;

    public float getCoef(){
        return coef;
    }

    @Override
    public String toString() {
        return "DeAnnée";
    }
}
