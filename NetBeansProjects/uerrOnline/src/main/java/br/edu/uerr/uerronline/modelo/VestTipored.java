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
@Table(name = "vest_tipored")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VestTipored.findAll", query = "SELECT v FROM VestTipored v")
    , @NamedQuery(name = "VestTipored.findByIdTipored", query = "SELECT v FROM VestTipored v WHERE v.idTipored = :idTipored")
    , @NamedQuery(name = "VestTipored.findByIdCertame", query = "SELECT v FROM VestTipored v WHERE v.idCertame = :idCertame")
    , @NamedQuery(name = "VestTipored.findByNome", query = "SELECT v FROM VestTipored v WHERE v.nome = :nome")})
public class VestTipored implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipored")
    private Integer idTipored;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_certame")
    private int idCertame;
    @Size(max = 50)
    @Column(name = "nome")
    private String nome;

    public VestTipored() {
    }

    public VestTipored(Integer idTipored) {
        this.idTipored = idTipored;
    }

    public VestTipored(Integer idTipored, int idCertame) {
        this.idTipored = idTipored;
        this.idCertame = idCertame;
    }

    public Integer getIdTipored() {
        return idTipored;
    }

    public void setIdTipored(Integer idTipored) {
        this.idTipored = idTipored;
    }

    public int getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(int idCertame) {
        this.idCertame = idCertame;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipored != null ? idTipored.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VestTipored)) {
            return false;
        }
        VestTipored other = (VestTipored) object;
        if ((this.idTipored == null && other.idTipored != null) || (this.idTipored != null && !this.idTipored.equals(other.idTipored))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.uerronline.modelo.VestTipored[ idTipored=" + idTipored + " ]";
    }
    
}
