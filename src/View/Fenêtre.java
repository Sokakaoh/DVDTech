package View;

import Controller.ArticleController;
import Controller.ClientController;
import Controller.FactureController;
import Controller.actionButton;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Loan on 24/10/2017.
 */
public class Fenêtre extends JFrame {

    ArticleController articleController;
    ClientController clientController;
    FactureController factureController;
    JPanel listPane = new JPanel();
    JPanel afficherLocation = new afficherLocation();
    JPanel nouveauArticle = new nouveauArticle();
    JPanel nouveauClient = new nouveauClient();
    JPanel rechercherLocationClient = new rechercherLocationClient();
    JPanel nouvelleLocation = new nouvelLocation();
    JMenuBar menu = new JMenuBar();
     public JMenuItem bNouvelleLocation;
    public JMenuItem bNouveauClient;
    public JMenuItem bClient;
    public JMenuItem bNouveauArticle;
    public Fenêtre()
    {

        this.setTitle("DVDTech");

        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));


        menu.add(bNouvelleLocation = new JMenuItem("Nouvelle Location"));

        menu.add(bNouvelleLocation);
        menu.add(bNouveauClient = new JMenuItem("Nouveau Client"));
        menu.add(bClient = new JMenuItem("Client"));
        menu.add(bNouveauArticle = new JMenuItem("Nouveau article"));
        this.setJMenuBar(menu);
        this.setVisible(true);

        this.setContentPane(nouveauArticle);
    }


    public void buttonEnable(JMenuItem ok){
        bNouveauClient.setEnabled(true);
        bNouvelleLocation.setEnabled(true);
        bClient.setEnabled(true);
        bNouveauArticle.setEnabled(true);
        ok.setEnabled(false);

    }


    public void setControleMenu(actionButton controleMenu) {
        this.bNouvelleLocation.addActionListener(controleMenu);
        this.bNouveauClient.addActionListener(controleMenu);
        this.bClient.addActionListener(controleMenu);
        this.bNouveauArticle.addActionListener(controleMenu);
    }
}
