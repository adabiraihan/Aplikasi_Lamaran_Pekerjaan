/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author MODOFWAR
 * 
 * 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import LowonganPekerjaan.Aplikasi;
import LowonganPekerjaan.Perusahaan;
import View.MainMenu;
import View.HalAwalPerusahaan;
import View.PerusahaanLogin;


public class ControllerPerusahaanLogin implements ActionListener {
    
    PerusahaanLogin P;
//    ArrayList<MainMenu> listMain = new ArrayList<>();
    Aplikasi app;

    public ControllerPerusahaanLogin(Aplikasi app) {
        this.P = new PerusahaanLogin();
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
            
            ControllerPerusahaan cp= new ControllerPerusahaan(app);
            this.P.setVisible(false);
            
        }
        
        else if(x.equals(P.getSignUp())){
            this.P.setVisible(false);
            ControllerPerusahaanSignUp cpsu = new ControllerPerusahaanSignUp(app);
        }
        
        else if(x.equals(P.getButtonBack())) {
            this.P.setVisible(false);
            ControllerMainMenu cmm = new ControllerMainMenu(app);

        }

}
}
