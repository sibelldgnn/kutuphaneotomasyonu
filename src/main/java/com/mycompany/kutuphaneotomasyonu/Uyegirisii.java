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
@Table(name = "uyegirisii")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uyegirisii.findAll", query = "SELECT u FROM Uyegirisii u")
    , @NamedQuery(name = "Uyegirisii.findById", query = "SELECT u FROM Uyegirisii u WHERE u.id = :id")})
public class Uyegirisii implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Lob
    @Column(name = "parola")
    private String parola;

    public Uyegirisii() {
    }

    public Uyegirisii(Integer id) {
        this.id = id;
    }

    public Uyegirisii(Integer id, String email, String parola) {
        this.id = id;
        this.email = email;
        this.parola = parola;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Uyegirisii)) {
            return false;
        }
        Uyegirisii other = (Uyegirisii) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
       return "com.mycompany.kutuphaneotomasyonu.Uyegirisii[ id=" + id + "email=" + email + "parola=" + parola + "   ]";
     }
    
}
