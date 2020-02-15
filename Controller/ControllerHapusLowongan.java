/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HapusLowongan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import LowonganPekerjaan.Aplikasi;

/**
 *
 * @author MODOFWAR
 */
public class ControllerHapusLowongan implements ActionListener {

    Aplikasi app;
    HapusLowongan hl;

    public ControllerHapusLowongan(Aplikasi app) {
        this.app = app;
        this.hl = new HapusLowongan();

        this.hl.getComboBoxPerusahaan().addItem("Pilih");
        for (int i = 0; i < app.getDaftarPerusahaan().size(); i++) {
            this.hl.getComboBoxPerusahaan().addItem(app.getDaftarPerusahaan().get(i).getNamaPerusahaan());

        }

        this.hl.setVisible(true);

        this.hl.getComboBoxPerusahaan().addActionListener(this);
        this.hl.getComboBoxIDLOWONGAN().addActionListener(this);
        this.hl.getHapusButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        Object a = hl.getComboBoxPerusahaan().getSelectedItem();

        if (x.equals(hl.getComboBoxPerusahaan())) {
            for (int i = 0; i < app.getDaftarPerusahaan().size(); i++) {

                if (a.equals(app.getDaftarPerusahaan().get(i).getNamaPerusahaan())) {
                    this.hl.getComboBoxIDLOWONGAN().removeAllItems();
                    for (int j = 0; j < app.getDaftarPerusahaan().get(i).getnLowongan(); j++) {
                        this.hl.getComboBoxIDLOWONGAN().addItem(app.getDaftarPerusahaan().get(i).getLowongan(j).getIdLowongan());

                    }
                }

            }
        } else if (x.equals(hl.getHapusButton())) {
            
            app.getPerusahaan((String) hl.getComboBoxPerusahaan().getSelectedItem()).remLowongan((String) hl.getComboBoxIDLOWONGAN().getSelectedItem());
            JOptionPane.showMessageDialog(null, "terhapus");
            ControllerPerusahaan cp = new ControllerPerusahaan(app);
                    
        } 
    }

}
