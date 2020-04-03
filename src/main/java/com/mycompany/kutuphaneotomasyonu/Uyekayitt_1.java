/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kutuphaneotomasyonu;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "uyekayitt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uyekayitt_1.findAll", query = "SELECT u FROM Uyekayitt_1 u")
    , @NamedQuery(name = "Uyekayitt_1.findById", query = "SELECT u FROM Uyekayitt_1 u WHERE u.id = :id")
    , @NamedQuery(name = "Uyekayitt_1.findByTc", query = "SELECT u FROM Uyekayitt_1 u WHERE u.tc = :tc")
    , @NamedQuery(name = "Uyekayitt_1.findByTelefon", query = "SELECT u FROM Uyekayitt_1 u WHERE u.telefon = :telefon")})
public class Uyekayitt_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tc")
    private long tc;
    @Basic(optional = false)
    @Lob
    @Column(name = "ad")
    private String ad;
    @Basic(optional = false)
    @Lob
    @Column(name = "soyad")
    private String soyad;
    @Basic(optional = false)
    @Lob
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "telefon")
    private long telefon;
    @Basic(optional = false)
    @Lob
    @Column(name = "parola")
    private String parola;

    public Uyekayitt_1() {
    }

    public Uyekayitt_1(Integer id) {
        this.id = id;
    }

    public Uyekayitt_1(Integer id, long tc, String ad, String soyad, String email, long telefon, String parola) {
        this.id = id;
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telefon = telefon;
        this.parola = parola;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getTc() {
        return tc;
    }

    public void setTc(long tc) {
        this.tc = tc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uyekayitt_1)) {
            return false;
        }
        Uyekayitt_1 other = (Uyekayitt_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.kutuphaneotomasyonu.Uyekayitt_1[ id=" + id + " tc=" + tc + "ad=" + ad + "soyad=" + soyad + "email=" + email + "telefon=" + telefon + "prola=" + parola + "]";
    }
    
}
