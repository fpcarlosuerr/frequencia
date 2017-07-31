/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.appteste.seguranca.controle;

import br.edu.uerr.appteste.controle.AbstractControle;
import br.edu.uerr.appteste.modelo.Pessoa;
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
public class UsuarioControle extends AbstractControle implements Serializable {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvar() {

    }

    public List<Pessoa> findAllUsuario(String s) throws Exception {
        try {
            List<Pessoa> listaUsuarios = new ArrayList<>();
            String sql = "select distinct * from pessoa where cpf= '" + s + "' limit 1";
            listaUsuarios = executaSqlNativo(sql, Pessoa.class, entityManager);
            return listaUsuarios;

        } catch (RuntimeException re) {
            throw new Exception(" Erro" + re.getMessage());
        } catch (Exception e) {
            throw new Exception(" Erro" + e.getMessage());
        }

    }

    

}
