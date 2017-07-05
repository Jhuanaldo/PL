/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

/**
 *
 * @author ordenador
 */
public class Expresion {

    protected Object valor;

    public Expresion() {
    }

    public Object ejecutar() {
        Object r = null;
        if (valor != null) {
            r = valor;
        }
        return r;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

}
