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
@Table(name = "vest_idioma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VestIdioma.findAll", query = "SELECT v FROM VestIdioma v")
    , @NamedQuery(name = "VestIdioma.findByIdIdioma", query = "SELECT v FROM VestIdioma v WHERE v.idIdioma = :idIdioma")
    , @NamedQuery(name = "VestIdioma.findByNomeIdioma", query = "SELECT v FROM VestIdioma v WHERE v.nomeIdioma = :nomeIdioma")})
public class VestIdioma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_idioma")
    private Integer idIdioma;
    @Size(max = 40)
    @Column(name = "nome_idioma")
    private String nomeIdioma;

    public VestIdioma() {
    }

    public VestIdioma(Integer idIdioma) {
        this.idIdioma = idIdioma;
    }

    public Integer getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Integer idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getNomeIdioma() {
        return nomeIdioma;
    }

    public void setNomeIdioma(String nomeIdioma) {
        this.nomeIdioma = nomeIdioma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIdioma != null ? idIdioma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VestIdioma)) {
            return false;
        }
        VestIdioma other = (VestIdioma) object;
        if ((this.idIdioma == null && other.idIdioma != null) || (this.idIdioma != null && !this.idIdioma.equals(other.idIdioma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.uerronline.modelo.VestIdioma[ idIdioma=" + idIdioma + " ]";
    }
    
}
