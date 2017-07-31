/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.appteste.seguranca.visao;

import br.edu.uerr.appteste.controle.PessoaControle;
import br.edu.uerr.appteste.modelo.Pessoa;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author fpcarlos
 */
public class UITeste {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException, Exception {
//        String password = user.getPassword();
//user.setPassword(Util.createPasswordHash("MD5", Util.BASE64_ENCODING, null, null,  password));
        
        

        System.out.println(DatatypeConverter.printHexBinary(
                MessageDigest.getInstance("MD5").digest("127748".getBytes("UTF-8"))));

        

    }
}
