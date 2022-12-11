/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_pbol;

/**
 *
 * @author Yudi Tan
 */
public class TableModel {
    String nama,umur,gender,kulit,mata,tinggi,rambut;
    
    public TableModel(String nama , String umur,String gender,String kulit,String mata,String tinggi,String rambut){
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.kulit = kulit;
        this.mata = mata;
        this.tinggi = tinggi;
        this.rambut = rambut;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getKulit() {
        return kulit;
    }

    public void setKulit(String kulit) {
        this.kulit = kulit;
    }

    public String getMata() {
        return mata;
    }

    public void setMata(String mata) {
        this.mata = mata;
    }

    public String getTinggi() {
        return tinggi;
    }

    public void setTinggi(String tinggi) {
        this.tinggi = tinggi;
    }

    public String getRambut() {
        return rambut;
    }

    public void setRambut(String rambut) {
        this.rambut = rambut;
    }
    
    
    
}
