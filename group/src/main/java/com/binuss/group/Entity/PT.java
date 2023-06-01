package com.binuss.group.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_pt")
public class PT {
    @Id
    @SequenceGenerator(name = "id_pt", sequenceName = "id_pt_seq", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_pt") 
    private long id;

    @Column(name = "nama_pt", nullable = false)
    private String namaPT;

    @Column(name = "alamat_lengkap", nullable = false)
    private String alamatLengkap;

    @Column(name = "kota", nullable = false)
    private String kota;

    @Column(name = "no_telp")
    private String noTelp;
    
    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "logo")
    private String logo;

    @Column(name = "npwp_pt", nullable = false)
    private String npwpPT;
    
    @Column(name = "status")
    private Boolean isActive;


    public PT() {
    }

    public PT(long id, String namaPT, String alamatLengkap, String kota, String email, String logo, String npwpPT, Boolean isActive) {
        this.id = id;
        this.namaPT = namaPT;
        this.alamatLengkap = alamatLengkap;
        this.kota = kota;
        this.email = email;
        this.logo = logo;
        this.npwpPT = npwpPT;
        this.isActive = isActive;
    }

    public PT(PT newPt) {
        this.namaPT = newPt.namaPT;
        this.alamatLengkap = newPt.alamatLengkap;
        this.kota = newPt.kota;
        this.email = newPt.email;
        this.logo = newPt.logo;
        this.npwpPT = newPt.npwpPT;
        this.isActive = newPt.isActive;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamaPT() {
        return this.namaPT;
    }

    public void setNamaPT(String namaPT) {
        this.namaPT = namaPT;
    }

    public String getAlamatLengkap() {
        return this.alamatLengkap;
    }

    public void setAlamatLengkap(String alamatLengkap) {
        this.alamatLengkap = alamatLengkap;
    }

    public String getKota() {
        return this.kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNpwpPT() {
        return this.npwpPT;
    }

    public void setNpwpPT(String npwpPT) {
        this.npwpPT = npwpPT;
    }


    public String getNoTelp() {
        return this.noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public Boolean IsActive() {
        return this.isActive;
    }

    public void IsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    


}
