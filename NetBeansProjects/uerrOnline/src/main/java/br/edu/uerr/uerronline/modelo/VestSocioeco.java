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
@Table(name = "vest_socioeco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VestSocioeco.findAll", query = "SELECT v FROM VestSocioeco v")
    , @NamedQuery(name = "VestSocioeco.findById", query = "SELECT v FROM VestSocioeco v WHERE v.id = :id")
    , @NamedQuery(name = "VestSocioeco.findByIdCargo", query = "SELECT v FROM VestSocioeco v WHERE v.idCargo = :idCargo")
    , @NamedQuery(name = "VestSocioeco.findByIdCertame", query = "SELECT v FROM VestSocioeco v WHERE v.idCertame = :idCertame")
    , @NamedQuery(name = "VestSocioeco.findByCpfCan", query = "SELECT v FROM VestSocioeco v WHERE v.cpfCan = :cpfCan")
    , @NamedQuery(name = "VestSocioeco.findByIdTipocand", query = "SELECT v FROM VestSocioeco v WHERE v.idTipocand = :idTipocand")
    , @NamedQuery(name = "VestSocioeco.findByNboleto", query = "SELECT v FROM VestSocioeco v WHERE v.nboleto = :nboleto")
    , @NamedQuery(name = "VestSocioeco.findByItem1", query = "SELECT v FROM VestSocioeco v WHERE v.item1 = :item1")
    , @NamedQuery(name = "VestSocioeco.findByResposta1", query = "SELECT v FROM VestSocioeco v WHERE v.resposta1 = :resposta1")
    , @NamedQuery(name = "VestSocioeco.findByItem2", query = "SELECT v FROM VestSocioeco v WHERE v.item2 = :item2")
    , @NamedQuery(name = "VestSocioeco.findByResposta2", query = "SELECT v FROM VestSocioeco v WHERE v.resposta2 = :resposta2")
    , @NamedQuery(name = "VestSocioeco.findByItem3", query = "SELECT v FROM VestSocioeco v WHERE v.item3 = :item3")
    , @NamedQuery(name = "VestSocioeco.findByResposta3", query = "SELECT v FROM VestSocioeco v WHERE v.resposta3 = :resposta3")
    , @NamedQuery(name = "VestSocioeco.findByItem4", query = "SELECT v FROM VestSocioeco v WHERE v.item4 = :item4")
    , @NamedQuery(name = "VestSocioeco.findByResposta4", query = "SELECT v FROM VestSocioeco v WHERE v.resposta4 = :resposta4")
    , @NamedQuery(name = "VestSocioeco.findByItem5", query = "SELECT v FROM VestSocioeco v WHERE v.item5 = :item5")
    , @NamedQuery(name = "VestSocioeco.findByResposta5", query = "SELECT v FROM VestSocioeco v WHERE v.resposta5 = :resposta5")
    , @NamedQuery(name = "VestSocioeco.findByItem6", query = "SELECT v FROM VestSocioeco v WHERE v.item6 = :item6")
    , @NamedQuery(name = "VestSocioeco.findByResposta6", query = "SELECT v FROM VestSocioeco v WHERE v.resposta6 = :resposta6")
    , @NamedQuery(name = "VestSocioeco.findByItem7", query = "SELECT v FROM VestSocioeco v WHERE v.item7 = :item7")
    , @NamedQuery(name = "VestSocioeco.findByResposta7", query = "SELECT v FROM VestSocioeco v WHERE v.resposta7 = :resposta7")
    , @NamedQuery(name = "VestSocioeco.findByItem8", query = "SELECT v FROM VestSocioeco v WHERE v.item8 = :item8")
    , @NamedQuery(name = "VestSocioeco.findByResposta8", query = "SELECT v FROM VestSocioeco v WHERE v.resposta8 = :resposta8")
    , @NamedQuery(name = "VestSocioeco.findByItem9", query = "SELECT v FROM VestSocioeco v WHERE v.item9 = :item9")
    , @NamedQuery(name = "VestSocioeco.findByResposta9", query = "SELECT v FROM VestSocioeco v WHERE v.resposta9 = :resposta9")
    , @NamedQuery(name = "VestSocioeco.findByItem10", query = "SELECT v FROM VestSocioeco v WHERE v.item10 = :item10")
    , @NamedQuery(name = "VestSocioeco.findByResposta10", query = "SELECT v FROM VestSocioeco v WHERE v.resposta10 = :resposta10")
    , @NamedQuery(name = "VestSocioeco.findByItem11", query = "SELECT v FROM VestSocioeco v WHERE v.item11 = :item11")
    , @NamedQuery(name = "VestSocioeco.findByResposta11", query = "SELECT v FROM VestSocioeco v WHERE v.resposta11 = :resposta11")
    , @NamedQuery(name = "VestSocioeco.findByItem12", query = "SELECT v FROM VestSocioeco v WHERE v.item12 = :item12")
    , @NamedQuery(name = "VestSocioeco.findByResposta12", query = "SELECT v FROM VestSocioeco v WHERE v.resposta12 = :resposta12")
    , @NamedQuery(name = "VestSocioeco.findByItem13", query = "SELECT v FROM VestSocioeco v WHERE v.item13 = :item13")
    , @NamedQuery(name = "VestSocioeco.findByResposta13", query = "SELECT v FROM VestSocioeco v WHERE v.resposta13 = :resposta13")
    , @NamedQuery(name = "VestSocioeco.findByItem14", query = "SELECT v FROM VestSocioeco v WHERE v.item14 = :item14")
    , @NamedQuery(name = "VestSocioeco.findByResposta14", query = "SELECT v FROM VestSocioeco v WHERE v.resposta14 = :resposta14")
    , @NamedQuery(name = "VestSocioeco.findByItem15", query = "SELECT v FROM VestSocioeco v WHERE v.item15 = :item15")
    , @NamedQuery(name = "VestSocioeco.findByResposta15", query = "SELECT v FROM VestSocioeco v WHERE v.resposta15 = :resposta15")
    , @NamedQuery(name = "VestSocioeco.findByItem16", query = "SELECT v FROM VestSocioeco v WHERE v.item16 = :item16")
    , @NamedQuery(name = "VestSocioeco.findByResposta16", query = "SELECT v FROM VestSocioeco v WHERE v.resposta16 = :resposta16")
    , @NamedQuery(name = "VestSocioeco.findByItem17", query = "SELECT v FROM VestSocioeco v WHERE v.item17 = :item17")
    , @NamedQuery(name = "VestSocioeco.findByResposta17", query = "SELECT v FROM VestSocioeco v WHERE v.resposta17 = :resposta17")
    , @NamedQuery(name = "VestSocioeco.findByItem18", query = "SELECT v FROM VestSocioeco v WHERE v.item18 = :item18")
    , @NamedQuery(name = "VestSocioeco.findByResposta18", query = "SELECT v FROM VestSocioeco v WHERE v.resposta18 = :resposta18")
    , @NamedQuery(name = "VestSocioeco.findByItem19", query = "SELECT v FROM VestSocioeco v WHERE v.item19 = :item19")
    , @NamedQuery(name = "VestSocioeco.findByResposta19", query = "SELECT v FROM VestSocioeco v WHERE v.resposta19 = :resposta19")
    , @NamedQuery(name = "VestSocioeco.findByItem20", query = "SELECT v FROM VestSocioeco v WHERE v.item20 = :item20")
    , @NamedQuery(name = "VestSocioeco.findByResposta20", query = "SELECT v FROM VestSocioeco v WHERE v.resposta20 = :resposta20")
    , @NamedQuery(name = "VestSocioeco.findByItem21", query = "SELECT v FROM VestSocioeco v WHERE v.item21 = :item21")
    , @NamedQuery(name = "VestSocioeco.findByResposta21", query = "SELECT v FROM VestSocioeco v WHERE v.resposta21 = :resposta21")
    , @NamedQuery(name = "VestSocioeco.findByItem22", query = "SELECT v FROM VestSocioeco v WHERE v.item22 = :item22")
    , @NamedQuery(name = "VestSocioeco.findByResposta22", query = "SELECT v FROM VestSocioeco v WHERE v.resposta22 = :resposta22")
    , @NamedQuery(name = "VestSocioeco.findByItem23", query = "SELECT v FROM VestSocioeco v WHERE v.item23 = :item23")
    , @NamedQuery(name = "VestSocioeco.findByResposta23", query = "SELECT v FROM VestSocioeco v WHERE v.resposta23 = :resposta23")
    , @NamedQuery(name = "VestSocioeco.findByItem24", query = "SELECT v FROM VestSocioeco v WHERE v.item24 = :item24")
    , @NamedQuery(name = "VestSocioeco.findByResposta24", query = "SELECT v FROM VestSocioeco v WHERE v.resposta24 = :resposta24")
    , @NamedQuery(name = "VestSocioeco.findByItem25", query = "SELECT v FROM VestSocioeco v WHERE v.item25 = :item25")
    , @NamedQuery(name = "VestSocioeco.findByResposta25", query = "SELECT v FROM VestSocioeco v WHERE v.resposta25 = :resposta25")
    , @NamedQuery(name = "VestSocioeco.findByItem26", query = "SELECT v FROM VestSocioeco v WHERE v.item26 = :item26")
    , @NamedQuery(name = "VestSocioeco.findByResposta26", query = "SELECT v FROM VestSocioeco v WHERE v.resposta26 = :resposta26")
    , @NamedQuery(name = "VestSocioeco.findByItem27", query = "SELECT v FROM VestSocioeco v WHERE v.item27 = :item27")
    , @NamedQuery(name = "VestSocioeco.findByResposta27", query = "SELECT v FROM VestSocioeco v WHERE v.resposta27 = :resposta27")
    , @NamedQuery(name = "VestSocioeco.findByItem28", query = "SELECT v FROM VestSocioeco v WHERE v.item28 = :item28")
    , @NamedQuery(name = "VestSocioeco.findByResposta28", query = "SELECT v FROM VestSocioeco v WHERE v.resposta28 = :resposta28")
    , @NamedQuery(name = "VestSocioeco.findByItem29", query = "SELECT v FROM VestSocioeco v WHERE v.item29 = :item29")
    , @NamedQuery(name = "VestSocioeco.findByResposta29", query = "SELECT v FROM VestSocioeco v WHERE v.resposta29 = :resposta29")
    , @NamedQuery(name = "VestSocioeco.findByItem30", query = "SELECT v FROM VestSocioeco v WHERE v.item30 = :item30")
    , @NamedQuery(name = "VestSocioeco.findByResposta30", query = "SELECT v FROM VestSocioeco v WHERE v.resposta30 = :resposta30")
    , @NamedQuery(name = "VestSocioeco.findByItem31", query = "SELECT v FROM VestSocioeco v WHERE v.item31 = :item31")
    , @NamedQuery(name = "VestSocioeco.findByResposta31", query = "SELECT v FROM VestSocioeco v WHERE v.resposta31 = :resposta31")})
