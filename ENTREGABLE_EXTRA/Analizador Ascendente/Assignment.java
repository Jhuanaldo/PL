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
public class Assignment extends Valor{

    protected String id;

    public Assignment(String id, Object valor) {
        super(valor);
        this.id = id;
    }

   
    @Override
    public Object ejecutar() {

        if(this.valor.getClass().getName()!="analizadores.Expresion"&&
                                                this.valor instanceof Valor){
            ((Valor)this.valor).ejecutar();
        }

        TablaSimbolos.getTablaSimbolos().put(this.id, (Expresion) this.valor);
        return null;
    }
}
