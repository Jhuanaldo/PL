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
public class ListaExpresion extends Expresion{

    private ArrayList<Expresion> lista;

    public ListaExpresion(ArrayList<Expresion> lista) {
        this.lista = lista;
    }
    public ListaExpresion(Expresion e) {
        this.lista=new ArrayList<Expresion>();
        this.addExpresion(e);
    }

    public void addExpresion(Expresion e){
        this.lista.add(e);
    }

    public ArrayList<Expresion> getLista() {
        return lista;
    }


    @Override
    public void ejecutar() {
        for(Expresion e:lista){
            e.ejecutar();
        }
    }
}