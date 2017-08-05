/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.uerronline.visao;

import br.edu.uerr.uerronline.controle.CandidatoControle;
import br.edu.uerr.uerronline.controle.CertameControle;
import br.edu.uerr.uerronline.modelo.Candidato;
import br.edu.uerr.uerronline.modelo.Certame;
import br.edu.uerr.uerronline.util.UtilSession;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fpcarlos
 */
@Named
@SessionScoped
public class LoginVisao extends AbstractVisao implements Serializable {

    @EJB
    private CandidatoControle candidatoControle;

    @EJB
    private CertameControle certameControle;

    private Candidato candidato;

    private String usuario = "";
    private String senha = "";

    private List<Certame> listaCertame = new ArrayList<>();

    public LoginVisao() {
        super();
    }

    public String abreLogin() {
        try {

            return redirect("/login1.xhtml");
        } catch (Exception e) {
            //showFacesMessage(e.getMessage(), 4);
            return null;
        }
    }

    public String testaLogin() {

        System.out.println("Entrando com ologin");

        try {
            candidato = candidatoControle.pegaCandidatoPeloCpfSenha(usuario, senha);
            if (candidato != null) {
                HttpSession session = UtilSession.getSession();
                session.setAttribute("username", usuario);
                return redirect("/acompanhamento/index.xhtml");
            }
            FacesContext ctx = FacesContext.getCurrentInstance();
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário inválido", "Usuário inválido");
            ctx.addMessage(null, msg);
            //return "";  
            return redirect("/index.xhtml");
        } catch (Exception e) {
            showFacesMessage(e.getMessage(), 4);
            return null;
        }
    }

    public String abreCertamesInscritos() {
        try {
            listaCertame = new ArrayList<>();
            HttpSession session = UtilSession.getSession();
            //session.setAttribute("username", usuario);
            String aux = session.getAttribute("username").toString();
            listaCertame = certameControle.pegaCertamesCandidato(aux);

            return redirect("/acompanhamento/certames/listaCertamesInscritos.xhtml");

        } catch (Exception e) {
            showFacesMessage(e.getMessage(), 4);
            return null;
        }
    }

    public String abreCadastro() {
        try {
            HttpSession session = UtilSession.getSession();
            System.out.println(session.getAttribute("username"));
            candidato = new Candidato();
            candidato = candidatoControle.pegaCandidatoPeloCpf(session.getAttribute("username").toString());
            return redirect("/acompanhamento/candidato/formCandidato.xhtml");
        } catch (Exception e) {
            showFacesMessage(e.getMessage(), 4);
            return null;
        }
    }

    public String logout() {
        HttpSession session = UtilSession.getSession();
        session.invalidate();
        return redirect("/index.xhtml");
    }

    //Gets e Sets
    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Certame> getListaCertame() {
        return listaCertame;
    }

    public void setListaCertame(List<Certame> listaCertame) {
        this.listaCertame = listaCertame;
    }

}
