package Model.Client;

import Model.MoyenFacturation.MoyenFacturation;

/**
 * Created by msif on 19/10/17.
 */
public class Facture {
    private Location location = null;
    MoyenFacturation moyFacturation;

    public Facture(Location loc, MoyenFacturation moy){
        this.location = loc;
        this.moyFacturation = moy;
    }
    


}
