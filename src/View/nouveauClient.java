package View;

import javax.swing.*;
import java.awt.*;

public class nouveauClient extends JPanel {
    JPanel panel = new JPanel();
    public void paintComponent(Graphics g) {
        JLabel nom = new JLabel("Nom : ");
        JTextField nomClient = new JTextField();

        JLabel prenom = new JLabel("Prenom : ");
        JTextField prenomClient = new JTextField();

        JLabel adresse = new JLabel("Adresse : ");
        JTextField adresseClient = new JTextField();

        JLabel mail = new JLabel("Mail : ");
        JTextField mailClient = new JTextField();

        JLabel tel = new JLabel("Tel : ");
        JTextField telClient = new JTextField();

        JButton valider = new JButton("Valider");

        panel.add(nom,nomClient);
        panel.add(prenom,prenomClient);
        panel.add(adresse,adresseClient);
        panel.add(mail,mailClient);
        panel.add(tel,telClient);
        panel.add(valider);
        this.add(panel);
    }
}
