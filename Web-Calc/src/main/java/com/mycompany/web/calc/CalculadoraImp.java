/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.web.calc;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Anderson Souza
 */
@Stateless
@Remote
public class CalculadoraImp {
    
    public double multiplicar(int n1, int n2){
        return n1 * n2;
    }
    
    public double dividir(int n1, int n2){
        return n1 / n2;
    }
   
}
