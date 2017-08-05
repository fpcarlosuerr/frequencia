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
@Table(name = "tb_historico_vest")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoricoVest.findAll", query = "SELECT h FROM HistoricoVest h")
    , @NamedQuery(name = "HistoricoVest.findById", query = "SELECT h FROM HistoricoVest h WHERE h.id = :id")
    , @NamedQuery(name = "HistoricoVest.findByIdCertame", query = "SELECT h FROM HistoricoVest h WHERE h.idCertame = :idCertame")
    , @NamedQuery(name = "HistoricoVest.findByIdCandidato", query = "SELECT h FROM HistoricoVest h WHERE h.idCandidato = :idCandidato")
    , @NamedQuery(name = "HistoricoVest.findByNboleto", query = "SELECT h FROM HistoricoVest h WHERE h.nboleto = :nboleto")
    , @NamedQuery(name = "HistoricoVest.findByLocalcurso", query = "SELECT h FROM HistoricoVest h WHERE h.localcurso = :localcurso")
    , @NamedQuery(name = "HistoricoVest.findByTipoano", query = "SELECT h FROM HistoricoVest h WHERE h.tipoano = :tipoano")
    , @NamedQuery(name = "HistoricoVest.findByPortugues", query = "SELECT h FROM HistoricoVest h WHERE h.portugues = :portugues")
    , @NamedQuery(name = "HistoricoVest.findByLingua", query = "SELECT h FROM HistoricoVest h WHERE h.lingua = :lingua")
    , @NamedQuery(name = "HistoricoVest.findByMatematica", query = "SELECT h FROM HistoricoVest h WHERE h.matematica = :matematica")
    , @NamedQuery(name = "HistoricoVest.findByQuimica", query = "SELECT h FROM HistoricoVest h WHERE h.quimica = :quimica")
    , @NamedQuery(name = "HistoricoVest.findByFisica", query = "SELECT h FROM HistoricoVest h WHERE h.fisica = :fisica")
    , @NamedQuery(name = "HistoricoVest.findByBiologia", query = "SELECT h FROM HistoricoVest h WHERE h.biologia = :biologia")
    , @NamedQuery(name = "HistoricoVest.findByHistoria", query = "SELECT h FROM HistoricoVest h WHERE h.historia = :historia")
    , @NamedQuery(name = "HistoricoVest.findByGeografia", query = "SELECT h FROM HistoricoVest h WHERE h.geografia = :geografia")
    , @NamedQuery(name = "HistoricoVest.findByFilosofia", query = "SELECT h FROM HistoricoVest h WHERE h.filosofia = :filosofia")
    , @NamedQuery(name = "HistoricoVest.findBySociologia", query = "SELECT h FROM HistoricoVest h WHERE h.sociologia = :sociologia")
    , @NamedQuery(name = "HistoricoVest.findByAno", query = "SELECT h FROM HistoricoVest h WHERE h.ano = :ano")
    , @NamedQuery(name = "HistoricoVest.findByDatacad", query = "SELECT h FROM HistoricoVest h WHERE h.datacad = :datacad")
    , @NamedQuery(name = "HistoricoVest.findByDataalt", query = "SELECT h FROM HistoricoVest h WHERE h.dataalt = :dataalt")
    , @NamedQuery(name = "HistoricoVest.findByIdCertameOld", query = "SELECT h FROM HistoricoVest h WHERE h.idCertameOld = :idCertameOld")})
public class HistoricoVest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_certame")
    private Integer idCertame;
    @Column(name = "id_candidato")
    private Integer idCandidato;
    @Size(max = 50)
    @Column(name = "nboleto")
    private String nboleto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "localcurso")
    private String localcurso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "tipoano")
    private String tipoano;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "portugues")
    private String portugues;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "lingua")
    private String lingua;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "matematica")
    private String matematica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "quimica")
    private String quimica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "fisica")
    private String fisica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "biologia")
    private String biologia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "historia")
    private String historia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "geografia")
    private String geografia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "filosofia")
    private String filosofia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "sociologia")
    private String sociologia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "ano")
    private String ano;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datacad")
    @Temporal(TemporalType.DATE)
    private Date datacad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataalt")
    @Temporal(TemporalType.DATE)
    private Date dataalt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_certame_old")
    private int idCertameOld;

    public HistoricoVest() {
    }

    public HistoricoVest(Integer id) {
        this.id = id;
    }

    public HistoricoVest(Integer id, String localcurso, String tipoano, String portugues, String lingua, String matematica, String quimica, String fisica, String biologia, String historia, String geografia, String filosofia, String sociologia, String ano, Date datacad, Date dataalt, int idCertameOld) {
        this.id = id;
        this.localcurso = localcurso;
        this.tipoano = tipoano;
        this.portugues = portugues;
        this.lingua = lingua;
        this.matematica = matematica;
        this.quimica = quimica;
        this.fisica = fisica;
        this.biologia = biologia;
        this.historia = historia;
        this.geografia = geografia;
        this.filosofia = filosofia;
        this.sociologia = sociologia;
        this.ano = ano;
        this.datacad = datacad;
        this.dataalt = dataalt;
        this.idCertameOld = idCertameOld;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(Integer idCertame) {
        this.idCertame = idCertame;
    }

    public Integer getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Integer idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getNboleto() {
        return nboleto;
    }

    public void setNboleto(String nboleto) {
        this.nboleto = nboleto;
    }

    public String getLocalcurso() {
        return localcurso;
    }

    public void setLocalcurso(String localcurso) {
        this.localcurso = localcurso;
    }

    public String getTipoano() {
        return tipoano;
    }

    public void setTipoano(String tipoano) {
        this.tipoano = tipoano;
    }

    public String getPortugues() {
        return portugues;
    }

    public void setPortugues(String portugues) {
        this.portugues = portugues;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public String getMatematica() {
        return matematica;
    }

    public void setMatematica(String matematica) {
        this.matematica = matematica;
    }

    public String getQuimica() {
        return quimica;
    }

    public void setQuimica(String quimica) {
        this.quimica = quimica;
    }

    public String getFisica() {
        return fisica;
    }

    public void setFisica(String fisica) {
        this.fisica = fisica;
    }

    public String getBiologia() {
        return biologia;
    }

    public void setBiologia(String biologia) {
        this.biologia = biologia;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getGeografia() {
        return geografia;
    }

    public void setGeografia(String geografia) {
        this.geografia = geografia;
    }

    public String getFilosofia() {
        return filosofia;
    }

    public void setFilosofia(String filosofia) {
        this.filosofia = filosofia;
    }

    public String getSociologia() {
        return sociologia;
    }

    public void setSociologia(String sociologia) {
        this.sociologia = sociologia;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Date getDatacad() {
        return datacad;
    }

    public void setDatacad(Date datacad) {
        this.datacad = datacad;
    }

    public Date getDataalt() {
        return dataalt;
    }

    public void setDataalt(Date dataalt) {
        this.dataalt = dataalt;
    }

    public int getIdCertameOld() {
        return idCertameOld;
    }

    public void setIdCertameOld(int idCertameOld) {
        this.idCertameOld = idCertameOld;
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
        if (!(object instanceof HistoricoVest)) {
            return false;
        }
        HistoricoVest other = (HistoricoVest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.uerronline.modelo.HistoricoVest[ id=" + id + " ]";
    }
    
}
