/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.uerronline.controle;

import br.edu.uerr.uerronline.modelo.Candidato;
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

    public Candidato pegaCandidatoPeloCpf(String cpf) throws Exception {
        try {
            String sql = "select * from tb_candidato where cpf_candidato='" + cpf + "'";
            Query query = entityManager.createNativeQuery(sql, Candidato.class);
            query.setParameter("cpf", cpf);

            return (Candidato) query.getSingleResult();
        } catch (RuntimeException re) {
            throw new Exception(" Erro" + re.getMessage());
        } catch (Exception e) {
            throw new Exception(" Erro" + e.getMessage());
        }
    }

    public Candidato pegaCandidatoPeloCpfSenha(String cpf, String senha) throws Exception {
        try {
            String sql = "select * from tb_candidato where cpf_candidato='" + cpf + "' and senha_candidato=md5('" + senha + "')";
            System.out.println(sql);
            Query query = entityManager.createNativeQuery(sql, Candidato.class);
            query.setParameter("cpf", cpf);
            query.setParameter("senha", senha);
            Object result = query.getSingleResult();
            if (result == null) {
                return null;
            }
            return (Candidato) result;
            //return (Candidato) query.getSingleResult();
        } catch (RuntimeException re) {
            throw new Exception(" Erro Candidato não Localizado: " + re.getMessage());
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

    public List<Candidato> findAllSexo(String s) throws Exception {
        try {
            List<Candidato> listaCandidatoSexo = new ArrayList<>();
            String sql = "select * from tb_candiato where sexo= '" + s + "'";
            listaCandidatoSexo = executaSqlNativo(sql, Candidato.class, entityManager);
            return listaCandidatoSexo;

        } catch (RuntimeException re) {
            throw new Exception(" Erro" + re.getMessage());
        } catch (Exception e) {
            throw new Exception(" Erro" + e.getMessage());
        }

    }

}
