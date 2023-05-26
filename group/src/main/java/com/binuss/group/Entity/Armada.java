package com.binuss.group.Entity;

import java.time.Year;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_armada")
public class Armada {
    @Id
    @SequenceGenerator(name = "id_armada", sequenceName = "id_armada_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_armada")
    private long id;

    @Column(name = "nopol", nullable = false)
    private String nopol;

    @Column(name = "merek", nullable = false)
    private String merek;

    @Column(name = "tipe", nullable = false)
    private String tipe;

    @Column(name = "jenis", nullable = false)
    private String jenis;

    @Column(name = "tahun_armada", nullable = false)
    private Year tahun;

    @Column(name = "nama_pemilik", nullable = false)
    private String namaPemilik;

    @Column(name = "no_rangka", nullable = false)
    private String noRangka;

    @Column(name = "no_mesin", nullable = false)
    private String noMesin;

    @Column(name = "lokasi_armada", nullable = false)
    private String lokasiArmada;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pt", nullable = false)
    private PT pt;


    public Armada() {
    }

    public Armada(long id, String nopol, String merek, String tipe, String jenis, Year tahun, String namaPemilik, String noRangka, String noMesin, String lokasiArmada, PT pt) {
        this.id = id;
        this.nopol = nopol;
        this.merek = merek;
        this.tipe = tipe;
        this.jenis = jenis;
        this.tahun = tahun;
        this.namaPemilik = namaPemilik;
        this.noRangka = noRangka;
        this.noMesin = noMesin;
        this.lokasiArmada = lokasiArmada;
        this.pt = pt;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNopol() {
        return this.nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public String getMerek() {
        return this.merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return this.tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Year getTahun() {
        return this.tahun;
    }

    public void setTahun(Year tahun) {
        this.tahun = tahun;
    }

    public String getNamaPemilik() {
        return this.namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getNoRangka() {
        return this.noRangka;
    }

    public void setNoRangka(String noRangka) {
        this.noRangka = noRangka;
    }

    public String getNoMesin() {
        return this.noMesin;
    }

    public void setNoMesin(String noMesin) {
        this.noMesin = noMesin;
    }

    public String getLokasiArmada() {
        return this.lokasiArmada;
    }

    public void setLokasiArmada(String lokasiArmada) {
        this.lokasiArmada = lokasiArmada;
    }

    public PT getPt() {
        return this.pt;
    }

    public void setPt(PT pt) {
        this.pt = pt;
    }

}
