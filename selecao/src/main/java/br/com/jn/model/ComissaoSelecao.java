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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author josmarsm
 */
@Entity
@Table(name = "ComissaoSelecao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComissaoSelecao.findAll", query = "SELECT c FROM ComissaoSelecao c")
    , @NamedQuery(name = "ComissaoSelecao.findById", query = "SELECT c FROM ComissaoSelecao c WHERE c.id = :id")
    , @NamedQuery(name = "ComissaoSelecao.findByMembro", query = "SELECT c FROM ComissaoSelecao c WHERE c.membro = :membro")})
public class ComissaoSelecao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Membro")
    private Integer membro;

    public ComissaoSelecao() {
    }

    public ComissaoSelecao(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMembro() {
        return membro;
    }

    public void setMembro(Integer membro) {
        this.membro = membro;
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
        if (!(object instanceof ComissaoSelecao)) {
            return false;
        }
        ComissaoSelecao other = (ComissaoSelecao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jn.model.ComissaoSelecao[ id=" + id + " ]";
    }
    
}
