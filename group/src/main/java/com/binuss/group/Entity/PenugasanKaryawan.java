package com.binuss.group.Entity;

import java.sql.Date;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import Enumeration.Jabatan;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_penugasan_karyawan")
public class PenugasanKaryawan {
    @Id
	@SequenceGenerator(name="id_penugasan", sequenceName="id_penugasan_seq", allocationSize=1) 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_penugasan")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_karyawan", nullable = false);
    private Karyawan karyawan;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pt", nullable = false);
    private PT pt;

    public PenugasanKaryawan(Karyawan karyawan, PT pt) {
        this.karyawan = karyawan;
        this.pt = pt;
    }

    @Column(name = "jabatan", nullable = false)
    @Enumerated(EnumType.STRING)
    private Jabatan jabatan;

    @Column(name = "tgl_bertugas")
    @Temporal(TemporalType.DATE)
    private Date tglBertugas;


    public PenugasanKaryawan() {
    }

    public PenugasanKaryawan(long id, Karyawan karyawan, PT pt, Jabatan jabatan, Date tglBertugas) {
        this.id = id;
        this.karyawan = karyawan;
        this.pt = pt;
        this.jabatan = jabatan;
        this.tglBertugas = tglBertugas;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Karyawan getKaryawan() {
        return this.karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public PT getPt() {
        return this.pt;
    }

    public void setPt(PT pt) {
        this.pt = pt;
    }

    public Jabatan getJabatan() {
        return this.jabatan;
    }

    public void setJabatan(Jabatan jabatan) {
        this.jabatan = jabatan;
    }

    public Date getTglBertugas() {
        return this.tglBertugas;
    }

    public void setTglBertugas(Date tglBertugas) {
        this.tglBertugas = tglBertugas;
    }

}
