/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author MODOFWAR
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import LowonganPekerjaan.Aplikasi;
import View.TampilPelamar;
import LowonganPekerjaan.Pelamar;

public class ControllerTampilPelamar implements ActionListener {
    TampilPelamar tampilpelamar;
    Aplikasi app;
    Pelamar pel;
    
    public ControllerTampilPelamar(Aplikasi app) {
        this.app = app;
        this.tampilpelamar = new TampilPelamar();
        this.tampilpelamar.setVisible(true);
        
        this.tampilpelamar.getButtonPelamar().addActionListener(this);
        this.showPelamar();
       
    }
    public void showPelamar(){
        tampilpelamar.getTextPelamar().setText(app.displayPelamar());
        app.displayPelamar();
    }
        
    @Override
    public void actionPerformed(ActionEvent ae){
        Object x = ae.getSource();
        
         if(x.equals(tampilpelamar.getButtonPelamar())){
            this.tampilpelamar.setVisible(false);
            ControllerPelamar cp = new ControllerPelamar(app);
        }
    }
    
}
