/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jn.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pccli
 */
@Entity
@Table(name = "trocasOrientador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrocasOrientador.findAll", query = "SELECT t FROM TrocasOrientador t")
    , @NamedQuery(name = "TrocasOrientador.findById", query = "SELECT t FROM TrocasOrientador t WHERE t.id = :id")
    , @NamedQuery(name = "TrocasOrientador.findByOldOrientador", query = "SELECT t FROM TrocasOrientador t WHERE t.oldOrientador = :oldOrientador")
    , @NamedQuery(name = "TrocasOrientador.findByNewOrientador", query = "SELECT t FROM TrocasOrientador t WHERE t.newOrientador = :newOrientador")
    , @NamedQuery(name = "TrocasOrientador.findByDataAlteracao", query = "SELECT t FROM TrocasOrientador t WHERE t.dataAlteracao = :dataAlteracao")})
public class TrocasOrientador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "oldOrientador")
    private String oldOrientador;
    @Size(max = 255)
    @Column(name = "newOrientador")
    private String newOrientador;
    @Column(name = "dataAlteracao")
    @Temporal(TemporalType.DATE)
    private Date dataAlteracao;

    public TrocasOrientador() {
    }

    public TrocasOrientador(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOldOrientador() {
        return oldOrientador;
    }

    public void setOldOrientador(String oldOrientador) {
        this.oldOrientador = oldOrientador;
    }

    public String getNewOrientador() {
        return newOrientador;
    }

    public void setNewOrientador(String newOrientador) {
        this.newOrientador = newOrientador;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
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
        if (!(object instanceof TrocasOrientador)) {
            return false;
        }
        TrocasOrientador other = (TrocasOrientador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jn.model.TrocasOrientador[ id=" + id + " ]";
    }
    
}
