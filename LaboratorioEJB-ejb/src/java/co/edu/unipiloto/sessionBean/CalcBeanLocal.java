/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBean;

import javax.ejb.Local;

/**
 *
 * @author mateo
 */
@Local
public interface CalcBeanLocal {

    Integer sumar(int x, int y);

    Integer restar(int x, int y);

    Integer multiplicar(int x, int y);

    Integer dividir(int x, int y);

    Integer modulo(int x, int y);

    Double elevar(int x);

}
