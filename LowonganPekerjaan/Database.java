/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LowonganPekerjaan;

import LowonganPekerjaan.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adabi
 */
public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Pelamar> pelamar = new ArrayList();
    
    
    public Database() {
        loadPelamar();
    }
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost:3306/lowonganpekerjaan";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public void loadPelamar() {
        connect();
        try {
            String query = "SELECT * FROM pelamar";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                pelamar.add(new Pelamar(rs.getString("nama"), rs.getString("id"),rs.getString("no hp"),rs.getString("email")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<Pelamar> getPelamar() {
        return pelamar;
    }
    
//    public void addPelamar(Pelamar pe) {
//        connect();
//        String query = "INSERT INTO pelamar VALUES (";
//        query += "'" + pe.getNamaOrang() + "',";
//        query += "'" + pe.getIdPelamar() + "',";
//        query += "'" + pe.getNohp() + "',";
//        query += ")";
//        if (manipulate(query)) pelamar.add(pe);
//        disconnect();
//    }
     
//    public boolean cekDuplikatNIM(String nim){
//        boolean cek = false;
//        for (Mahasiswa mhs : mahasiswa) {
//            if (mhs.getNim().equals(nim)){
//                cek = true;
//                break;
//            }
//        }
//        return cek;
//    }
    
//    public void delPelamar(String nama) {
//        connect();
//        String query = "DELETE FROM pelamar WHERE nama='" + nama + "'";
//        if (manipulate(query)){
//            for (Pelamar pel : pelamar) {
//                if (pel.getNamaOrang().equals(nama)){
//                    pelamar.remove(pel);
//                    break;
//                }
//            }
//        }
//        disconnect();
//    }
    
//    public void updateMahasiswa(Pelamar p) {
//        connect();
//        String query = "UPDATE mahasiswa SET";
//        query += " nama='" + p.getNamaOrang() + "',";
//        query += " no id='" + p.getIdPelamar() + "',";
//        query += " no hp='" + p.getNohp() + "'";
//        query += " usia='" + p.getUsia() + "'";
//        if (manipulate(query)){
//            for (Pelamar pel : pelamar) {
//                if (pel.getNamaOrang().equals(p.getNamaOrang())){
//                    pel.setNama(p.getNamaOrang());
//                    pel.setIdPelamar(p.getIdPelamar());
//                    pel.setNohp(p.getNohp());
//                    pel.setUsia(p.getUsia());
//                    break;
//                }
//            }
//        }
//        disconnect();
//    }



    
}



