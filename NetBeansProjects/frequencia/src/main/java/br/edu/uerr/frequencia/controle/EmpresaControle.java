/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.frequencia.controle;

import br.edu.uerr.frequencia.modelo.Empresa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fpcarlos
 */
@Stateless
public class EmpresaControle extends AbstractControle implements Serializable{
    
    @PersistenceContext(name = "frequenciaPU")
    private EntityManager entityManager;
    
    public void salvar(Empresa entity){
        try {
            if(entity.getId()!=null && entity.getId()>0){
                entityManager.merge(entity);
            }else{
                entityManager.persist(entity);
            }
        } catch (Exception e) {
        }
        
    }
        
    public void remover(Empresa entity){        
        try {
            Empresa aux = entityManager.find(Empresa.class, entity.getId());
            entityManager.remove(aux);
            
        } catch (Exception e) {
        }
        
    }
    
    public List<Empresa> findAll(){
        try {
            String sql = "select * from empresa";
            List<Empresa> listEmpresa = new ArrayList<>();
            listEmpresa = executaSqlNativo(sql, Empresa.class, entityManager);
            return listEmpresa;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }        
    }
    
    public Empresa pegaEmpresaPeloid(Integer codigo){
        try {
            Empresa aux = entityManager.find(Empresa.class, codigo);
            return aux;            
        } catch (Exception e) {
            return null;
        }
    }
    
}
