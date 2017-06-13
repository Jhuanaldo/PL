/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ordenador
 */
public class Do extends While{
    public Do(Object condicion, ListaExpresion listaBloqueW) {
        super(condicion, listaBloqueW);
    }
    @Override
    public void ejecutar() {
    	do{
    		this.listaW.ejecutar();
    	}while(condicion);
    }
}