/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.uerronline.controle;

import br.edu.uerr.uerronline.modelo.Cadastro;
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
public class CadastroControle extends AbstractControle implements Serializable {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvar(Cadastro entity) throws Exception {
        try {
            if (entity.getIdCadastro() != null || entity.getIdCadastro() > 0) {

                entityManager.merge(entity);
            } else {
                entityManager.persist(entity);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<Cadastro> pegaCadastroCandidato(String cpf) throws Exception {
        try {
            List<Cadastro> listaCadastro = new ArrayList<>();
            String sql = "SELECT a.* FROM tb_cadastro a, tb_candidato b\n" +
                         "where  a.id_candidato = b.id_candidato and \n" +
                         " b.cpf_candidato="+ cpf +" ";
            listaCadastro = executaSqlNativo(sql, Cadastro.class, entityManager);
            return listaCadastro;
            
        } catch (RuntimeException re) {
            throw new Exception(" Erro Certames inscritos não Localizado: " + re.getMessage());
        } catch (Exception e) {
            throw new Exception(" Erro" + e.getMessage());
        }
    }

}
