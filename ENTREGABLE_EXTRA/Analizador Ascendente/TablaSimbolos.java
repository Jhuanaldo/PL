package analizadores;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;

public class TablaSimbolos {

    private static TablaSimbolos tablaSimbolos = null;
    private Stack<Hashtable<String, Expresion>> pila;
    private Hashtable<String, Expresion> tabla;

    private TablaSimbolos() {
        tabla = new Hashtable<String, Expresion>();
        pila = new Stack();
        pila.add(tabla);
    }

    private Hashtable getTabla() {
        return this.pila.peek();
    }

    public void push() {
        this.pila.add(new Hashtable<String, Expresion>());
    }
    
    public void pop(){
        this.pila.pop();
    }
    
    

    public static TablaSimbolos getTablaSimbolos() {
        //singleton
        if (tablaSimbolos == null) {
            tablaSimbolos = new TablaSimbolos();
        }
        return tablaSimbolos;
    }

    public void insertar(String nombre, Valor valor) {
        tabla.put(nombre, valor);
    }

    public boolean existe(String n) {
        return this.getTabla().get(n) != null;
    }

    public void put(String s, Expresion v) {
        this.getTabla().put(s, v);
    }

    public Expresion get(String nombre) {
        Expresion r=(Expresion) this.getTabla().get(nombre);
        if(r==null){
            Stack<Hashtable<String, Expresion>> aux=new Stack();
            while(!this.pila.empty()&&r==null){
                aux.add(this.pila.pop());
                r=(Expresion) this.getTabla().get(nombre);
            }
            while(!aux.empty()){
                this.pila.add(aux.pop());
            }
        }
        return r;
    }

}
