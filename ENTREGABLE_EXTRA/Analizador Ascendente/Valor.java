

public class Valor extends Expresion {

    public Valor(Object valor) {
        this.valor = valor;
    }

    public Boolean getBoolean() {
        Boolean r = false;
        if (valor instanceof Valor) {
            valor = ((Valor)valor).getValor();
        }
        if (valor instanceof Boolean) {
            r = (Boolean) valor;
        } else if (valor instanceof Integer) {
            r = ((Integer) valor) >= 1;
        } else if (valor == null) {
            r = false;
        } else if (valor instanceof String) {
            try {
                Double s;
                s = new Double((String) valor);
                r=s>=1;
                
            } catch (NumberFormatException e1) {
                try {
                    Integer i;
                    i = new Integer((String) valor);
                    r=i>=1;
                } catch (NumberFormatException e2) {
                    boolean a = ((String) valor).equals("true");
                    r = a;
                }
            }
        }
        return r;
    }
/*
    public String getString() {
        return valor + "";
    }

    public Integer getInteger() {
        Integer a = 0;
        if (this.valor instanceof Integer) {
            a = (Integer) this.valor;
        }
        if (this.valor instanceof Double) {
            a = ((Double) this.valor).intValue();
        }
        return a;
    }

    public Double getDouble() {
        Double a = 0.0;
        if (this.valor instanceof Double) {
            a = (Double) this.valor;
        }
        if (this.valor instanceof Integer) {
            a = ((Integer)this.valor).doubleValue();
        }
        return a;
    }*/

    public boolean basico() {
        return this.getValor() instanceof Integer || this.getValor() instanceof Double
                || this.getValor() instanceof String
                || this.getValor() instanceof Boolean;
    }

    public String toString() {
        return valor + "";
    }
}
