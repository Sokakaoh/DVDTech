package Model.Client;

import Model.MoyenFacturation.MoyenFacturation;

/**
 * Created by msif on 19/10/17.
 */
public class Facture {
    private Location location = null;
    MoyenFacturation moyFacturation;
    float penaliter;


    public Facture(Location loc, MoyenFacturation moy){
        this.location = loc;
        this.moyFacturation = moy;
    }


    public void setPenaliter(float penaliter) {
        this.penaliter = penaliter;
    }
    public float getPenaliter(){
        return penaliter;
    }
    public float aPayer(){
        return penaliter+location.getPrix();
    }

    @Override
    public String toString() {

    }
}
