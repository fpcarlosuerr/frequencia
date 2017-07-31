/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.appteste.seguranca.visao;

import br.edu.uerr.appteste.controle.PessoaControle;
import br.edu.uerr.appteste.modelo.Pessoa;
import br.edu.uerr.appteste.visao.AbstractVisao;
import java.io.Serializable;
import java.security.Principal;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author fpcarlos
 */
@Named
@SessionScoped
public class UsuarioVisao extends AbstractVisao implements Serializable {
    
    @EJB
    private PessoaControle usuarioControle;
    
    private Pessoa usuario;
    
    
    

    public String logout() {

        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();

        try {
            request.logout();
        } catch (Exception e) {
        }
        return "/index.xhtml";
    }
    
    public String pegaUsuarioLogado(){
        try {
            String aux = remoteUser();
            //System.out.println(aux);    
            //usuario = usuarioControle.pegaPessoaPeloCpf(aux);
            //System.out.println(usuario.getNome());
            usuario = new Pessoa();
            usuario = usuarioControle.pegaPessoaPeloCpf(aux);
            aux = usuario.getNome();
            //System.out.println("Usuario Logado:"+aux);
            return aux;
        
        } catch (Exception e) {
            return null;
        }
        
        
    }

    public String remoteUser() {

        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();

        try {
            
            return request.getRemoteUser();
        } catch (Exception e) {
            return null;
        }

    }
public String getMostraUser() {
        String aux1 = remoteUser();
        Principal aux2 = (Principal) FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal();

        if (remoteUser() != null) {

            return FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal().getName();
        }
        return null;
    }
    
    //Gets e Sets

    public Pessoa getUsuario() {        
        return usuario;
    }

    public void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
    }
    
    
    
}
