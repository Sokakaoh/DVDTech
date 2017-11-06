package View;


import Model.Article.Support;
import Model.Catégorie.Catégorie;

import javax.swing.*;
import java.awt.*;

public class nouveauArticle extends JPanel{
    JPanel panel = new JPanel();
    public void paintComponent(Graphics g) {
        JLabel nom = new JLabel("Nom de l'article : ");
        JTextField nomArticle = new JTextField();

        JLabel categorie = new JLabel("Categorie : ");
        Object[] categories = new Object[]{Catégorie.class}; // trouver solution pour avoirs tous les client
        JComboBox listeCategorie = new JComboBox(categories);

        JLabel support = new JLabel("Support : ");
        Object[] supports = new Object[]{Support.class}; // trouver solution pour avoirs tous les client
        JComboBox listeSupport = new JComboBox(supports);

        JLabel duree = new JLabel("Durée de l'article : ");
        JTextField dureeArticle = new JTextField();

        JLabel prix = new JLabel("Prix de l'article : ");
        JTextField prixArticleFilm = new JTextField();

        JButton ajouter = new JButton("Ajouter");
    }

}
