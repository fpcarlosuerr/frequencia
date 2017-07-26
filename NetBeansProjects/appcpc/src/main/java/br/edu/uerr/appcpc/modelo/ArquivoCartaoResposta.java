/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.appcpc.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.Dependent;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Dependent
@Entity
@Table(name = "arquivo_cartao_resposta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ArquivoCartaoResposta.findAll", query = "SELECT a FROM ArquivoCartaoResposta a")
    , @NamedQuery(name = "ArquivoCartaoResposta.findById", query = "SELECT a FROM ArquivoCartaoResposta a WHERE a.id = :id")
    , @NamedQuery(name = "ArquivoCartaoResposta.findByIdTipoArquivo", query = "SELECT a FROM ArquivoCartaoResposta a WHERE a.idTipoArquivo = :idTipoArquivo")
    , @NamedQuery(name = "ArquivoCartaoResposta.findByTiutlo", query = "SELECT a FROM ArquivoCartaoResposta a WHERE a.tiutlo = :tiutlo")
    , @NamedQuery(name = "ArquivoCartaoResposta.findByDataHora", query = "SELECT a FROM ArquivoCartaoResposta a WHERE a.dataHora = :dataHora")
    , @NamedQuery(name = "ArquivoCartaoResposta.findByExtArquivo", query = "SELECT a FROM ArquivoCartaoResposta a WHERE a.extArquivo = :extArquivo")
    , @NamedQuery(name = "ArquivoCartaoResposta.findByNomeArquivo", query = "SELECT a FROM ArquivoCartaoResposta a WHERE a.nomeArquivo = :nomeArquivo")
    , @NamedQuery(name = "ArquivoCartaoResposta.findByTipoArquivo", query = "SELECT a FROM ArquivoCartaoResposta a WHERE a.tipoArquivo = :tipoArquivo")
    , @NamedQuery(name = "ArquivoCartaoResposta.findByStatus", query = "SELECT a FROM ArquivoCartaoResposta a WHERE a.status = :status")})
public class ArquivoCartaoResposta implements Serializable {

    @Lob
    @Column(name = "file_arquivo")
    private byte[] fileArquivo;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipo_arquivo")
    private int idTipoArquivo;
    @Size(max = 200)
    @Column(name = "tiutlo")
    private String tiutlo;
    @Column(name = "data_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;
    @Size(max = 2147483647)
    @Column(name = "ext_arquivo")
    private String extArquivo;
    @Size(max = 2147483647)
    @Column(name = "nome_arquivo")
    private String nomeArquivo;
    @Size(max = 2147483647)
    @Column(name = "tipo_arquivo")
    private String tipoArquivo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @JoinColumn(name = "id_inscricao", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Inscricao idInscricao;

    public ArquivoCartaoResposta() {
    }

    public ArquivoCartaoResposta(Integer id) {
        this.id = id;
    }

    public ArquivoCartaoResposta(Integer id, int idTipoArquivo, int status) {
        this.id = id;
        this.idTipoArquivo = idTipoArquivo;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdTipoArquivo() {
        return idTipoArquivo;
    }

    public void setIdTipoArquivo(int idTipoArquivo) {
        this.idTipoArquivo = idTipoArquivo;
    }

    public String getTiutlo() {
        return tiutlo;
    }

    public void setTiutlo(String tiutlo) {
        this.tiutlo = tiutlo;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getExtArquivo() {
        return extArquivo;
    }

    public void setExtArquivo(String extArquivo) {
        this.extArquivo = extArquivo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public byte[] getFileArquivo() {
        return fileArquivo;
    }

    public void setFileArquivo(byte[] fileArquivo) {
        this.fileArquivo = fileArquivo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Inscricao getIdInscricao() {
        return idInscricao;
    }

    public void setIdInscricao(Inscricao idInscricao) {
        this.idInscricao = idInscricao;
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
        if (!(object instanceof ArquivoCartaoResposta)) {
            return false;
        }
        ArquivoCartaoResposta other = (ArquivoCartaoResposta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.appcpc.modelo.ArquivoCartaoResposta[ id=" + id + " ]";
    }

    
}
