/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uerr.appteste.seguranca.modelo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fpcarlos
 */
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String target = req.getParameter("targetPage");
        String user = req.getParameter("j_username");
        String pass = req.getParameter("j_password");

        String redirectUrl = "";

        if (target.equalsIgnoreCase("a")) {
            redirectUrl = "TheUrlWeWantToGoToForPageA";
        } else if (target.equalsIgnoreCase("b")) {
            redirectUrl = "TheUrlWeWantToGoToForPageB";
        } else {
            redirectUrl = "SomeDefaultPageJustInCaseSomethingHappens";
        }

        req.getSession().setAttribute("redirectUrl", redirectUrl);
        resp.sendRedirect("j_security_check?j_username=" + user + "&j_password=" + pass);
        return;
    }
}
