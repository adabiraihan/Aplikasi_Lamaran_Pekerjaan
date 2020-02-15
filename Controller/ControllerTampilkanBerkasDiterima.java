/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TampilkanBerkasDiterima;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import LowonganPekerjaan.Aplikasi;

/**
 *
 * @author MODOFWAR
 */
public class ControllerTampilkanBerkasDiterima implements ActionListener{
    TampilkanBerkasDiterima tp;
    Aplikasi app;

    public ControllerTampilkanBerkasDiterima(Aplikasi ap) {
        this.app = ap;
        this.tp = new TampilkanBerkasDiterima();
        
        this.tp.getComboBoxPErusahaan().addItem("Pilih");
        for (int i = 0; i < app.getDaftarPerusahaan().size(); i++) {
            this.tp.getComboBoxPErusahaan().addItem(app.getDaftarPerusahaan().get(i).getNamaPerusahaan());

        }
        
        this.tp.setVisible(true);
        
        this.tp.getComboBoxPErusahaan().addActionListener(this);
        this.tp.getComboBoxPErusahaan1().addActionListener(this);

        this.tp.getBackButton().addActionListener(this);
        this.tp.getTampilkanButton().addActionListener(this);
        
    }

//    public void setLp(ArrayList<Perusahaan> lp) {
//        this.listPerusahaan = lp;
//    }
  

    
    @Override
    public void actionPerformed(ActionEvent ae) {
             Object x = ae.getSource();
             Object a= tp.getComboBoxPErusahaan().getSelectedItem();
        if (x.equals(tp.getBackButton())) {
            this.tp.setVisible(false);
            ControllerPerusahaan cm = new ControllerPerusahaan(app);
        }
        else if(x.equals(tp.getComboBoxPErusahaan())){
            for (int i = 0; i < app.getDaftarPerusahaan().size(); i++) {

                if (a.equals(app.getDaftarPerusahaan().get(i).getNamaPerusahaan())) {
                    this.tp.getComboBoxPErusahaan1().removeAllItems();
                    for (int j = 0; j < app.getDaftarPerusahaan().get(i).getnLowongan(); j++) {
                        this.tp.getComboBoxPErusahaan1().addItem(app.getDaftarPerusahaan().get(i).getLowongan(j).getNamaLowongan());

                    }
                }
        }
        }
        
        else if(x.equals(tp.getTampilkanButton())){
            tp.getHasilField().setText(app.displayBerkasDiTerima((String) tp.getComboBoxPErusahaan().getSelectedItem(), (String)tp.getComboBoxPErusahaan1().getSelectedItem()));
        
        }
    
}
}