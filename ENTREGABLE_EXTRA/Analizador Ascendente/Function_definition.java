/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author ordenador
 */
public class Function_definition extends Expresion{
    private ArrayList<Expresion> listaExpresion;
    private ArrayList<Lvalue> valores;

    public Function_definition(ArrayList<Expresion> listaExpresion, ArrayList<Lvalue> valores) {
        this.listaExpresion = listaExpresion;
    }

    
    
    
}
