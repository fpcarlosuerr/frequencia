/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.uerronline.modelo;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "tb_rgtipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rgtipo.findAll", query = "SELECT r FROM Rgtipo r")
    , @NamedQuery(name = "Rgtipo.findById", query = "SELECT r FROM Rgtipo r WHERE r.id = :id")
    , @NamedQuery(name = "Rgtipo.findByRgtipo", query = "SELECT r FROM Rgtipo r WHERE r.rgtipo = :rgtipo")})
public class Rgtipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "rgtipo")
    private String rgtipo;

    public Rgtipo() {
    }

    public Rgtipo(Integer id) {
        this.id = id;
    }

    public Rgtipo(Integer id, String rgtipo) {
        this.id = id;
        this.rgtipo = rgtipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRgtipo() {
        return rgtipo;
    }

    public void setRgtipo(String rgtipo) {
        this.rgtipo = rgtipo;
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
        if (!(object instanceof Rgtipo)) {
            return false;
        }
        Rgtipo other = (Rgtipo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.uerronline.modelo.Rgtipo[ id=" + id + " ]";
    }
    
}
