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
 *
 * @author MODOFWAR
 */
public class Perusahaan {

    //private Lowongan[] daftarLowongan = new Lowongan[10];//membuat array lowongan sebanyak 10
    private List<Lowongan> daftarLowongan = new ArrayList();
    private int nLowongan = 0;
    private String nmPerusahaan;
    private Lowongan lowongan;
    private String nama;
    private int usia;
    private long nohp;
    
        //constructor perusahaan berupa nama dan nama perusahaan
    public Perusahaan(String nama, String nmPerusahaan) {
        this.nama = nama;
        this.nmPerusahaan = nmPerusahaan;
    }

    public String getNamaOrang() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public long getNohp() {
        return nohp;
    }

    public void setNohp(long nohp) {
        this.nohp = nohp;
    }
    
   //mengembalikan banyak Lowongan yang ada
    public int getnLowongan() {
        return nLowongan;
    }
    //mengembalikan nama perusahaan
    public String getNamaPerusahaan() {
        return this.nmPerusahaan;
    }
    
    //mengembalikan lowongan
    public Lowongan getLowongan1() {
        return this.lowongan;
    }
    
    //mengembalikan daftar lowongan dari class Lowongan
    public List<Lowongan> getDaftarLowongan() {
        return daftarLowongan;
    }
    
//    public Lowongan[] getDaftarLowongan() {
//        return daftarLowongan;
//    }

    
    //membuat lowongan baru Full timer
    public void createLowonganFullTime(String idLowongan, String nmLowongan, String deadline, int waktuKerja) {
       
        Lowongan lo = new Lowongan(idLowongan, nmLowongan, deadline,waktuKerja) {};//membuat lowongan baru dengan mengambil constructor kelas lowongan
        daftarLowongan.add(lo); //menyimpan lowongan yang dibuat ke dalam array nLowongan
        if(waktuKerja > 6){
            nLowongan++;//increment jumlah nLowongan
        }
    }
    //membuat lowongan baru Part Timer
    public void createLowonganPartTime(String idLowongan, String nmLowongan, String deadline, int waktuKerja){
        Lowongan lo = new Lowongan(idLowongan, nmLowongan, deadline,waktuKerja) {};//membuat lowongan baru dengan mengambil constructor kelas lowongan
        daftarLowongan.add( lo); //menyimpan lowongan yang dibuat ke dalam array nLowongan
        if(waktuKerja <= 6){
            nLowongan++;//increment jumlah nLowongan
        }  
    }
    
    //mengembalikan lo  wongan sesuai index
    public Lowongan getLowongan(int index) {
        return daftarLowongan.get(index);
    }

    //mengembalikan lowongan sesuai namaLowongan yang dimasukkan ke dalam parameter
    public Lowongan getLowongan(String nmLowongan) {
        for (int i = 0; i < nLowongan; i++) {
            if (nmLowongan.equalsIgnoreCase(this.daftarLowongan.get(i).getNamaLowongan())) {//jika parameter method sama dengan namaLowongan perusahaan 
                return daftarLowongan.get(i);//maka akan mengembalikan index Lowongan
            }
        }
        return null;
    }

    // method menghapus lowongan sesuai parameter String yang diinputkan
    public void remLowongan(String a) {
        int getIndex = -2;
        for (int i = 0; i < nLowongan; i++) {
            if (this.daftarLowongan.get(i).getIdLowongan().equalsIgnoreCase(a)) {//memeriksa idLowongan yang sama dengan parameter sebanyak nLowongan 
                getIndex = i;
                break;
            }
        }
        for (int i = getIndex + 1; i < nLowongan; i++) {
            daftarLowongan.set(i - 1, daftarLowongan.get(i));
        }
        nLowongan--; //menghapus lowongan
    }

    public void display() {
        System.out.println("Perusahaan " + getNamaPerusahaan());
        System.out.println("Nama Pemilik Perusahaan     : " +getNamaOrang());
        for (int i = 0; i < nLowongan; i++) {
            System.out.println("Lowongan yang tersedia : " 
                    + daftarLowongan.get(i).getIdLowongan() 
                    + "\tLowongan " + daftarLowongan.get(i).getNamaLowongan() 
                    + "\t\t Deadline :" + daftarLowongan.get(i).getDeadline());
        }

    }

    @Override
    public String toString() {
        String s = "nama Lowongan :" + this.getNamaOrang() + "\n";
        String s1 = "perusahaan : " + this.getNamaPerusahaan() + "\n";
        String s2 = "lowongan : \n";
        String lowongan = "";
        for (int i = 0; i < nLowongan; i++) {
            lowongan += (i + 1) + " " + this.daftarLowongan.get(i).getNamaLowongan() + "\n";
        }
        return s + s1 + s2 + lowongan;
    }

    
}
