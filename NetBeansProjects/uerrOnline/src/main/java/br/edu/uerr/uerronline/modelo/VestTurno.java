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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "vest_turno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VestTurno.findAll", query = "SELECT v FROM VestTurno v")
    , @NamedQuery(name = "VestTurno.findByIdTurno", query = "SELECT v FROM VestTurno v WHERE v.idTurno = :idTurno")
    , @NamedQuery(name = "VestTurno.findByNomeTurno", query = "SELECT v FROM VestTurno v WHERE v.nomeTurno = :nomeTurno")})
public class VestTurno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_turno")
    private Integer idTurno;
    @Size(max = 50)
    @Column(name = "nome_turno")
    private String nomeTurno;

    public VestTurno() {
    }

    public VestTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public String getNomeTurno() {
        return nomeTurno;
    }

    public void setNomeTurno(String nomeTurno) {
        this.nomeTurno = nomeTurno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTurno != null ? idTurno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VestTurno)) {
            return false;
        }
        VestTurno other = (VestTurno) object;
        if ((this.idTurno == null && other.idTurno != null) || (this.idTurno != null && !this.idTurno.equals(other.idTurno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.uerronline.modelo.VestTurno[ idTurno=" + idTurno + " ]";
    }
    
}
