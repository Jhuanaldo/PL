package analizadores;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;

public class TablaSimbolos {

    private static TablaSimbolos tablaSimbolos=null;
    
    private Hashtable<String, Expresion> tabla;

    private TablaSimbolos() {
        tabla = new Hashtable<String, Expresion>();
    }
    
    public static TablaSimbolos getTablaSimbolos(){
        if(tablaSimbolos==null){
            tablaSimbolos=new TablaSimbolos();
        }
        return tablaSimbolos;
    }

    public void insertar(String nombre, Valor valor) {
        tabla.put(nombre, valor);
    }
    
    public Hashtable getTabla(){
        return this.tabla;
    }


    public void put(String s,Valor v) {
        this.getTabla().put(s, v);
    }
    public Valor get(String nombre) {
        return (Valor) this.getTabla().get(nombre);
    }

}
 