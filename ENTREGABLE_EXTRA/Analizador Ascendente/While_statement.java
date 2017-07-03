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
public class While_statement extends Expresion {

    private ArrayList<Expresion> listaExpresion;
    private Valor condicion;

    public While_statement(Valor condicion,ArrayList<Expresion> listaExpresion) {
        this.listaExpresion = listaExpresion;
        this.condicion = condicion;
    }
    
     @Override
    public Object ejecutar() {
        Object r = "";
        Object aux = null;
        condicion.ejecutar();
        Boolean b=condicion.getBoolean();
        while (b) {
            for (Expresion e : this.listaExpresion) {
                aux = e.ejecutar();
                r += aux == null || aux == "" ? "" : aux + "\n";
            }
            condicion.ejecutar();
            b=condicion.getBoolean();
        } 
        return r;
    }
    
    

}
