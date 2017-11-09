package Model.Client;

import Model.MoyenFacturation.MoyenFacturation;

import java.util.ArrayList;

/**
 * Created by msif on 19/10/17.
 */
public class Facture {
    private ArrayList<Location> location = new ArrayList<Location>();
    MoyenFacturation moyFacturation;
    float penalite;


    public Facture(ArrayList<Location> loc, MoyenFacturation moy){
        this.location = loc;
        this.moyFacturation = moy;
    }

    public void addLocation(Location l)
    {
        this.location.add(l);
    }

    public void setPenalite(float penalite) {
        this.penalite = penalite;
    }

    public float getPenalite(){
        return penalite;
    }

    public float aPayer(){
        this.penalite = 0;
        float prixFinal = 0;
        for (Location location : location) {
            prixFinal = location.getPrix() + prixFinal;
            penalite = location.getPenaliter() + penalite;
        }
        return penalite + prixFinal;
    }

    @Override
    public String toString() {
        return location + " en" +moyFacturation;
    }
}
