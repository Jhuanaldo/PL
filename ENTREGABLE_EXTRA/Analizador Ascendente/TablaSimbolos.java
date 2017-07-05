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
        //singleton
        if(tablaSimbolos==null){
            tablaSimbolos=new TablaSimbolos();
        }
        return tablaSimbolos;
    }

    public void insertar(String nombre, Valor valor) {
        tabla.put(nombre, valor);
    }
    
    private Hashtable getTabla(){
        return this.tabla;
    }
    
    public boolean existe(String n){
        return this.getTabla().get(n)!=null;
    }

    public void put(String s,Expresion v) {
        this.getTabla().put(s, v);
    }
    public Expresion get(String nombre) {
        return  (Expresion) this.getTabla().get(nombre);
    }

}
 