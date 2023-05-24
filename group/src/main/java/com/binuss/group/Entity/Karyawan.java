package com.binuss.group.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_karyawan")
public class Karyawan {
    @Id
	@SequenceGenerator(name="id_karyawan", sequenceName="id_karyawan_seq", allocationSize=1) 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_karyawan")
    private long id;

    @Column(name = "nama_karyawan", nullable = false)
    private String namaKaryawan;

    @Column(name = "nik", nullable = false)
    private String nik;

    @Column(name = "alamat_karyawan", nullable = false)
    private String alamatKaryawan;

    @Column(name = "tanggal_lahir", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date tanggalLahir;

    @Column(name = "tempat_lahir")
    private String tempatLahir;

    @Column(name = "status_karyawan", nullable = false)
    private boolean statusKaryawan;

    public Karyawan() {
    }

    public Karyawan(long id, String namaKaryawan, String nik, String alamatKaryawan, Date tanggalLahir, String tempatLahir, boolean isActive) {
        this.id = id;
        this.namaKaryawan = namaKaryawan;
        this.nik = nik;
        this.alamatKaryawan = alamatKaryawan;
        this.tanggalLahir = tanggalLahir;
        this.tempatLahir = tempatLahir;
        this.statusKaryawan = isActive;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamaKaryawan() {
        return this.namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getNik() {
        return this.nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAlamatKaryawan() {
        return this.alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan = alamatKaryawan;
    }

    public Date getTanggalLahir() {
        return this.tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTempatLahir() {
        return this.tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public boolean isStatusKaryawan() {
        return this.statusKaryawan;
    }

    public boolean getStatusKaryawan() {
        return this.statusKaryawan;
    }

    public void isActive() {
        this.statusKaryawan = true;
    }
    public void isNotActive() {
        this.statusKaryawan = false;
    }
}
