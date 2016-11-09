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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author josmarsm
 */
@Entity
@Table(name = "User_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userroles.findAll", query = "SELECT u FROM Userroles u")
    , @NamedQuery(name = "Userroles.findByUserRoleId", query = "SELECT u FROM Userroles u WHERE u.userRoleId = :userRoleId")
    , @NamedQuery(name = "Userroles.findByUserId", query = "SELECT u FROM Userroles u WHERE u.userId = :userId")
    , @NamedQuery(name = "Userroles.findByAuthority", query = "SELECT u FROM Userroles u WHERE u.authority = :authority")})
public class Userroles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_role_id")
    private Integer userRoleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "authority")
    private String authority;

    public Userroles() {
    }

    public Userroles(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Userroles(Integer userRoleId, int userId, String authority) {
        this.userRoleId = userRoleId;
        this.userId = userId;
        this.authority = authority;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userRoleId != null ? userRoleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userroles)) {
            return false;
        }
        Userroles other = (Userroles) object;
        if ((this.userRoleId == null && other.userRoleId != null) || (this.userRoleId != null && !this.userRoleId.equals(other.userRoleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.jn.model.Userroles[ userRoleId=" + userRoleId + " ]";
    }
    
}
