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
public class Lvalue  extends Valor {
    
    protected String id;
    
    public Lvalue(String id){
        super(null);
        this.id=id;
    }
    
    @Override
    public Object ejecutar(){

        Valor a=this.getValor();
        if(a !=null){
            this.valor=((Valor)a).getValor();
        }
        return this.valor;

    }
    
    @Override
    public Valor getValor(){    
        this.valor=(Valor) TablaSimbolos.getTablaSimbolos().get(id);
        return (Valor) this.valor;
    }
    
    
    
    
}
