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
@Table(name = "vest_tipo_candidato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VestTipoCandidato.findAll", query = "SELECT v FROM VestTipoCandidato v")
    , @NamedQuery(name = "VestTipoCandidato.findByIdTipocand", query = "SELECT v FROM VestTipoCandidato v WHERE v.idTipocand = :idTipocand")
    , @NamedQuery(name = "VestTipoCandidato.findByNomeTipocand", query = "SELECT v FROM VestTipoCandidato v WHERE v.nomeTipocand = :nomeTipocand")})
public class VestTipoCandidato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipocand")
    private Integer idTipocand;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nome_tipocand")
    private String nomeTipocand;

    public VestTipoCandidato() {
    }

    public VestTipoCandidato(Integer idTipocand) {
        this.idTipocand = idTipocand;
    }

    public VestTipoCandidato(Integer idTipocand, String nomeTipocand) {
        this.idTipocand = idTipocand;
        this.nomeTipocand = nomeTipocand;
    }

    public Integer getIdTipocand() {
        return idTipocand;
    }

    public void setIdTipocand(Integer idTipocand) {
        this.idTipocand = idTipocand;
    }

    public String getNomeTipocand() {
        return nomeTipocand;
    }

    public void setNomeTipocand(String nomeTipocand) {
        this.nomeTipocand = nomeTipocand;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipocand != null ? idTipocand.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VestTipoCandidato)) {
            return false;
        }
        VestTipoCandidato other = (VestTipoCandidato) object;
        if ((this.idTipocand == null && other.idTipocand != null) || (this.idTipocand != null && !this.idTipocand.equals(other.idTipocand))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.uerronline.modelo.VestTipoCandidato[ idTipocand=" + idTipocand + " ]";
    }
    
}