public class VestSocioeco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_cargo")
    private Integer idCargo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_certame")
    private int idCertame;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "cpf_can")
    private String cpfCan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipocand")
    private int idTipocand;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nboleto")
    private String nboleto;
    @Size(max = 6)
    @Column(name = "item1")
    private String item1;
    @Size(max = 6)
    @Column(name = "resposta1")
    private String resposta1;
    @Size(max = 6)
    @Column(name = "item2")
    private String item2;
    @Size(max = 6)
    @Column(name = "resposta2")
    private String resposta2;
    @Size(max = 6)
    @Column(name = "item3")
    private String item3;
    @Size(max = 6)
    @Column(name = "resposta3")
    private String resposta3;
    @Size(max = 6)
    @Column(name = "item4")
    private String item4;
    @Size(max = 6)
    @Column(name = "resposta4")
    private String resposta4;
    @Size(max = 6)
    @Column(name = "item5")
    private String item5;
    @Size(max = 6)
    @Column(name = "resposta5")
    private String resposta5;
    @Size(max = 6)
    @Column(name = "item6")
    private String item6;
    @Size(max = 6)
    @Column(name = "resposta6")
    private String resposta6;
    @Size(max = 6)
    @Column(name = "item7")
    private String item7;
    @Size(max = 6)
    @Column(name = "resposta7")
    private String resposta7;
    @Size(max = 6)
    @Column(name = "item8")
    private String item8;
    @Size(max = 6)
    @Column(name = "resposta8")
    private String resposta8;
    @Size(max = 6)
    @Column(name = "item9")
    private String item9;
    @Size(max = 6)
    @Column(name = "resposta9")
    private String resposta9;
    @Size(max = 6)
    @Column(name = "item10")
    private String item10;
    @Size(max = 6)
    @Column(name = "resposta10")
    private String resposta10;
    @Size(max = 6)
    @Column(name = "item11")
    private String item11;
    @Size(max = 6)
    @Column(name = "resposta11")
    private String resposta11;
    @Size(max = 6)
    @Column(name = "item12")
    private String item12;
    @Size(max = 6)
    @Column(name = "resposta12")
    private String resposta12;
    @Size(max = 6)
    @Column(name = "item13")
    private String item13;
    @Size(max = 6)
    @Column(name = "resposta13")
    private String resposta13;
    @Size(max = 6)
    @Column(name = "item14")
    private String item14;
    @Size(max = 6)
    @Column(name = "resposta14")
    private String resposta14;
    @Size(max = 6)
    @Column(name = "item15")
    private String item15;
    @Size(max = 6)
    @Column(name = "resposta15")
    private String resposta15;
    @Size(max = 6)
    @Column(name = "item16")
    private String item16;
    @Size(max = 6)
    @Column(name = "resposta16")
    private String resposta16;
    @Size(max = 6)
    @Column(name = "item17")
    private String item17;
    @Size(max = 6)
    @Column(name = "resposta17")
    private String resposta17;
    @Size(max = 6)
    @Column(name = "item18")
    private String item18;
    @Size(max = 6)
    @Column(name = "resposta18")
    private String resposta18;
    @Size(max = 6)
    @Column(name = "item19")
    private String item19;
    @Size(max = 6)
    @Column(name = "resposta19")
    private String resposta19;
    @Size(max = 6)
    @Column(name = "item20")
    private String item20;
    @Size(max = 6)
    @Column(name = "resposta20")
    private String resposta20;
    @Size(max = 6)
    @Column(name = "item21")
    private String item21;
    @Size(max = 6)
    @Column(name = "resposta21")
    private String resposta21;
    @Size(max = 6)
    @Column(name = "item22")
    private String item22;
    @Size(max = 6)
    @Column(name = "resposta22")
    private String resposta22;
    @Size(max = 6)
    @Column(name = "item23")
    private String item23;
    @Size(max = 6)
    @Column(name = "resposta23")
    private String resposta23;
    @Size(max = 6)
    @Column(name = "item24")
    private String item24;
    @Size(max = 6)
    @Column(name = "resposta24")
    private String resposta24;
    @Size(max = 6)
    @Column(name = "item25")
    private String item25;
    @Size(max = 6)
    @Column(name = "resposta25")
    private String resposta25;
    @Size(max = 6)
    @Column(name = "item26")
    private String item26;
    @Size(max = 6)
    @Column(name = "resposta26")
    private String resposta26;
    @Size(max = 6)
    @Column(name = "item27")
    private String item27;
    @Size(max = 6)
    @Column(name = "resposta27")
    private String resposta27;
    @Size(max = 6)
    @Column(name = "item28")
    private String item28;
    @Size(max = 6)
    @Column(name = "resposta28")
    private String resposta28;
    @Size(max = 6)
    @Column(name = "item29")
    private String item29;
    @Size(max = 6)
    @Column(name = "resposta29")
    private String resposta29;
    @Size(max = 6)
    @Column(name = "item30")
    private String item30;
    @Size(max = 6)
    @Column(name = "resposta30")
    private String resposta30;
    @Size(max = 6)
    @Column(name = "item31")
    private String item31;
    @Size(max = 6)
    @Column(name = "resposta31")
    private String resposta31;

    public VestSocioeco() {
    }

    public VestSocioeco(Integer id) {
        this.id = id;
    }

    public VestSocioeco(Integer id, int idCertame, String cpfCan, int idTipocand, String nboleto) {
        this.id = id;
        this.idCertame = idCertame;
        this.cpfCan = cpfCan;
        this.idTipocand = idTipocand;
        this.nboleto = nboleto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdCertame() {
        return idCertame;
    }

    public void setIdCertame(int idCertame) {
        this.idCertame = idCertame;
    }

    public String getCpfCan() {
        return cpfCan;
    }

    public void setCpfCan(String cpfCan) {
        this.cpfCan = cpfCan;
    }

    public int getIdTipocand() {
        return idTipocand;
    }

    public void setIdTipocand(int idTipocand) {
        this.idTipocand = idTipocand;
    }

    public String getNboleto() {
        return nboleto;
    }

    public void setNboleto(String nboleto) {
        this.nboleto = nboleto;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getResposta1() {
        return resposta1;
    }

    public void setResposta1(String resposta1) {
        this.resposta1 = resposta1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public String getResposta2() {
        return resposta2;
    }

    public void setResposta2(String resposta2) {
        this.resposta2 = resposta2;
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3;
    }

    public String getResposta3() {
        return resposta3;
    }

    public void setResposta3(String resposta3) {
        this.resposta3 = resposta3;
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4;
    }

    public String getResposta4() {
        return resposta4;
    }

    public void setResposta4(String resposta4) {
        this.resposta4 = resposta4;
    }

    public String getItem5() {
        return item5;
    }

    public void setItem5(String item5) {
        this.item5 = item5;
    }

    public String getResposta5() {
        return resposta5;
    }

    public void setResposta5(String resposta5) {
        this.resposta5 = resposta5;
    }

    public String getItem6() {
        return item6;
    }

    public void setItem6(String item6) {
        this.item6 = item6;
    }

    public String getResposta6() {
        return resposta6;
    }

    public void setResposta6(String resposta6) {
        this.resposta6 = resposta6;
    }

    public String getItem7() {
        return item7;
    }

    public void setItem7(String item7) {
        this.item7 = item7;
    }

    public String getResposta7() {
        return resposta7;
    }

    public void setResposta7(String resposta7) {
        this.resposta7 = resposta7;
    }

    public String getItem8() {
        return item8;
    }

    public void setItem8(String item8) {
        this.item8 = item8;
    }

    public String getResposta8() {
        return resposta8;
    }

    public void setResposta8(String resposta8) {
        this.resposta8 = resposta8;
    }

    public String getItem9() {
        return item9;
    }

    public void setItem9(String item9) {
        this.item9 = item9;
    }

    public String getResposta9() {
        return resposta9;
    }

    public void setResposta9(String resposta9) {
        this.resposta9 = resposta9;
    }

    public String getItem10() {
        return item10;
    }

    public void setItem10(String item10) {
        this.item10 = item10;
    }

    public String getResposta10() {
        return resposta10;
    }

    public void setResposta10(String resposta10) {
        this.resposta10 = resposta10;
    }

    public String getItem11() {
        return item11;
    }

    public void setItem11(String item11) {
        this.item11 = item11;
    }

    public String getResposta11() {
        return resposta11;
    }

    public void setResposta11(String resposta11) {
        this.resposta11 = resposta11;
    }

    public String getItem12() {
        return item12;
    }

    public void setItem12(String item12) {
        this.item12 = item12;
    }

    public String getResposta12() {
        return resposta12;
    }

    public void setResposta12(String resposta12) {
        this.resposta12 = resposta12;
    }

    public String getItem13() {
        return item13;
    }

    public void setItem13(String item13) {
        this.item13 = item13;
    }

    public String getResposta13() {
        return resposta13;
    }

    public void setResposta13(String resposta13) {
        this.resposta13 = resposta13;
    }

    public String getItem14() {
        return item14;
    }

    public void setItem14(String item14) {
        this.item14 = item14;
    }

    public String getResposta14() {
        return resposta14;
    }

    public void setResposta14(String resposta14) {
        this.resposta14 = resposta14;
    }

    public String getItem15() {
        return item15;
    }

    public void setItem15(String item15) {
        this.item15 = item15;
    }

    public String getResposta15() {
        return resposta15;
    }

    public void setResposta15(String resposta15) {
        this.resposta15 = resposta15;
    }

    public String getItem16() {
        return item16;
    }

    public void setItem16(String item16) {
        this.item16 = item16;
    }

    public String getResposta16() {
        return resposta16;
    }

    public void setResposta16(String resposta16) {
        this.resposta16 = resposta16;
    }

    public String getItem17() {
        return item17;
    }

    public void setItem17(String item17) {
        this.item17 = item17;
    }

    public String getResposta17() {
        return resposta17;
    }

    public void setResposta17(String resposta17) {
        this.resposta17 = resposta17;
    }

    public String getItem18() {
        return item18;
    }

    public void setItem18(String item18) {
        this.item18 = item18;
    }

    public String getResposta18() {
        return resposta18;
    }

    public void setResposta18(String resposta18) {
        this.resposta18 = resposta18;
    }

    public String getItem19() {
        return item19;
    }

    public void setItem19(String item19) {
        this.item19 = item19;
    }

    public String getResposta19() {
        return resposta19;
    }

    public void setResposta19(String resposta19) {
        this.resposta19 = resposta19;
    }

    public String getItem20() {
        return item20;
    }

    public void setItem20(String item20) {
        this.item20 = item20;
    }

    public String getResposta20() {
        return resposta20;
    }

    public void setResposta20(String resposta20) {
        this.resposta20 = resposta20;
    }

    public String getItem21() {
        return item21;
    }

    public void setItem21(String item21) {
        this.item21 = item21;
    }

    public String getResposta21() {
        return resposta21;
    }

    public void setResposta21(String resposta21) {
        this.resposta21 = resposta21;
    }

    public String getItem22() {
        return item22;
    }

    public void setItem22(String item22) {
        this.item22 = item22;
    }

    public String getResposta22() {
        return resposta22;
    }

    public void setResposta22(String resposta22) {
        this.resposta22 = resposta22;
    }

    public String getItem23() {
        return item23;
    }

    public void setItem23(String item23) {
        this.item23 = item23;
    }

    public String getResposta23() {
        return resposta23;
    }

    public void setResposta23(String resposta23) {
        this.resposta23 = resposta23;
    }

    public String getItem24() {
        return item24;
    }

    public void setItem24(String item24) {
        this.item24 = item24;
    }

    public String getResposta24() {
        return resposta24;
    }

    public void setResposta24(String resposta24) {
        this.resposta24 = resposta24;
    }

    public String getItem25() {
        return item25;
    }

    public void setItem25(String item25) {
        this.item25 = item25;
    }

    public String getResposta25() {
        return resposta25;
    }

    public void setResposta25(String resposta25) {
        this.resposta25 = resposta25;
    }

    public String getItem26() {
        return item26;
    }

    public void setItem26(String item26) {
        this.item26 = item26;
    }

    public String getResposta26() {
        return resposta26;
    }

    public void setResposta26(String resposta26) {
        this.resposta26 = resposta26;
    }

    public String getItem27() {
        return item27;
    }

    public void setItem27(String item27) {
        this.item27 = item27;
    }

    public String getResposta27() {
        return resposta27;
    }

    public void setResposta27(String resposta27) {
        this.resposta27 = resposta27;
    }

    public String getItem28() {
        return item28;
    }

    public void setItem28(String item28) {
        this.item28 = item28;
    }

    public String getResposta28() {
        return resposta28;
    }

    public void setResposta28(String resposta28) {
        this.resposta28 = resposta28;
    }

    public String getItem29() {
        return item29;
    }

    public void setItem29(String item29) {
        this.item29 = item29;
    }

    public String getResposta29() {
        return resposta29;
    }

    public void setResposta29(String resposta29) {
        this.resposta29 = resposta29;
    }

    public String getItem30() {
        return item30;
    }

    public void setItem30(String item30) {
        this.item30 = item30;
    }

    public String getResposta30() {
        return resposta30;
    }

    public void setResposta30(String resposta30) {
        this.resposta30 = resposta30;
    }

    public String getItem31() {
        return item31;
    }

    public void setItem31(String item31) {
        this.item31 = item31;
    }

    public String getResposta31() {
        return resposta31;
    }

    public void setResposta31(String resposta31) {
        this.resposta31 = resposta31;
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
        if (!(object instanceof VestSocioeco)) {
            return false;
        }
        VestSocioeco other = (VestSocioeco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uerr.uerronline.modelo.VestSocioeco[ id=" + id + " ]";
    }
    
}
