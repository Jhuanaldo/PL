/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

import java.util.ArrayList;

/**
 *
 * @author ordenador
 */
public class Unless_statement extends If_statement {

    public Unless_statement(Valor condicion, ArrayList<Expresion> listaExpresion) {
        super(condicion, listaExpresion, null, null);
    }
    
        @Override
    public Object ejecutar() {
        Object r = "";
        Object aux = null;
        if (condicion instanceof Valor) {
            valor = new Valor(condicion.getValor());
        }
        if (!((Valor)valor).getBoolean()) {
            for (Expresion e : this.listaExpresion) {
                aux = e.ejecutar();
                r += aux == null || aux == "" ? "" : aux + "\n";

            }
        } 
        return r;
    }



}
