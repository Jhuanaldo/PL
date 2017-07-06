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
public class Function_definition extends Expresion {

    protected class Funcion extends Expresion {

        protected ArrayList<Expresion> expresiones;
        protected ArrayList<Lvalue> parametros;

        public Funcion(ArrayList<Expresion> expresiones,ArrayList<Lvalue> parametros) {
            this.expresiones = expresiones;
            this.parametros=parametros;
        }

        @Override
        public Object ejecutar() {
            String r="";
            for (Expresion e : this.expresiones) {
                if (e != null) {
                    Object o = e.ejecutar();
                    if (o != null) {
                       r+=o+"\n";
                    }
                }
            }
            this.valor=r;
            return r;
        }

    }
    protected ArrayList<Expresion> listaExpresion;
    protected ArrayList<Lvalue> parametros;
    protected String id;

    public Function_definition(ArrayList<Expresion> listaExpresion, ArrayList<Lvalue> valores, String id) {
        this.listaExpresion = listaExpresion;
        this.parametros = valores;
        this.id = id;
    }

    public ArrayList<Expresion> getListaExpresion() {
        return listaExpresion;
    }

    public void setListaExpresion(ArrayList<Expresion> listaExpresion) {
        this.listaExpresion = listaExpresion;
    }

    @Override
    public Object ejecutar() {
        Assignment a=new Assignment(this.id,new Funcion(this.listaExpresion,this.parametros));
        a.ejecutar();
        return null;
    }

}
