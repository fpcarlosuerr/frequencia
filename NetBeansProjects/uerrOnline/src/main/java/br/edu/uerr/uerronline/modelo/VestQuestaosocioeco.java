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
@Table(name = "vest_questaosocioeco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VestQuestaosocioeco.findAll", query = "SELECT v FROM VestQuestaosocioeco v")
    , @NamedQuery(name = "VestQuestaosocioeco.findByIdQuestao", query = "SELECT v FROM VestQuestaosocioeco v WHERE v.idQuestao = :idQuestao")
    , @NamedQuery(name = "VestQuestaosocioeco.findByNomeQuestao", query = "SELECT v FROM VestQuestaosocioeco v WHERE v.nomeQuestao = :nomeQuestao")})
public class VestQuestaosocioeco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_questao")
    private Integer idQuestao;
    @Size(max = 250)
    @Column(name = "nome_questao")
    private String nomeQuestao;

    public VestQuestaosocioeco() {
    }

    public VestQuestaosocioeco(Integer idQuestao) {
        this.idQuestao = idQuestao;
    }

    public Integer getIdQuestao() {
        return idQuestao;
    }

    public void setIdQuestao(Integer idQuestao) {
        this.idQuestao = idQuestao;
    }

    public String getNomeQuestao() {
        return nomeQuestao;
    }

    public void setNomeQuestao(String nomeQuestao) {
        this.nomeQuestao = nomeQuestao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idQuestao != null ? idQuestao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VestQuestaosocioeco)) {
            return false;
        }
        VestQuestaosocioeco other = (VestQuestaosocioeco) object;
        if ((this.idQuestao == null && other.idQuestao != null) || (this.idQuestao != null && !this.idQuestao.equals(other.idQuestao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.uerronline.modelo.VestQuestaosocioeco[ idQuestao=" + idQuestao + " ]";
    }
    
}
