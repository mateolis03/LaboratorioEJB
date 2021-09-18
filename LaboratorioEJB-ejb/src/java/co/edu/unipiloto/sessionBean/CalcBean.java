package co.edu.unipiloto.sessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author mateo
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer sumar(int x, int y) {
        return x + y;
    }

    @Override
    public Integer restar(int x, int y) {
        return x - y;
    }

    @Override
    public Integer multiplicar(int x, int y) {
        return x * y;
    }

    @Override
    public Integer dividir(int x, int y) {
        return x / y;
    }

    @Override
    public Integer modulo(int x, int y) {
        return x % y;
    }

    @Override
    public Double elevar(int x) {
        return Math.pow(x, 2);
    }

}
