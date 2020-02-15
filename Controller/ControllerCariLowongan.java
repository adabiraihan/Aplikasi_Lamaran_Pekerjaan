/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.CariLowongan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import LowonganPekerjaan.Aplikasi;

/**
 *
 * @author MODOFWAR
 */
public class ControllerCariLowongan implements ActionListener {
    Aplikasi app;
    CariLowongan cl;
    
    public ControllerCariLowongan (Aplikasi ap)
    {
        this.app = ap;
        this.cl = new CariLowongan();
        this.cl.setVisible(true);
        
        this.cl.getBackButton().addActionListener(this);
        this.cl.getCariButton().addActionListener(this);
    }    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
           Object x = ae.getSource();
           if(x.equals(cl.getCariButton())){
               String namaLowongan = cl.getCariField().getText();
               cl.getHasilField().setText(app.searchLowongan(namaLowongan));
           }
           
           else if(x.equals(cl.getBackButton())){
              
               ControllerPerusahaan cp = new ControllerPerusahaan(app);
                cl.setVisible(false);
           }
    }
    
}
