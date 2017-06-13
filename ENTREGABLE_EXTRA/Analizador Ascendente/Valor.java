
/**
 *
 * @author ordenador
 */
public class Valor<Tipo> extends Expresion {
    private Tipo valor;

    public Valor(Tipo valor) {
        this.valor = valor;
    }

    public Tipo getValor(){
        return valor;
    }

    public void setValor(Tipo valor){
        this.valor=valor;
    }

    @Override
    public void ejecutar() {
        System.out.println(valor);
    }
}