/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.sisvest.controle;

import br.edu.uerr.sisvest.modelo.Candidato;
import br.edu.uerr.sisvest.modelo.Certame;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author fpcarlos
 */
@Stateless
public class CandidatoControle extends AbstractControle implements Serializable {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvar(Candidato entity) throws Exception {
        try {
            if (entity.getIdCandidato() != null && entity.getIdCandidato() > 0) {
                entityManager.merge(entity);
            } else {
                entityManager.persist(entity);
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public void remove(Candidato entity) throws Exception {
        try {
            Candidato aux = entityManager.find(Candidato.class, entity.getIdCandidato());
            entityManager.remove(aux);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public Candidato pegaCandidatoId(Integer id) throws Exception {
        try {
            Candidato aux = entityManager.find(Candidato.class, id);
            return aux;
        } catch (RuntimeException re) {
            throw new Exception(" Erro" + re.getMessage());
        } catch (Exception e) {
            throw new Exception(" Erro" + e.getMessage());
        }

    }

    public List<Candidato> findAll() throws Exception {
        try {
            List<Candidato> listaCandidato = new ArrayList<>();
            String sql = "select * from tb_candidato";
            listaCandidato = executaSqlNativo(sql, Candidato.class, entityManager);
            return listaCandidato;

        } catch (RuntimeException re) {
            throw new Exception(" Erro" + re.getMessage());
        } catch (Exception e) {
            throw new Exception(" Erro" + e.getMessage());
        }

    }

    public boolean login(String login, String senha) throws Exception{
        try {

            String sql = "select c from tb_candidato c where c.login='" + login + "' and c.sexo_candidato='" + senha + "' ";
            Query query = entityManager.createNativeQuery(sql, Certame.class);
            query.setParameter("login", login);
            query.setParameter("senha", senha);
            Candidato user;
            user = (Candidato) query.getSingleResult();
            if(user!=null)
                return true;
            else
                return false;            

         } catch (RuntimeException re) {
            throw new Exception(" Erro" + re.getMessage());
        } catch (Exception e) {
            throw new Exception(" Erro" + e.getMessage());
        }
    }

}
