package View;

import Model.Article.Article;
import Model.Client.Client;
import Model.GlobalVariable;
import Model.MoyenFacturation.MoyenFacturation;

import javax.swing.*;
import java.awt.*;

public class nouvelLocation extends JPanel {
    JPanel panel = new JPanel();
    public void paintComponent(Graphics g){
        JLabel client = new JLabel("Client : ");
        Object[] clients = new Object[]{Client.class}; // trouver solution pour avoirs tous les client
        JComboBox listeClient = new JComboBox(clients);

        JLabel article = new JLabel("Article : ");
        Object[] articles = new Object[]{Article.class}; // trouver solution pour avoirs tous les articles
        JComboBox listeArticle = new JComboBox(articles);

        JLabel duree = new JLabel("Durée : ");
        Object[] durees = new Object[]{GlobalVariable.UNJOUR,GlobalVariable.DEUXJOUR,GlobalVariable.TROISJOUR};
        JComboBox listeDuree = new JComboBox(durees);

        JLabel facturation = new JLabel("Moyen de facturation: ");
        Object[] facturations = new Object[]{MoyenFacturation.class};
        JComboBox listeFacture = new JComboBox(facturations);

        JButton louer = new JButton("louer");

        panel.add(client);
        panel.add(listeClient);
        panel.add(article);
        panel.add(listeArticle);
        panel.add(duree);
        panel.add(listeDuree);
        panel.add(facturation);
        panel.add(listeFacture);
        panel.add(louer);
        this.add(panel);


    }
}
