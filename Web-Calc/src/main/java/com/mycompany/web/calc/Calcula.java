package com.mycompany.web.calc;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Souza
 */
public class Calcula extends HttpServlet {
    
    private CalculadoraImp calculadora;
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        
        int n1 = Integer.parseInt(request.getParameter("valor1"));
        int n2 = Integer.parseInt(request.getParameter("valor2"));
        
        double valor1 = calculadora.multiplicar(n1, n2);
        double valor2 = calculadora.dividir(n1, n2);
        request.setAttribute("valor1", valor1);
        request.setAttribute("valor2", valor2);
        
        request.getRequestDispatcher("showResult.jsp").forward(request, resp);
        
    }
    
    

}
