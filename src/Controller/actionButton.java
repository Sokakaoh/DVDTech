package Controller;

import View.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionButton extends JFrame implements ActionListener {

    Fenêtre f;
    public actionButton(Fenêtre fenêtre) {
    this.f=fenêtre;
    }

    JPanel nouvelleLocation = new nouvelLocation();
    JPanel nouveauClient = new nouveauClient();
    JPanel rechercheClient = new rechercherLocationClient();
    JPanel nouveauArticle = new nouveauArticle();


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource() == f.bNouvelleLocation){
            f.getContentPane().removeAll();
            f.getContentPane().add(nouvelleLocation);
            f.buttonEnable(f.bNouvelleLocation);
            f.pack();

        }
        if(actionEvent.getSource() == f.bNouveauClient){
            f.getContentPane().removeAll();
            f.getContentPane().add(nouveauClient);
            f.buttonEnable(f.bNouveauClient);
            f.pack();
        }
        if(actionEvent.getSource() == f.bClient) {
            f.getContentPane().removeAll();
            f.getContentPane().add(rechercheClient);
            f.buttonEnable(f.bClient);
            f.repaint();
        }
        if(actionEvent.getSource() == f.bNouveauArticle){
            f.getContentPane().removeAll();
            f.getContentPane().add(nouveauArticle);
            f.buttonEnable(f.bNouveauArticle);
            f.repaint();
        }
    }
}
