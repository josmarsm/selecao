/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jn.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pccli
 */
@Entity
@Table(name = "mediaposcomp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mediaposcomp.findAll", query = "SELECT m FROM Mediaposcomp m")
    , @NamedQuery(name = "Mediaposcomp.findById", query = "SELECT m FROM Mediaposcomp m WHERE m.id = :id")
    , @NamedQuery(name = "Mediaposcomp.findByAno", query = "SELECT m FROM Mediaposcomp m WHERE m.ano = :ano")
    , @NamedQuery(name = "Mediaposcomp.findByMedia", query = "SELECT m FROM Mediaposcomp m WHERE m.media = :media")})
public class Mediaposcomp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Size(max = 4)
    @Column(name = "Ano")
    private String ano;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Media")
    private BigDecimal media;

    public Mediaposcomp() {
    }

    public Mediaposcomp(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public BigDecimal getMedia() {
        return media;
    }

    public void setMedia(BigDecimal media) {
        this.media = media;
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
        if (!(object instanceof Mediaposcomp)) {
            return false;
        }
        Mediaposcomp other = (Mediaposcomp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jn.model.Mediaposcomp[ id=" + id + " ]";
    }
    
}
