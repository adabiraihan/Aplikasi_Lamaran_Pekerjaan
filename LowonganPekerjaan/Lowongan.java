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
 * @author A455LN
 */
public abstract class Lowongan {
    
    private List<BerkasLamaran> daftarBerkasMasuk = new ArrayList();
    private List<BerkasLamaran> daftarBerkasDiterima = new ArrayList();
//    private BerkasLamaran[] berkasMasuk = new BerkasLamaran[50];
//    private BerkasLamaran[] berkasDiterima = new BerkasLamaran[50];
    private String idLowongan;
    private String deadline;
    private int nBerkas = 0;
    private int nBTerima = 0;
    private String nmLowongan;
    private int waktuKerja;

    Lowongan(String idLowongan, String nm, String deadline, int waktuKerja) {
        this.idLowongan = idLowongan;
        this.deadline = deadline;
        this.nmLowongan = nm;
        this.waktuKerja = waktuKerja;
    }

    public String getNamaLowongan() {
        return this.nmLowongan;
    }

    public int getnBerkas() {
        return this.nBerkas;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public String getIdLowongan() {
        return this.idLowongan;
    }
    
    //menambah berkas
    public void addBerkas(BerkasLamaran b) {
        daftarBerkasMasuk.add(b);
        nBerkas++;
//        this.berkasMasuk[nBerkas] = b;
//        nBerkas++;
    }
    
    
    //mengambil berkas lamaran sesuai index
    public BerkasLamaran getBerkasMasuk(int index) {
//        return berkasMasuk[index];
            return daftarBerkasMasuk.get(index);
    }

    //mengambil berkas lamaran yang masuk sesuai id String
    public BerkasLamaran getBerkasMasuk(String id) {
//        for (int i = 0; i < nBTerima; i++) {
//            if (id.equals(this.berkasMasuk[i].getIdBerkas())) {
//                return berkasMasuk[i];
//            }
//
//        }
//        return null;
        for (int i = 0; i < nBTerima; i++) {
            if (id.equals(this.daftarBerkasMasuk.get(i).getIdBerkas())) {
                return daftarBerkasMasuk.get(i);
            }

        }
        return null;
    }
     
    //menerima berkas 
    public void terimaBerkas(BerkasLamaran b) {
//        if (nBerkas > nBTerima) {
//            this.berkasDiterima[nBTerima] = b;
//            nBTerima++;//menambah berkas yang diterima
//            nBerkas--;//mengurangi nBerkas
//        }
        if (nBerkas > nBTerima) {
            this.daftarBerkasDiterima.add(b);
            nBTerima++;//menambah berkas yang diterima
            nBerkas--;//mengurangi nBerkas
        }
    }

    public int getnBTerima() {
        return this.nBTerima;
    }

    public BerkasLamaran getBerkasDiterima(int index) {
        //return berkasDiterima[index];
        return daftarBerkasDiterima.get(index);
    }

    //mengahhpus berkas dengan parameter indeks
    public void remBerkas(String index) {
//        int getIndex = -2;
//        for (int i = 0; i < nBerkas; i++) {
//            if (index.equals(this.berkasMasuk[i].getIdBerkas())) {
//                getIndex = i;
//                break;
//            }
//        }
//        for (int i = getIndex + 1; i < nBerkas; i++) {
//            berkasMasuk[i - 1] = berkasMasuk[i];
//        }
//        nBerkas--;
        int getIndex = -2;
        for (int i = 0; i < nBerkas; i++) {
            if (index.equals(this.daftarBerkasMasuk.get(i).getIdBerkas())) {
                getIndex = i;
                break;
            }
        }
        for (int i = getIndex + 1; i < nBerkas; i++) {
            daftarBerkasMasuk.set(i - 1, daftarBerkasMasuk.get(i));
        }
        nBerkas--;
    }

}
