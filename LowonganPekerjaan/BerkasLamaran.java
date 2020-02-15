/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LowonganPekerjaan;
import java.util.*;
/**
 *
 * @author MODOFWAR
 */
public class BerkasLamaran {
    private String jenisBerkas;
    private String tglMasukBerkas;
    private String idBerkas;
    private List<Pelamar> p = new ArrayList();
//    public Pelamar[] p= new Pelamar[10];
    public int nPelamar= 0;

    BerkasLamaran(String id, String jenisBerkas, String tglMsk) {
        this.idBerkas= id;
        this.tglMasukBerkas= tglMsk;
        this.jenisBerkas= jenisBerkas;
    }
    BerkasLamaran(String id) {
        this.idBerkas= id;
    }
    
    public void setIdBerkas(String id){
        this.idBerkas= id;
    }
    
    public String getIdBerkas(){
        return this.idBerkas;
    }

    public void setTglMasukBerkas(String tgl){
        this.tglMasukBerkas= tgl;
    }
    public void setJenisBerkas(String jb){
        this.jenisBerkas= jb;
    }
    
    public String getJenisBerkas(){
      return jenisBerkas;  
    }
    
    public String getTglMasukBerkas(){
        return tglMasukBerkas;
    }
    
    public int getnPelamar(){
        return this.nPelamar;
    }
   
    
    public void addDataPelamar(Pelamar p){
        if (nPelamar < this.p.size()){
			this.p.add(p);
			nPelamar++;
		}
    }
}
    