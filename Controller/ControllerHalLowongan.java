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
import LowonganPekerjaan.Lowongan;
import View.MainMenu;
import View.HalLowongan;

public class ControllerHalLowongan implements ActionListener {
    
    HalLowongan p;
    //ArrayList<Perusahaan> listPerusahaan = new ArrayList<>();
    Aplikasi app;
    
    public ControllerHalLowongan(Aplikasi ap) {
        this.p = new HalLowongan();
        this.p.setVisible(true);
        this.app = ap;
        
        this.p.getTambahLowongan().addActionListener(this);
        this.p.getHapusLowongan().addActionListener(this);
        this.p.getCariLowongan().addActionListener(this);
        this.p.getButtonBack().addActionListener(this);
        this.p.getTampilkanPelamarLowongan().addActionListener(this);
        this.p.getTampilkanBerkasDiterima().addActionListener(this);
        this.p.getCariLowongan().addActionListener(this);
        this.p.getTampilkanPelamarLowongan().addActionListener(this);
        
        this.p.getTerimaBerkasButton().addActionListener(this);
        
    }

//  public void setLmm (ArrayList<Perusahaan> lmm){
//        this.listPerusahaan = lmm;
//    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if (x.equals(p.getTambahLowongan())) {
            this.p.setVisible(false);
            ControllerTambahLowongan ctl = new ControllerTambahLowongan(app);
        } else if (x.equals(p.getHapusLowongan())) {
            this.p.setVisible(false);
            ControllerHapusLowongan chl = new ControllerHapusLowongan(app);
        } else if (x.equals(p.getCariLowongan())) {
            this.p.setVisible(false);
            ControllerCariLowongan chl = new ControllerCariLowongan(app);
        } else if (x.equals(p.getButtonBack())) {
            this.p.setVisible(false);
            ControllerPerusahaan cmm = new ControllerPerusahaan(app);
        } else if (x.equals(p.getTampilkanPelamarLowongan())) {
            this.p.setVisible(false);
            ControllerTampilkanPelamarLowongan ctpl = new ControllerTampilkanPelamarLowongan(app);
        } else if (x.equals(p.getTerimaBerkasButton())) {
            this.p.setVisible(false);
            ControllerTambahBerkas ctb = new ControllerTambahBerkas(app);
        } else if (x.equals(p.getTampilkanBerkasDiterima())) {
            this.p.setVisible(false);
            ControllerTampilkanBerkasDiterima ctbd = new ControllerTampilkanBerkasDiterima(app);
        }
    }
    
}