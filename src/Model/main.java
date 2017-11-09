package Model;

import Controller.*;
import Model.Article.*;
import Model.Catégorie.*;
import Model.Client.Client;
import Model.Client.Location;
import Model.MoyenFacturation.MoyenFacturation;
import View.Fenêtre;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by msif on 19/10/17.
 */
public class main {

    public static void main(String[] args) {
        Catégorie deAnnée = new DeAnnée();
        Catégorie deAnnéePassé = new DeAnnéePassé();
        Catégorie nouveauté = new Nouveauté();
        Catégorie plusAncien = new PlusAncien();
        Catégorie récent = new Récent();
        Support dvd = new DVD();
        Support cassette = new Cassette();
        Support bluRay = new BluRay();

        //Controller test = new Controller();



        ArrayList<Location> l1 = new ArrayList<>();
        Client c1 = new Client("Sif","Mahel","25 rue du moulin","mahel.sif@gmail.com","0647859612");
        Article f1 = new Film("La-Haut",deAnnée,dvd,126,15);
        Article f2 = new Film("Le Seigneur des Anneaux",plusAncien,cassette,150,12);
        Location l= new Location(c1,f1,48,new MoyenFacturation());



    }
}
