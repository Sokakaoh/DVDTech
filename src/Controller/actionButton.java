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

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource() == f.bNouvelleLocation){

            f.getContentPane().add(new nouvelLocation());
            f.buttonEnable(f.bNouvelleLocation);
            f.revalidate();
            f.repaint();
        }
        if(actionEvent.getSource() == f.bNouveauClient){

            f.getContentPane().add(new nouveauClient());
            f.buttonEnable(f.bNouveauClient);
            f.revalidate();
            f.repaint();
        }
        if(actionEvent.getSource() == f.bClient) {
            f.getContentPane().removeAll();
            f.getContentPane().add(new rechercherLocationClient());
            f.buttonEnable(f.bClient);
            f.revalidate();
            f.repaint();
        }
        if(actionEvent.getSource() == f.bNouveauArticle){
            f.getContentPane().add(new nouveauArticle());
            f.buttonEnable(f.bNouveauArticle);
        }
    }
}
