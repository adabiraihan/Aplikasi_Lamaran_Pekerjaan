/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import LowonganPekerjaan.Aplikasi;
import View.MainMenu;

/**
 *
 * @author MODOFWAR
 */
public class ControllerMainMenu implements ActionListener {

    MainMenu mainmenu;
//    ArrayList<MainMenu> listMain = new ArrayList<>();
    Aplikasi app;

    public ControllerMainMenu(Aplikasi app) {
        this.mainmenu = new MainMenu();
        this.mainmenu.setVisible(true);
        
        this.app= app;

        this.mainmenu.getPerusahaan().addActionListener(this);
        this.mainmenu.getPelamar().addActionListener(this);

    }
    
//    public void setListMain(ArrayList<Main> listMain){
//        this.listMain= listMain;
//    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(mainmenu.getPerusahaan())){
            
            ControllerPerusahaanLogin cmm= new ControllerPerusahaanLogin(app);
            this.mainmenu.setVisible(false);
            
        }
        
        else if(x.equals(mainmenu.getPelamar())){
            this.mainmenu.setVisible(false);
            ControllerPelamarLogin cp = new ControllerPelamarLogin(app);
        }

    }

}
