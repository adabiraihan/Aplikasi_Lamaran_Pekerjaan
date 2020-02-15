/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LowonganPekerjaan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MODOFWAR
 */
public class Aplikasi {

    ArrayList<Perusahaan> daftarPerusahaan = new ArrayList<>();
    ArrayList<Pelamar> daftarPelamar = new ArrayList<>();
    ArrayList<Lowongan> daftarLowongan = new ArrayList<>();
    ArrayList<BerkasLamaran> daftarBerkasMasuk = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public ArrayList<BerkasLamaran> getDaftarBerkasMasuk() {
        return this.daftarBerkasMasuk;
    }
    public ArrayList<Lowongan> getDaftarLowongan() {
        return this.daftarLowongan;
    }
    public ArrayList<Pelamar> getDaftarPelamar() {
        return this.daftarPelamar;
    }
    public ArrayList<Perusahaan> getDaftarPerusahaan() {
        return this.daftarPerusahaan;
    }

    

    public void addPerusahaan(String nama, String nmPerusahaan) {
        Perusahaan p = new Perusahaan(nama, nmPerusahaan);

        daftarPerusahaan.add(p);
    }

    public void addPelamar(String nama, String idPelamar,String nohp,String usia) {
        Pelamar pe = new Pelamar(nama, idPelamar, nohp, usia);
        daftarPelamar.add(pe);
    }

    public Pelamar getPelamar(String nmPelamar) {
        for (int i = 0; i < daftarPelamar.size(); i++) {
            if (daftarPelamar.get(i).getNamaOrang().equalsIgnoreCase(nmPelamar)) {
                return daftarPelamar.get(i);
            }

        }
        return null;
    }

    public Perusahaan getPerusahaan(String namaPerusahaan) {
        for (int i = 0; i < daftarPerusahaan.size(); i++) {
            if (daftarPerusahaan.get(i).getNamaPerusahaan().equalsIgnoreCase(namaPerusahaan)) {
                return daftarPerusahaan.get(i);
            }

        }
        return null;
    }

    public void hapusPelamar(String namaPelamar) {
        for (int i = 0; i < daftarPelamar.size(); i++) {
            if (daftarPelamar.get(i).getNamaOrang().equalsIgnoreCase(namaPelamar)) {
                daftarPelamar.remove(i);
            }
        }
    }

    public void hapusPerusahaan(String namaPerusahaan) {
        int o = 0;
        for (int i = 0; i < daftarPerusahaan.size(); i++) {
            if (daftarPerusahaan.get(i).getNamaPerusahaan().equalsIgnoreCase(namaPerusahaan)) {
                daftarPerusahaan.remove(i);
                o = 1;
            }

        }
        if (o == 0) {
            System.out.println("Perusahaan tersebut tidak ada");

        } else {
            System.out.println("Perusahaan Berhasil Dihapus");
        }

    }

    public void updatePerusahan(int indexYgMauDiupdate, Perusahaan dataYgBaru) {
        daftarPerusahaan.set(indexYgMauDiupdate, dataYgBaru);
    }

    public String searchPerusahaan(String namaPerusahaan) {
        String s = "";

        for (int i = 0; i < daftarPerusahaan.size(); i++) {
            if (daftarPerusahaan.get(i).getNamaPerusahaan().equalsIgnoreCase(namaPerusahaan)) {
                s = s + "===============" + daftarPerusahaan.get(i).getNamaPerusahaan() + "===============\n";
                s = s + "pemilik perusahaan : " + daftarPerusahaan.get(i).getNamaOrang() + "\n";
                s = s + "Lowongan yang tersedia : \n";
                if (daftarPerusahaan.get(i).getnLowongan() != 0) {
                    for (int j = 0; j < daftarPerusahaan.get(i).getnLowongan(); j++) {
                        s = s + (j + 1) + ".) " + daftarPerusahaan.get(i).getLowongan(j).getNamaLowongan() + "\n";
                    }
                } else {
                    s = s + "Tidak ada\n";
                }
                s = s + "==================================\n";
            }

        }
        return s;

    }

    public String searchPelamar(String namaPelamar) {
        String s = "";

        for (int i = 0; i < daftarPelamar.size(); i++) {
            if (daftarPelamar.get(i).getNamaOrang().equalsIgnoreCase(namaPelamar)) {
                s = s + "=============================================\n";
                s = s + "ID                      : " + daftarPelamar.get(i).getIdPelamar() + "\n";
                s = s + "Nama                    : " + daftarPelamar.get(i).getNamaOrang() + "\n";

                s = s + "Berkas : ";
                if (daftarPelamar.get(i).getnBerkas() != 0) {
                    for (int j = 0; j < daftarPelamar.get(i).getnBerkas(); j++) {
                        s = s + "Id berkas           : " + daftarPelamar.get(i).getBerkas(j).getIdBerkas() + "\n";
                        s = s + "Jenis Berkas        : " + daftarPelamar.get(i).getBerkas(j).getJenisBerkas() + "\n";
                        s = s + "Tgl Masuk Berkas    : " + daftarPelamar.get(i).getBerkas(j).getTglMasukBerkas() + "\n";
                    }
                } else {
                    s = s + "Berkas belum diisi\n";
                }
                s = s + "===============================================\n";

            }
        }
        return s;
    }

