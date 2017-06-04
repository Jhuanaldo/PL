package analizadores;

/**
 *
 * @author ordenador
 */
public class Valor<Tipo> extends Expresion {
    private Tipo valor;

    public Valor(Tipo valor) {
        this.valor = valor;
    }

    @Override
    public void ejecutar() {
        System.out.println(valor);
    }

    
}
