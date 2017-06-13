/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ordenador
 */
public class While extends Expresion{

    protected boolean condicion;
    protected ListaExpresion listaW;

    public While(Object condicion,ListaExpresion listaBloqueW){
        this.condicion=getCondicion(condicion);
        this.listaW=listaBloqueW;
    }

    @Override
    public void ejecutar() {
        while(condicion){
            listaW.ejecutar();
        }
    }

    private boolean getCondicion(Object condicion) {
        System.out.println("Condicion del while: "+ condicion);
        return true;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}