    public String searchLowongan(String namaLowongan) {
        String s = "";
        for (int i = 0; i < daftarPerusahaan.size(); i++) {
            for (int j = 0; j < daftarPerusahaan.get(i).getnLowongan(); j++) {
                if (daftarPerusahaan.get(i).getLowongan(j).getNamaLowongan().equalsIgnoreCase(namaLowongan)) {
                    s = s + "Lowongan tersebut tersedia pada perusahaan " + daftarPerusahaan.get(i).getNamaPerusahaan() + "\n";

                }
            }
        }
        return s;
    }

    public String displayPelamar() {
        String s = " ";

        for (int i = 0; i < daftarPelamar.size(); i++) {
            s = s + "=============================================\n";
            s = s + "ID                      : " + daftarPelamar.get(i).getIdPelamar() + "\n";
            s = s + "Nama                    : " + daftarPelamar.get(i).getNamaOrang() + "\n";

            s = s + "Berkas : \n";
            if (daftarPelamar.get(i).getnBerkas() != 0) {
                for (int j = 0; j < daftarPelamar.get(i).getnBerkas(); j++) {
                    s = s + "Id berkas           : " + daftarPelamar.get(i).getBerkas(j).getIdBerkas() + "\n";
                    s = s + "Jenis Berkas        : " + daftarPelamar.get(i).getBerkas(j).getJenisBerkas() + "\n";
                    s = s + "Tgl Masuk Berkas    : " + daftarPelamar.get(i).getBerkas(j).getTglMasukBerkas() + "\n";

                }

            } else {
                s = s + "Berkas belum diisi\n";
            }
            s = s + "===============================================\n";

        }
        return s;
    }

    public String displayPerusahaan() {

        String s = "";
        for (int i = 0; i < daftarPerusahaan.size(); i++) {
            int x = i+1;
            s = s + x +".";
            s = s +"\n"; 
            s = s + "COMPANY        : " + daftarPerusahaan.get(i).getNamaPerusahaan() + "          \n";
            s = s + "OWNER            : " + daftarPerusahaan.get(i).getNamaOrang() + "\n";
            s = s + "JOB VACANCY  : ";
            s = s +"\n"; 
            if (daftarPerusahaan.get(i).getnLowongan() >= 0) {
                for (int j = 0; j < daftarPerusahaan.get(i).getnLowongan(); j++) {
                    
                    s = s +  "                  *" + daftarPerusahaan.get(i).getLowongan(j).getNamaLowongan() + "\t";
                    s = s + "Deadline : " + daftarPerusahaan.get(i).getLowongan(j).getDeadline() + "\n";
                }
            } else {
                s = s + "-";
                s = s +"\n";     
            }
            s = s + "";
            

        }
        return s;
    }

    public String displayBerkasDiTerima(String nmPerusahaan, String namaLowongan) {
        String s = "";
        int o = 0;
        if(getPerusahaan(nmPerusahaan).getLowongan(namaLowongan).getnBTerima()!= 0){
        for (int i = 0; i < getPerusahaan(nmPerusahaan).getLowongan(namaLowongan).getnBTerima(); i++) {

            s = s + "\t Diterima Sebagai " + getPerusahaan(nmPerusahaan).getLowongan(namaLowongan).getNamaLowongan() + "\n";
            s = s + ("id Berkas    : " + getPerusahaan(nmPerusahaan).getLowongan(namaLowongan).getBerkasDiterima(i).getIdBerkas() + "\n");
            s = s + ("jenis bekas  : " + getPerusahaan(nmPerusahaan).getLowongan(namaLowongan).getBerkasDiterima(i).getJenisBerkas() + "\n");
            s = s + ("tgl Masuk Berkas : " + getPerusahaan(nmPerusahaan).getLowongan(namaLowongan).getBerkasDiterima(i).getTglMasukBerkas() + "\n");
            s = s + ("=====================================================================" + "\n");
            o = 1;
        }}else if (getPerusahaan(nmPerusahaan).getLowongan(namaLowongan).getnBTerima() == 0) {
                o=0;
                s=s+"Belum ada yang berkas yang diterima";

            }
            return s;
        }

    

