package analizadores;

/**
 *
 * @author ordenador
 */
public class Unless extends Ifstatement{
    
    public Unless(Object condicion, ListaExpresion listaBloqueIf) {
        super(condicion, listaBloqueIf);
        super.condicion=negarCondicion(condicion);
    }
    public Unless(Object condicion, ListaExpresion listaBloqueIf,ListaExpresion listaBloqueElse) {
        super(condicion, listaBloqueIf,listaBloqueElse);
        super.condicion=negarCondicion(condicion);
    }

    private boolean negarCondicion(Object condicion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
