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
public class Numero<Tipo> extends Expresion {
    private Tipo valor;

    public Numero(Tipo valor) {
        this.valor = valor;
    }
     
    

    @Override
    public void ejecutar() {
        System.out.println(valor);
    }

    
}