    public String tampilPelamarLowongan(String namaPerusahaan) {
        String s = "";

        for (int i = 0; i < daftarPerusahaan.size(); i++) {
            if (daftarPerusahaan.get(i).getNamaPerusahaan().equalsIgnoreCase(namaPerusahaan)) {
                s = s + "===============" + daftarPerusahaan.get(i).getNamaPerusahaan() + "===============\n";
                s = s + "pemilik perusahaan : " + daftarPerusahaan.get(i).getNamaOrang() + "\n";
                s = s + "Lowongan yang tersedia : \t\t" + "Pelamar \n";
                s = s + "--------------------------------------------------------------------------------\n";
                if (daftarPerusahaan.get(i).getnLowongan() != 0) {
                    for (int j = 0; j < daftarPerusahaan.get(i).getnLowongan(); j++) {
                        s = s + (j + 1) + ". " + daftarPerusahaan.get(i).getLowongan(j).getNamaLowongan() + "\t\t\t" + getPerusahaan(namaPerusahaan).getLowongan(j).getBerkasMasuk(j).getIdBerkas() + "\n";
                    }
                } else {
                    s = s + "Tidak ada\n";
                }
                s = s + "==================================\n";
            }

        }
        return s;

    }

//    public void menu() {
//        try {
//            while (true) {
//                BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
//
//                System.out.println("        MENU    ");
//                System.out.println("1. Menu Perusahaan");
//                System.out.println("2. Menu Pelamar   ");
//                System.out.println("Pilihan = ");
//                int pilihanMenu = input.nextInt();
//
//                switch (pilihanMenu) {
//
//                    case 1:
//                        System.out.println("1. Add       perusahaan");
//                        System.out.println("2. Display   perusahaan");
//                        System.out.println("3. Delete    perusahaan");
//                        System.out.println("4. Search    lowongan");
//                        System.out.println("5. Add       lowongan");
//                        System.out.println("6. Delete    lowongan");
//                        System.out.println("7. saerch    Perusahaan");
//                        System.out.println("8. liat Pelamar Lowongan");
//                        System.out.println("9. liat berkas yang diterima");
//
//                        System.out.println("Pilihan = ");
//                        int pilihanSubMenu = input.nextInt();
//
//                        switch (pilihanSubMenu) {
//                            case 1:
//                                System.out.print("nama pemilik : ");
//                                String nama = input2.readLine();
//                                System.out.print("nama perusahaan : ");
//                                String namaP = input2.readLine();
//                                addPerusahaan(nama, namaP);
//                                break;
//                            case 2:
//                                System.out.println(displayPerusahaan());
//                                break;
//                            case 3:
//                                System.out.print("Masukkan Nama Perusahaan yang akan dihapus : ");
////                                int in = Integer.parseInt(input2.readLine());
//                                String nmPerusahaan1 = input2.readLine();
//                                hapusPerusahaan(nmPerusahaan1);
//                                break;
//                            case 4:
//                                System.out.println("cari nama lowongan : ");
//                                String namaLowongan = input2.readLine();
//                                System.out.println(searchLowongan(namaLowongan));
//                                break;
//                            case 5:
//                                System.out.println("Nama perusahaan : ");
////                                int index = Integer.parseInt(input2.readLine());
//                                String nmPerusahaan2 = input2.readLine();
//                                System.out.println("id Lowongan : ");
//                                String id = input2.readLine();
//                                System.out.println("Nama Lowongan : ");
//                                String nmLowongan = input2.readLine();
//                                System.out.println("Deadline : ");
//                                String deadline = input2.readLine();
//                                System.out.println("Waktu kerja : (fulltimer > 6 jam , Part Timer <= 6 jam)");
//                                int WktKerja = Integer.parseInt(input2.readLine());
//                                if(WktKerja > 6){
//                                    getPerusahaan(nmPerusahaan2).createLowonganFullTime(id, nmLowongan, deadline, WktKerja);
//                                } else{
//                                    getPerusahaan(nmPerusahaan2).createLowonganPartTime(id, nmLowongan, deadline, WktKerja);
//                                }
//                                break;
////                                getPerusahaan(nmPerusahaan2).createLowongan(id, nmLowongan, deadline);
////                                break;
//                            case 6:
//                                System.out.println("Nama perusahaan : ");
//                                String nmPerusahaan3 = input2.readLine();
//
//                                System.out.println("id lowongan yang akan dihapus : ");
//                                String namaL = input2.readLine();
//                                getPerusahaan(nmPerusahaan3).remLowongan(namaL);
//                                break;
//
//                            case 7:
//                                System.out.println("cari nama perusahaan : ");
//                                String nmPerusahaan4 = input2.readLine();
//                                System.out.println(searchPerusahaan(nmPerusahaan4));
//
//                                break;
//                            case 8:
//                                System.out.println("pilih nama perusahaan : ");
//                                String nmPerusahaan5 = input2.readLine();
//
//                                System.out.println("pilih nama lowongan : ");
//                                String nmlow = input2.readLine();
//                                for (int i = 0; i < daftarPerusahaan.size(); i++) {
//                                    for (int j = 0; j < daftarPerusahaan.get(i).getnLowongan(); j++) {
//                                        System.out.println("ID berkas Pelamar : " + getPerusahaan(nmPerusahaan5).getLowongan(nmlow).getBerkasMasuk(j).getIdBerkas());
//                                        break;
//                                    }
//                                    break;
//
//                                }
//
//                                System.out.println("1. terima berkas ?");
//                                System.out.println("2. kembali ke Menu awal");
//                                int opsi = Integer.parseInt(input2.readLine());
//                                if (opsi == 1) {
//                                    System.out.println("Pilih nama pelamar yang ingin diterima ");
//                                    String nmPell = input2.readLine();
//                                    System.out.println("pilih ID berkas yang ingin diterima ");
//                                    String idBerkas3 = input2.readLine();
//                                    getPerusahaan(nmPerusahaan5).getLowongan(nmlow).terimaBerkas(getPelamar(nmPell).getBerkas(idBerkas3));
//                                }
////                                else if(opsi ==2 ){
////                                    System.out.println("pilih id yang akan dihapus : ");
////                                   String ido = input2.readLine();
////                                    getPerusahaan(indexPerusahaan).getLowongan(indexlow).remBerkas(ido);
////                                }
//
//                                break;
//                            case 9:
//                                System.out.println("masukkan Nama perusahaan : ");
//                                String nmPerusahaan7 = input2.readLine();
//                                System.out.println("masukkan nama lowongan yang ingin diliat ");
//                                String nmloww = input2.readLine();
//                                //System.out.println(getPerusahaan(iindexper).getLowongan(iindexlow).getnBTerima());
//                                System.out.println(displayBerkasDiTerima(nmPerusahaan7, nmloww));
//                                break;
//
//                        }
//                        break;
//
//                    case 2:
//                        System.out.println("1. add      pelamar ");
//                        System.out.println("2. display  pelamar ");
//                        System.out.println("3. delete   pelamar ");
//                        System.out.println("4. search   pelamar ");
//                        System.out.println("5. create   berkas ");
//                        System.out.println("6. masukkan minat lowongan kerja");
//
//                        int subPilihan = input.nextInt();
//                        switch (subPilihan) {
//                            case 1:
//                                System.out.print("Nama      : ");
//                                String nama = input2.readLine();
//                                System.out.print("Id pelamar : ");
//                                String id = input2.readLine();
//                                addPelamar(nama,idPelamar,nohp,usia);
//                                break;
//
//                            case 2:
//                                System.out.println(displayPelamar());
//                                break;
//                            case 3:
//                                System.out.println("hapus nama pelamar : ");
//                                String namaPel = input2.readLine();
//                                hapusPelamar(namaPel);
//                                break;
//                            case 4:
//                                System.out.println("cari nama pelamar : ");
//                                String nmPel = input2.readLine();
//                                System.out.println(searchPelamar(nmPel));
//                                break;
//                            case 5:
//                                System.out.println("Nama Pelamar : ");
//                                String nmPelamar11 = input2.readLine();
//                                System.out.println("Id berkas : ");
//                                String idBerkas = input2.readLine();
//                                System.out.println("Jenis Berkas : ");
//                                String jenisBerkas = input2.readLine();
//                                System.out.println("Tanggal Masuk Berkas : ");
//                                String tglMasuk = input2.readLine();
//                                getPelamar(nmPelamar11).createBerkas(idBerkas, jenisBerkas, tglMasuk);
//                                break;
//                            case 6:
//                                System.out.println("Nama pelamar : ");
//                                String nmPelamar2 = input2.readLine();
//                                System.out.println("pilih nama perusahaan ");
//                                String nmPerusahaan6 = input2.readLine();
//                                System.out.println("ID berkas : ");
//                                String idBerkas1 = input2.readLine();
//                                System.out.println("nama lowongan : ");
//                                String nmLow1 = input2.readLine();
//
//                                getPerusahaan(nmPerusahaan6).getLowongan(nmLow1).addBerkas(getPelamar(nmPelamar2).getBerkas(idBerkas1));
//
//                        }
//                }
//            }
//        } catch (ArrayIndexOutOfBoundsException arr) {
//            System.out.println("kelebihan array " + arr.getMessage());
//        } catch (Throwable ex) {
//            System.out.println("error : " + ex.getMessage());
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Aplikasi ap = new Aplikasi();
//          ap.menu();
//    }
}
