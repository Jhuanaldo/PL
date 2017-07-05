

import java.util.ArrayList;

/**
 *
 * @author ordenador
 */
public class While_statement extends Expresion {

    private ArrayList<Expresion> listaExpresion;
    private Valor condicion;

    public While_statement(Valor condicion, ArrayList<Expresion> listaExpresion) {
        this.listaExpresion = listaExpresion;
        this.condicion = condicion;
    }

    @Override
    public Object ejecutar() {
        Object r = "";
        Object aux = null;
        if (condicion instanceof Valor) {
            valor = new Valor(condicion.getValor());
        }
        boolean b=((Valor)valor).getBoolean();
        while (b) {
            for (Expresion e : this.listaExpresion) {
                aux = e.ejecutar();
                r += aux == null || aux == "" ? "" : aux + "\n";
            }
            if (condicion instanceof Valor) {
                condicion.ejecutar();
                valor = new Valor(condicion.getValor());
            }

            b=((Valor)valor).getBoolean();

        }
        return r;
    }

}
