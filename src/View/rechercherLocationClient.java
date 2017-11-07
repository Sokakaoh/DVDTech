package View;

import Model.Client.Client;

import javax.swing.*;
import java.awt.*;

public class rechercherLocationClient extends JPanel {
    JPanel panel = new JPanel();
    public void paintComponent(Graphics g) {
        JLabel titre = new JLabel("Location en cours");
        JLabel client = new JLabel("Client : ");
        Object[] clients = new Object[]{Client.class}; // trouver solution pour avoirs tous les client
        JComboBox listeClient = new JComboBox(clients);
        JButton rechercher = new JButton("Rechercher");
        panel.add(titre);
        panel.add(client,listeClient);
        panel.add(rechercher);
        this.add(panel);

    }
}
