/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.uerronline.visao;

import br.edu.uerr.uerronline.controle.CandidatoControle;
import br.edu.uerr.uerronline.modelo.Candidato;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author fpcarlos
 */
@Named
@SessionScoped
public class LoginVisao extends AbstractVisao implements Serializable{
    
    @EJB
    private CandidatoControle candidatoControle;
    
    private Candidato candidato;
    
    public LoginVisao(){
        super();
    }
    
    public String abreLogin(){
        try {
            
             return redirect("/login.xhtml");
        } catch (Exception e) {
            //showFacesMessage(e.getMessage(), 4);
            return null;
        }
    }
    
    //Gets e Sets

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    
    
    
}
