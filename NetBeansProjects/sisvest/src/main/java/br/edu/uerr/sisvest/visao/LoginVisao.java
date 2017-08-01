/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.sisvest.visao;

import br.edu.uerr.sisvest.controle.CandidatoControle;
import br.edu.uerr.sisvest.modelo.Candidato;
import br.edu.uerr.sisvest.util.SessaoUtil;
import java.io.Serializable;
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

    private Candidato candidato;
    
    private String senha;
    private String message, login;

    public String loginProject(String login, String senha) throws Exception {
        
        boolean result = candidatoControle.login(login, senha);
        
        if (result) {
            // get Http Session and store username
            HttpSession session = SessaoUtil.getSession();
            session.setAttribute("login", login);

            return "home";
        } else {

            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Invalid Login!",
                            "Please Try Again!"));

            // invalidate session, and redirect to other pages
            //message = "Invalid Login. Please Try Again!";
            return "login";
        }
    }

    public String logout() {
        HttpSession session = SessaoUtil.getSession();
        session.invalidate();
        return "login";
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    

}
