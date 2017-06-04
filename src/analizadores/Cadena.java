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
public class Cadena extends Expresion{

    private String contenido;

    public Cadena(String contenido) {
        this.contenido = contenido;
    }
    
    
    @Override
    public void ejecutar() {
        System.out.println(contenido);
    }
    
    
    
}
