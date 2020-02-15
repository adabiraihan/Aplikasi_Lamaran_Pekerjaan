/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author MODOFWAR
 */import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import LowonganPekerjaan.Aplikasi;
import LowonganPekerjaan.Pelamar;
import View.MainMenu;
import View.PelamarLogin;


public class ControllerPelamarLogin implements ActionListener {
    
    PelamarLogin P;
//    ArrayList<MainMenu> listMain = new ArrayList<>();
    Aplikasi app;

    public ControllerPelamarLogin(Aplikasi app) {
        this.P = new PelamarLogin();
        this.P.setVisible(true);
        
        this.app= app;

        this.P.getLogin().addActionListener(this);
        this.P.getSignUp().addActionListener(this);
        this.P.getButtonBack().addActionListener(this);

    }
    
//    public void setListMain(ArrayList<Main> listMain){
//        this.listMain= listMain;
//    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(P.getLogin())){
            
            ControllerPelamar cmm= new ControllerPelamar(app);
            this.P.setVisible(false);
            
        }
        
        else if(x.equals(P.getSignUp())){
            this.P.setVisible(false);
            ControllerPelamarSignUp cp = new ControllerPelamarSignUp(app);
        }
        else if(x.equals(P.getButtonBack())) {
            this.P.setVisible(false);
            ControllerMainMenu cmm = new ControllerMainMenu(app);

        }

    }

}
