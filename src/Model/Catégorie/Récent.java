package Model.Catégorie;

/**
 * Created by Loan on 19/10/2017.
 */
public class Récent extends Catégorie {
    private float coef = (float) 1.8;

    public float getCoef(){
        return coef;
    }


    @Override
    public String toString() {
            return "Récent";
    }
}
