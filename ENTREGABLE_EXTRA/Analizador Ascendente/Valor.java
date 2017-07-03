package analizadores;

/**
 *
 * @author ordenador
 */
public class Valor<Tipo> extends Expresion {

    public Tipo valor;

    @Override
    public Object ejecutar() {
        return valor + "";
    }

    public Valor(Tipo valor) {
        this.valor = valor;
    }

    public Tipo getValor() {
        return valor;
    }

    public void setValor(Tipo valor) {
        this.valor = valor;
    }



    public Boolean getBoolean() {
        Boolean r = false;
        if (valor instanceof Boolean) {
            r = new Boolean((Boolean) valor);
        } else if (valor instanceof Integer) {
            r = new Boolean(((Integer) valor) >= 1);
        } else if (valor == null) {
            r = new Boolean(false);
        } else if (valor instanceof String) {
            boolean a = ((String) valor).equals("true") ? true
                    : ((String) valor).equals("1") ? true
                    : ((String) valor).equals("0") ? false
                    : ((String) valor).equals("false") ? false
                    : ((String) valor).equals("null") ? false
                    : ((String) valor).equals("") ? false 
                    :false;
            r = new Boolean(a);
        }
        return r;
    }

    public boolean basico() {
        return this.getValor() instanceof Integer || this.getValor() instanceof Double
                || this.getValor() instanceof String
                || this.getValor() instanceof Boolean;
    }

    public String toString() {
        return valor + "";
    }
}

