package Model.MoyenFacturation;

/**
 * Created by Loan on 24/10/2017.
 */
public class Espece {


    private float montantReçu;
    private float montantRendu;


    public float transaction(float prix, float montantReçu){

        if(montantReçu > prix){
            montantRendu = montantReçu - prix;
        }


        return montantRendu;
    }



}
