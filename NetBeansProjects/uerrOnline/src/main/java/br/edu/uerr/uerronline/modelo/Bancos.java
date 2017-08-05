/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.uerronline.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fpcarlos
 */
@Entity
@Table(name = "tb_bancos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bancos.findAll", query = "SELECT b FROM Bancos b")
    , @NamedQuery(name = "Bancos.findBySeqBanco", query = "SELECT b FROM Bancos b WHERE b.seqBanco = :seqBanco")
    , @NamedQuery(name = "Bancos.findByIdBanco", query = "SELECT b FROM Bancos b WHERE b.idBanco = :idBanco")
    , @NamedQuery(name = "Bancos.findByNomeBanco", query = "SELECT b FROM Bancos b WHERE b.nomeBanco = :nomeBanco")
    , @NamedQuery(name = "Bancos.findByCodComp", query = "SELECT b FROM Bancos b WHERE b.codComp = :codComp")
    , @NamedQuery(name = "Bancos.findByAgBanco", query = "SELECT b FROM Bancos b WHERE b.agBanco = :agBanco")
    , @NamedQuery(name = "Bancos.findByAgNome", query = "SELECT b FROM Bancos b WHERE b.agNome = :agNome")
    , @NamedQuery(name = "Bancos.findByAgEnd", query = "SELECT b FROM Bancos b WHERE b.agEnd = :agEnd")
    , @NamedQuery(name = "Bancos.findByAgBairro", query = "SELECT b FROM Bancos b WHERE b.agBairro = :agBairro")
    , @NamedQuery(name = "Bancos.findByAgCep", query = "SELECT b FROM Bancos b WHERE b.agCep = :agCep")
    , @NamedQuery(name = "Bancos.findByAgFone", query = "SELECT b FROM Bancos b WHERE b.agFone = :agFone")
    , @NamedQuery(name = "Bancos.findByIdCidade", query = "SELECT b FROM Bancos b WHERE b.idCidade = :idCidade")
    , @NamedQuery(name = "Bancos.findByIdEstado", query = "SELECT b FROM Bancos b WHERE b.idEstado = :idEstado")
    , @NamedQuery(name = "Bancos.findByDataAltDados", query = "SELECT b FROM Bancos b WHERE b.dataAltDados = :dataAltDados")
    , @NamedQuery(name = "Bancos.findByPgWeb", query = "SELECT b FROM Bancos b WHERE b.pgWeb = :pgWeb")})
public class Bancos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "seq_banco")
    private Integer seqBanco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_banco")
    private int idBanco;
    @Size(max = 255)
    @Column(name = "nome_banco")
    private String nomeBanco;
    @Size(max = 4)
    @Column(name = "cod_comp")
    private String codComp;
    @Size(max = 8)
    @Column(name = "ag_banco")
    private String agBanco;
    @Size(max = 100)
    @Column(name = "ag_nome")
    private String agNome;
    @Size(max = 255)
    @Column(name = "ag_end")
    private String agEnd;
    @Size(max = 255)
    @Column(name = "ag_bairro")
    private String agBairro;
    @Size(max = 8)
    @Column(name = "ag_cep")
    private String agCep;
    @Size(max = 14)
    @Column(name = "ag_fone")
    private String agFone;
    @Lob
    @Size(max = 65535)
    @Column(name = "ag_mapa")
    private String agMapa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cidade")
    private int idCidade;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estado")
    private int idEstado;
    @Column(name = "data_alt_dados")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAltDados;
    @Size(max = 150)
    @Column(name = "pg_web")
    private String pgWeb;

    public Bancos() {
    }

    public Bancos(Integer seqBanco) {
        this.seqBanco = seqBanco;
    }

    public Bancos(Integer seqBanco, int idBanco, int idCidade, int idEstado) {
        this.seqBanco = seqBanco;
        this.idBanco = idBanco;
        this.idCidade = idCidade;
        this.idEstado = idEstado;
    }

    public Integer getSeqBanco() {
        return seqBanco;
    }

    public void setSeqBanco(Integer seqBanco) {
        this.seqBanco = seqBanco;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getCodComp() {
        return codComp;
    }

    public void setCodComp(String codComp) {
        this.codComp = codComp;
    }

    public String getAgBanco() {
        return agBanco;
    }

    public void setAgBanco(String agBanco) {
        this.agBanco = agBanco;
    }

    public String getAgNome() {
        return agNome;
    }

    public void setAgNome(String agNome) {
        this.agNome = agNome;
    }

    public String getAgEnd() {
        return agEnd;
    }

    public void setAgEnd(String agEnd) {
        this.agEnd = agEnd;
    }

    public String getAgBairro() {
        return agBairro;
    }

    public void setAgBairro(String agBairro) {
        this.agBairro = agBairro;
    }

    public String getAgCep() {
        return agCep;
    }

    public void setAgCep(String agCep) {
        this.agCep = agCep;
    }

    public String getAgFone() {
        return agFone;
    }

    public void setAgFone(String agFone) {
        this.agFone = agFone;
    }

    public String getAgMapa() {
        return agMapa;
    }

    public void setAgMapa(String agMapa) {
        this.agMapa = agMapa;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public Date getDataAltDados() {
        return dataAltDados;
    }

    public void setDataAltDados(Date dataAltDados) {
        this.dataAltDados = dataAltDados;
    }

    public String getPgWeb() {
        return pgWeb;
    }

    public void setPgWeb(String pgWeb) {
        this.pgWeb = pgWeb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seqBanco != null ? seqBanco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bancos)) {
            return false;
        }
        Bancos other = (Bancos) object;
        if ((this.seqBanco == null && other.seqBanco != null) || (this.seqBanco != null && !this.seqBanco.equals(other.seqBanco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.uerronline.modelo.Bancos[ seqBanco=" + seqBanco + " ]";
    }
    
}
