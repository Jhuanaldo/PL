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
public class Unless_statement extends Expresion {

    private ArrayList<Expresion> listaExpresion;
    private Valor condicion;

    public Unless_statement(Valor condicion,ArrayList<Expresion> listaExpresion) {
        this.condicion = condicion;
        this.listaExpresion = listaExpresion;
    }

    @Override
    public Object ejecutar() {
        Object r = "";
        Object aux = null;
        while (!condicion.basico()) {
            condicion.ejecutar();
            condicion = (Valor) condicion.getValor();
        }
        if (!condicion.getBoolean()) {
            for (Expresion e : this.listaExpresion) {
                aux = e.ejecutar();
                r += aux == null || aux == "" ? "" : aux + "\n";

            }
        } 
        return r;
    }

}
