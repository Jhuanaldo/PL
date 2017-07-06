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
public class If_statement extends Expresion {

    protected ArrayList<Expresion> listaExpresion;
    protected ArrayList<Expresion> listaExpresion2;
    protected Valor condicion;
    protected If_statement ifelsif;

    public If_statement(Valor condicion, ArrayList<Expresion> listaExpresion, ArrayList<Expresion> listaExpresion2) {
        this.listaExpresion = listaExpresion;
        this.listaExpresion2 = listaExpresion2;
        this.condicion = condicion;
    }

    public If_statement(Valor condicion, ArrayList<Expresion> listaExpresion, ArrayList<Expresion> listaExpresion2,
            If_statement ifelsif) {
        this(condicion, listaExpresion, listaExpresion2);
        this.ifelsif = ifelsif;
    }

    @Override
    public Object ejecutar() {
        Object r = "";
        Object aux = null;
        if (condicion instanceof Valor) {
            valor = new Valor(condicion.getValor());
        }

        TablaSimbolos.getTablaSimbolos().push();
        if (((Valor)valor).getBoolean()) {
            for (Expresion e : this.listaExpresion) {
                aux = e.ejecutar();
                r += aux == null || aux == "" ? "" : aux + "\n";

            }
        } else {
            if (ifelsif == null) {
                if (this.listaExpresion2 != null) {
                    for (Expresion e : this.listaExpresion2) {
                        aux = e.ejecutar();
                        r += aux == null || aux == "" ? "" : aux + "\n";
                    }
                }
            } else {
                aux = this.ifelsif.ejecutar();
                r += aux == null || aux == "" ? "" : aux + "\n";
            }
        }
        TablaSimbolos.getTablaSimbolos().pop();
        return r;
    }

}
