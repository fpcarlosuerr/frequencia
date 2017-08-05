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
@Table(name = "leituras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Leituras.findAll", query = "SELECT l FROM Leituras l")
    , @NamedQuery(name = "Leituras.findById", query = "SELECT l FROM Leituras l WHERE l.id = :id")
    , @NamedQuery(name = "Leituras.findByNboleto", query = "SELECT l FROM Leituras l WHERE l.nboleto = :nboleto")
    , @NamedQuery(name = "Leituras.findByIdCargo", query = "SELECT l FROM Leituras l WHERE l.idCargo = :idCargo")
    , @NamedQuery(name = "Leituras.findBySequencial", query = "SELECT l FROM Leituras l WHERE l.sequencial = :sequencial")
    , @NamedQuery(name = "Leituras.findByColuna1", query = "SELECT l FROM Leituras l WHERE l.coluna1 = :coluna1")
    , @NamedQuery(name = "Leituras.findByColuna2", query = "SELECT l FROM Leituras l WHERE l.coluna2 = :coluna2")
    , @NamedQuery(name = "Leituras.findByColuna3", query = "SELECT l FROM Leituras l WHERE l.coluna3 = :coluna3")
    , @NamedQuery(name = "Leituras.findByColuna4", query = "SELECT l FROM Leituras l WHERE l.coluna4 = :coluna4")
    , @NamedQuery(name = "Leituras.findByRetornos", query = "SELECT l FROM Leituras l WHERE l.retornos = :retornos")})
public class Leituras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nboleto")
    private String nboleto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "id_cargo")
    private String idCargo;
    @Size(max = 255)
    @Column(name = "sequencial")
    private String sequencial;
    @Size(max = 255)
    @Column(name = "coluna1")
    private String coluna1;
    @Size(max = 255)
    @Column(name = "coluna2")
    private String coluna2;
    @Size(max = 255)
    @Column(name = "coluna3")
    private String coluna3;
    @Size(max = 255)
    @Column(name = "coluna4")
    private String coluna4;
    @Size(max = 255)
    @Column(name = "retornos")
    private String retornos;

    public Leituras() {
    }

    public Leituras(Integer id) {
        this.id = id;
    }

    public Leituras(Integer id, String nboleto, String idCargo) {
        this.id = id;
        this.nboleto = nboleto;
        this.idCargo = idCargo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNboleto() {
        return nboleto;
    }

    public void setNboleto(String nboleto) {
        this.nboleto = nboleto;
    }

    public String getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(String idCargo) {
        this.idCargo = idCargo;
    }

    public String getSequencial() {
        return sequencial;
    }

    public void setSequencial(String sequencial) {
        this.sequencial = sequencial;
    }

    public String getColuna1() {
        return coluna1;
    }

    public void setColuna1(String coluna1) {
        this.coluna1 = coluna1;
    }

    public String getColuna2() {
        return coluna2;
    }

    public void setColuna2(String coluna2) {
        this.coluna2 = coluna2;
    }

    public String getColuna3() {
        return coluna3;
    }

    public void setColuna3(String coluna3) {
        this.coluna3 = coluna3;
    }

    public String getColuna4() {
        return coluna4;
    }

    public void setColuna4(String coluna4) {
        this.coluna4 = coluna4;
    }

    public String getRetornos() {
        return retornos;
    }

    public void setRetornos(String retornos) {
        this.retornos = retornos;
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
        if (!(object instanceof Leituras)) {
            return false;
        }
        Leituras other = (Leituras) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.uerronline.modelo.Leituras[ id=" + id + " ]";
    }
    
}
