/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jn.model;

import java.io.Serializable;
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
@Table(name = "LinhaPesquisa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LinhaPesquisa.findAll", query = "SELECT l FROM LinhaPesquisa l")
    , @NamedQuery(name = "LinhaPesquisa.findById", query = "SELECT l FROM LinhaPesquisa l WHERE l.id = :id")
    , @NamedQuery(name = "LinhaPesquisa.findBySigla", query = "SELECT l FROM LinhaPesquisa l WHERE l.sigla = :sigla")
    , @NamedQuery(name = "LinhaPesquisa.findByDescricao", query = "SELECT l FROM LinhaPesquisa l WHERE l.descricao = :descricao")})
public class LinhaPesquisa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Size(max = 10)
    @Column(name = "Sigla")
    private String sigla;
    @Size(max = 255)
    @Column(name = "Descricao")
    private String descricao;

    public LinhaPesquisa() {
    }

    public LinhaPesquisa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        if (!(object instanceof LinhaPesquisa)) {
            return false;
        }
        LinhaPesquisa other = (LinhaPesquisa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jn.model.LinhaPesquisa[ id=" + id + " ]";
    }
    
}
