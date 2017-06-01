package analizadores;

import java.util.ArrayList;

/**
 *
 * @author ordenador
 */
public abstract class Expresion {
    
    protected Object contenido;

    public Expresion(){
        this.contenido=null;
    }
    
    public Expresion(Object contenido) {
        this.contenido = contenido;
    }

    
    public abstract void ejecutar();
    
    public static Expresion getExpresion(Object o){
        Expresion e=null;
        if(o instanceof String){
            e=new Cadena((String) o);
        }
        else if(o instanceof ArrayList){
            e=new ListaExpresion((ArrayList<Expresion>) o);
        }
        else if(o instanceof Integer){
            e=new Numero<Integer>((Integer)o);
        }
        else if(o instanceof Double){
            e=new Numero<Double>((Double)o);
        }
        
        return e;
    }
    
    
    
    
}
