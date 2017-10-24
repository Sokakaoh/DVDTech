package View;

import Controller.ArticleController;
import Controller.ClientController;
import Controller.FactureController;

/**
 * Created by Loan on 24/10/2017.
 */
public class Fenêtre {

    ArticleController articleController;
    ClientController clientController;
    FactureController factureController;

    public Fenêtre(ArticleController a, FactureController f, ClientController c)
    {
        articleController = a;
        clientController = c;
        factureController = f;
    }


    public void initFenetre()
    {

    }
}
