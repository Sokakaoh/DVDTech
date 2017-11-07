package View;

import Controller.ArticleController;
import Controller.ClientController;
import Controller.FactureController;

import javax.swing.*;

/**
 * Created by Loan on 24/10/2017.
 */
public class Fenêtre extends JFrame {

    ArticleController articleController;
    ClientController clientController;
    FactureController factureController;
    JPanel menu = new JPanel();
    JPanel listPane = new JPanel();
    JPanel afficherLocation = new afficherLocation();
    JPanel nouveauArticle = new nouveauArticle();
    JPanel nouveauClient = new nouveauClient();
    JPanel rechercherLocationClient = new rechercherLocationClient();
    JPanel nouvelleLocation = new nouvelLocation();

    public Fenêtre(ArticleController a, FactureController f, ClientController c)
    {
        articleController = a;
        clientController = c;
        factureController = f;
        this.setTitle("DVDTech");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));
        menu.add(new JButton("Bouton 1"));
        menu.add(new JButton("Bouton 2"));
        menu.add(new JButton("Bouton 3"));
        listPane.add(menu);
        listPane.add(nouvelleLocation);

        this.getContentPane().add(listPane);
        this.setVisible(true);

    }


    public void initFenetre()
    {

    }
}
