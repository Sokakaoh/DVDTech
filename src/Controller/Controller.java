package Controller;

import View.Fenêtre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Loan on 24/10/2017.
 */
public class Controller {

    Fenêtre f;


    public Controller (){
        this.f = new Fenêtre();
        actionButton a=new actionButton(f);
        f.setControleMenu(a);
        f.setVisible(true);
    }



    }

