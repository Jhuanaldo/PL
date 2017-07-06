/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

import analizadores.Function_definition.Funcion;
import java.util.ArrayList;

/**
 *
 * @author ordenador
 */
public class Function_call extends Valor{
    
    protected ArrayList<Lvalue> argumentos;
    protected Lvalue id;
    


    public Function_call(String nombre,ArrayList<Lvalue> fc) {
        super(null);
        this.argumentos=fc;
        this.id=new Lvalue(nombre);
    }
    
    @Override
    public Object ejecutar(){
        Assignment a;
        
        for(Lvalue l:argumentos){
            a=new Assignment(l.getId(),l);
            a.ejecutar();
        }
        Funcion fd=(Funcion) id.ejecutar();
        Object o=fd.ejecutar();
        return o;
    }
    
    
}
