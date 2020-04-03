/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kutuphaneotomasyonu;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "kitappkayitt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kitappkayitt.findAll", query = "SELECT k FROM Kitappkayitt k")
    , @NamedQuery(name = "Kitappkayitt.findById", query = "SELECT k FROM Kitappkayitt k WHERE k.id = :id")
    , @NamedQuery(name = "Kitappkayitt.findByTarih", query = "SELECT k FROM Kitappkayitt k WHERE k.tarih = :tarih")})
public class Kitappkayitt  implements Serializable  {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "ad")
    private String ad;
    @Basic(optional = false)
    @Lob
    @Column(name = "yazar")
    private String yazar;
    @Basic(optional = false)
    @Column(name = "tarih")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarih;
    @Basic(optional = false)
    @Lob
    @Column(name = "kitabialan")
    private String kitabialan;

    public Kitappkayitt() {
    }

    public Kitappkayitt(Integer id) {
        this.id = id;
    }

    public Kitappkayitt(Integer id, String ad, String yazar, Date tarih, String kitabialan) {
        this.id = id;
        this.ad = ad;
        this.yazar = yazar;
        this.tarih = tarih;
        this.kitabialan = kitabialan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getKitabialan() {
        return kitabialan;
    }

    public void setKitabialan(String kitabialan) {
        this.kitabialan = kitabialan;
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
        if (!(object instanceof Kitappkayitt)) {
            return false;
        }
        Kitappkayitt other = (Kitappkayitt) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.kutuphaneotomasyonu.Kitappkayitt[id=" + id + " ad=" + ad + " yazar=" + yazar + "tarih=" + tarih + "kitabialan="+kitabialan+"]";
    }
    
}
