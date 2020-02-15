/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TambahLowongan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import LowonganPekerjaan.Aplikasi;
import LowonganPekerjaan.Perusahaan;
import LowonganPekerjaan.Lowongan;
        

/**
 *
 * @author MODOFWAR
 */
public class ControllerTambahLowongan implements ActionListener {

    TambahLowongan tl;
    Aplikasi app;

    public ControllerTambahLowongan(Aplikasi ap) {
        this.app = ap;
        this.tl = new TambahLowongan();
        
        this.tl.getComboBoxPerusahaan().addItem("Pilih");
        for (int i = 0; i < app.getDaftarPerusahaan().size(); i++) {
            this.tl.getComboBoxPerusahaan().addItem(app.getDaftarPerusahaan().get(i).getNamaPerusahaan());

        }
        
        this.tl.setVisible(true);
        this.tl.getComboBoxPerusahaan().addActionListener(this);
        this.tl.getBackButton().addActionListener(this);
        this.tl.getTambahButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        
        
        if (x.equals(tl.getTambahButton())) {
            String namaLowongan = tl.getNamaLowonganField().getText();
            String idLowongan = tl.getIdLowonganField().getText();
            String deadline = tl.getDeadlineFieldText().getText();
            int waktuKerja = tl.getWaktuKerjaFieldText1();

            app.getPerusahaan((String) tl.getComboBoxPerusahaan().getSelectedItem()).createLowonganFullTime(idLowongan,namaLowongan, deadline, waktuKerja);
            JOptionPane.showMessageDialog(null, "Lowongan Berhasil Ditambahkan");
        } else if (x.equals(tl.getBackButton())) {
            this.tl.setVisible(false);
            ControllerHalLowongan cp = new ControllerHalLowongan(app);
        }
    }

}
