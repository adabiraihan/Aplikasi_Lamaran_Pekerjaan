/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LowonganPekerjaan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MODOFWAR
 */
public class Pelamar {
    private List<BerkasLamaran> daftarBerkas = new ArrayList();
    //private BerkasLamaran[] berkas = new BerkasLamaran[10];
    private String idPelamar;
    private int nBerkas= 0;
    private String nama;
    private String usia;
    private String nohp;
 
    public Pelamar(String nama, String idPelamar,String nohp,String usia){
        this.nama = nama;
        this.nohp = nohp;
        this.usia = usia;
        setIdPelamar(idPelamar); 
    }
	
    //membuat berkas
    public void createBerkas(String id,String jenisBerkas, String tglMsk){
//	BerkasLamaran b = new BerkasLamaran(id,jenisBerkas, tglMsk);//mengambil constructor BerkasLamaran dengan sejumlah parameter
//	berkas[nBerkas]= b; 
//        nBerkas++;//menambah sejumlah n berkas
        BerkasLamaran b = new BerkasLamaran(id,jenisBerkas, tglMsk);//mengambil constructor BerkasLamaran dengan sejumlah parameter
	daftarBerkas.add(b); 
        nBerkas++;//menambah sejumlah n berkas      
    }
    
    public String getNamaOrang() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
    
    public void setIdPelamar(String idPelamar){
        this.idPelamar= idPelamar;
    }
    
    public String getIdPelamar(){
        return this.idPelamar;
    }
    
    public BerkasLamaran getBerkas(int index){
//        return this.berkas[index];
        return this.daftarBerkas.get(index);
    }
    
    //mengembalika berkas dengan paramaeter String
    public BerkasLamaran getBerkas(String id){
//        for (int i=0; i< nBerkas; i++){
//			if(id.equalsIgnoreCase(this.berkas[i].getIdBerkas())) {//memeriksa jika nama pada indeks berkas sama dengan parameter
//				return berkas[i];// akan mengembalikan indeks berkas
//                        }
//                }
//                return null;
        for (int i=0; i< nBerkas; i++){
		if(id.equalsIgnoreCase(this.daftarBerkas.get(i).getIdBerkas())) {//memeriksa jika nama pada indeks berkas sama dengan parameter
			return daftarBerkas.get(i);// akan mengembalikan indeks berkas
                }
        }
        return null;
    }
    
    
    //mencari suatu lowongan sesuai paramater String

   public int getnBerkas(){
        return nBerkas;
    }
    
    public void display() {
        System.out.println();
        System.out.println("Id Pelamar              : "+getIdPelamar());
        System.out.println("Nama                    : "+getNamaOrang());
//        System.out.println("Id Berkas               : "+berkas.getIdBerkas());
//        System.out.println("Jenis Berkas            : "+berkas.getJenisBerkas());
//        System.out.println("Tanggal Masuk Berkas    : "+berkas.getTglMasukBerkas());
 //       System.out.println();
       
    }
    
    
}
