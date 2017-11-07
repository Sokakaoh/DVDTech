package Model;

import Controller.ArticleController;
import Controller.ClientController;
import Controller.FactureController;
import View.Fenêtre;

import javax.swing.*;

/**
 * Created by msif on 19/10/17.
 */
public class main {

    public static void main(String[] args) {
        JFrame fenetre = new Fenêtre(new ArticleController(),new FactureController(),new ClientController());
        fenetre.setVisible(true);


    }
}
