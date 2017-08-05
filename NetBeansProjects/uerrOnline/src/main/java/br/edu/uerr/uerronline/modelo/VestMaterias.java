/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.uerronline.modelo;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "vest_materias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VestMaterias.findAll", query = "SELECT v FROM VestMaterias v")
    , @NamedQuery(name = "VestMaterias.findByIdMat", query = "SELECT v FROM VestMaterias v WHERE v.idMat = :idMat")
    , @NamedQuery(name = "VestMaterias.findByIdCertame", query = "SELECT v FROM VestMaterias v WHERE v.idCertame = :idCertame")
    , @NamedQuery(name = "VestMaterias.findByIdCargo", query = "SELECT v FROM VestMaterias v WHERE v.idCargo = :idCargo")
    , @NamedQuery(name = "VestMaterias.findByNomeMat", query = "SELECT v FROM VestMaterias v WHERE v.nomeMat = :nomeMat")
    , @NamedQuery(name = "VestMaterias.findByMatIn", query = "SELECT v FROM VestMaterias v WHERE v.matIn = :matIn")
    , @NamedQuery(name = "VestMaterias.findByMatOut", query = "SELECT v FROM VestMaterias v WHERE v.matOut = :matOut")
    , @NamedQuery(name = "VestMaterias.findByMatAtivo", query = "SELECT v FROM VestMaterias v WHERE v.matAtivo = :matAtivo")
    , @NamedQuery(name = "VestMaterias.findByPeso", query = "SELECT v FROM VestMaterias v WHERE v.peso = :peso")})
public class VestMaterias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mat")
    private Integer idMat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_certame")
    private int idCertame;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cargo")
    private int idCargo;
    @Size(max = 30)
    @Column(name = "nome_mat")
    private String nomeMat;
    @Column(name = "mat_in")
    private Integer matIn;
    @Column(name = "mat_out")
    private Integer matOut;
    @Column(name = "mat_ativo")
    private Integer matAtivo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "peso")
    private BigDecimal peso;

    public VestMaterias() {
    }

    public VestMaterias(Integer idMat) {
        this.idMat = idMat;
    }

    public VestMaterias(Integer idMat, int idCertame, int idCargo) {
        this.idMat = idMat;
        this.idCertame = idCertame;
        this.idCargo = idCargo;
    }

    public Integer getIdMat() {
        return idMat;
    }

    public void setIdMat(Integer idMat) {
        this.idMat = idMat;
    }

    public int getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(int idCertame) {
        this.idCertame = idCertame;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNomeMat() {
        return nomeMat;
    }

    public void setNomeMat(String nomeMat) {
        this.nomeMat = nomeMat;
    }

    public Integer getMatIn() {
        return matIn;
    }

    public void setMatIn(Integer matIn) {
        this.matIn = matIn;
    }

    public Integer getMatOut() {
        return matOut;
    }

    public void setMatOut(Integer matOut) {
        this.matOut = matOut;
    }

    public Integer getMatAtivo() {
        return matAtivo;
    }

    public void setMatAtivo(Integer matAtivo) {
        this.matAtivo = matAtivo;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMat != null ? idMat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VestMaterias)) {
            return false;
        }
        VestMaterias other = (VestMaterias) object;
        if ((this.idMat == null && other.idMat != null) || (this.idMat != null && !this.idMat.equals(other.idMat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.uerronline.modelo.VestMaterias[ idMat=" + idMat + " ]";
    }
    
}
