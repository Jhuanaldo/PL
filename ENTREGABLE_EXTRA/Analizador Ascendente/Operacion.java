/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

/**
 *
 * @author ordenador
 */
public class Operacion<Tipo> extends Valor {

    protected String operacion;
    protected Valor valor1;
    protected Valor valor2;

    public Operacion(Valor valor1, String operacion, Valor valor2) {
        super(null);
        this.operacion = operacion;
        this.valor1 = valor1;
        this.valor2 = valor2;

    }

    @Override
    public Object ejecutar() {
        switch (this.operacion) {
            case "+":
                this.valor = (Valor) sum(valor1, valor2);
                break;
            case "-":
                this.valor = (Valor) sub(valor1, valor2);
                break;
            case "x":
                this.valor = (Valor) mul(valor1, valor2);
                break;
            case "/":
                this.valor = (Valor) div(valor1, valor2);
                break;
            case "%":
                this.valor = (Valor) mod(valor1, valor2);
                break;
            case "**":
                this.valor = (Valor) exp(valor1, valor2);
                break;
            case "<":
                this.valor = (Valor) less(valor1, valor2);
                break;
            case ">":
                this.valor = (Valor) greater(valor1, valor2);
                break;
            case "<=":
                this.valor = (Valor) less_equal(valor1, valor2);
                break;
            case ">=":
                this.valor = (Valor) greater_equal(valor1, valor2);
                break;
            case "=":
                this.valor = (Valor) equal(valor1, valor2);
                break;
            case "!":
                this.valor = (Valor) not(valor1);
                break;
            case "!=":
                this.valor = (Valor) not_equal(valor1, valor2);
                break;
            case "||":
                this.valor = (Valor) or(valor1, valor2);
                break;
            case "&&":
                this.valor = (Valor) and(valor1, valor2);
                break;
        }
        return this.valor;
    }

    private Valor not_equal(Valor valor1, Valor valor2) {
        return not(equal(valor1, valor2));
    }

    private Valor not(Valor valor1) {
        Object r = null;
        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();
        }
        return new Valor(new Valor(r).getBoolean());
    }

    private Valor and(Valor valor1, Valor valor2) {
        Object r = null;
        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();
        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }
        if (valor1.getValor() instanceof Boolean && valor2.getValor() instanceof Boolean) {
            r = (Boolean)valor1.getValor()&&(Boolean)valor2.getValor();
        }
        return new Valor(r);
    }
    private Valor or(Valor valor1, Valor valor2) {
        Object r = null;
        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();
        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }
        if (valor1.getValor() instanceof Boolean && valor2.getValor() instanceof Boolean) {
            r = (Boolean)valor1.getValor()||(Boolean)valor2.getValor();
        }
        return new Valor(r);
    }

    private Valor equal(Valor valor1, Valor valor2) {
        Object r = null;
        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();
        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }
        if (!(valor1.getValor() instanceof String) && !(valor2.getValor() instanceof String)) {
            if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Double) {
                Double a = new Double((double) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a.doubleValue() == b.doubleValue();
            } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Integer) {
                Double a = new Double((Double) valor1.getValor() + 0.0);
                Integer b = new Integer((Integer) valor2.getValor());
                r = b.intValue() == a.doubleValue();
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Double) {
                Integer a = new Integer((Integer) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a.intValue() == b.doubleValue();
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Integer) {
                Integer a = new Integer((int) valor1.getValor());
                Integer b = new Integer((int) valor2.getValor());
                r = a.intValue() == b.intValue();
            }
        }
        return new Valor(r);
    }

    private Valor greater_equal(Valor valor1, Valor valor2) {
        Object r = null;
        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();
        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }
        if (!(valor1.getValor() instanceof String) && !(valor2.getValor() instanceof String)) {
            if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Double) {
                Double a = new Double((double) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a.doubleValue() >= b.doubleValue();
            } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Integer) {
                Double a = new Double((Double) valor1.getValor() + 0.0);
                Integer b = new Integer((Integer) valor2.getValor());
                r = a.doubleValue() >= b.intValue();
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Double) {
                Integer a = new Integer((Integer) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a.intValue() >= b.doubleValue();
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Integer) {
                Integer a = new Integer((int) valor1.getValor());
                Integer b = new Integer((int) valor2.getValor());
                r = a.intValue() >= b.intValue();
            }
        }
        return new Valor(r);
    }

    private Valor less_equal(Valor valor1, Valor valor2) {
        Object r = null;
        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();
        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }
        if (!(valor1.getValor() instanceof String) && !(valor2.getValor() instanceof String)) {
            if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Double) {
                Double a = new Double((double) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a.doubleValue() <= b.doubleValue();
            } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Integer) {
                Double a = new Double((Double) valor1.getValor() + 0.0);
                Integer b = new Integer((Integer) valor2.getValor());
                r = a.doubleValue() <= b.intValue();
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Double) {
                Integer a = new Integer((Integer) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a.intValue() <= b.doubleValue();
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Integer) {
                Integer a = new Integer((int) valor1.getValor());
                Integer b = new Integer((int) valor2.getValor());
                r = a.intValue() <= b.intValue();
            }
        }
        return new Valor(r);
    }

    private Valor greater(Valor valor1, Valor valor2) {
        Object r = null;
        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();
        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }
        if (!(valor1.getValor() instanceof String) && !(valor2.getValor() instanceof String)) {
            if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Double) {
                Double a = new Double((double) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a.doubleValue() > b.doubleValue();
            } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Integer) {
                Double a = new Double((Double) valor1.getValor() + 0.0);
                Integer b = new Integer((Integer) valor2.getValor());
                r = a.doubleValue() > b.intValue();
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Double) {
                Integer a = new Integer((Integer) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a.intValue() > b.doubleValue();
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Integer) {
                Integer a = new Integer((int) valor1.getValor());
                Integer b = new Integer((int) valor2.getValor());
                r = a.intValue() > b.intValue();
            }
        }
        return new Valor(r);
    }

    private Valor less(Valor valor1, Valor valor2) {
        Object r = null;
        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();
        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }
        if (!(valor1.getValor() instanceof String) && !(valor2.getValor() instanceof String)) {
            if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Double) {
                Double a = new Double((double) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a.doubleValue() < b.doubleValue();
            } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Integer) {
                Double a = new Double((Double) valor1.getValor() + 0.0);
                Integer b = new Integer((Integer) valor2.getValor());
                r = a.doubleValue() < b.intValue();
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Double) {
                Integer a = new Integer((Integer) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a.intValue() < b.doubleValue();
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Integer) {
                Integer a = new Integer((int) valor1.getValor());
                Integer b = new Integer((int) valor2.getValor());
                r = a.intValue() < b.intValue();
            }
        }
        return new Valor(r);
    }

    private Valor exp(Valor valor1, Valor valor2) {
        Object r = null;
        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();
        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }
        if (!(valor1.getValor() instanceof String) && !(valor2.getValor() instanceof String)) {
            if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Double) {
                Double a = new Double((double) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = Math.pow(a, b);
            } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Integer) {
                Double a = new Double((Double) valor1.getValor() + 0.0);
                Integer b = new Integer((Integer) valor2.getValor());
                r = Math.pow(a, b.intValue() + 0.0);
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Double) {
                Integer a = new Integer((Integer) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = Math.pow(a, b);
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Integer) {
                Integer a = new Integer((int) valor1.getValor());
                Integer b = new Integer((int) valor2.getValor());
                r = Math.pow(a, b);
            }
        }
        return new Valor(r);
    }

    private Valor mod(Valor valor1, Valor valor2) {
        Object r = null;
        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();
        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }
        if (!(valor1.getValor() instanceof String) && !(valor2.getValor() instanceof String)) {
            if (valor1.getValor() instanceof Double || valor2.getValor() instanceof Double) {
                Double a = new Double((double) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a % b;
            } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Integer) {
                Double a = new Double((Double) valor1.getValor() + 0.0);
                Integer b = new Integer((Integer) valor2.getValor());
                r = a % b;
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Double) {
                Integer a = new Integer((Integer) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a % b;
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Integer) {
                Integer a = new Integer((int) valor1.getValor());
                Integer b = new Integer((int) valor2.getValor());
                r = a % b;
            }
        }
        return new Valor(r);
    }

    private Valor div(Valor valor1, Valor valor2) {
        Object r = null;
        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();
        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }
        if (!(valor1.getValor() instanceof String) && !(valor2.getValor() instanceof String)) {
            if (valor1.getValor() instanceof Double || valor2.getValor() instanceof Double) {
                Double a = new Double((double) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a / b;
            } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Integer) {
                Double a = new Double((Double) valor1.getValor() + 0.0);
                Integer b = new Integer((Integer) valor2.getValor());
                r = a / b;
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Double) {
                Integer a = new Integer((Integer) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a / b;
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Integer) {
                Integer a = new Integer((int) valor1.getValor());
                Integer b = new Integer((int) valor2.getValor());
                r = a / b;
            }
        }
        return new Valor(r);
    }

    private Valor sub(Valor valor1, Valor valor2) {
        Object r = null;
        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();
        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }
        if (!(valor1.getValor() instanceof String || valor2.getValor() instanceof String)) {

            if (valor1.getValor() instanceof Double || valor2.getValor() instanceof Double) {
                Double a = new Double((double) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a - b;
            } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Integer) {
                Double a = new Double((Double) valor1.getValor() + 0.0);
                Integer b = new Integer((Integer) valor2.getValor());
                r = a - b;
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Double) {
                Integer a = new Integer((Integer) valor1.getValor());
                Double b = new Double((double) valor2.getValor());
                r = a - b;
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Integer) {
                Integer a = new Integer((int) valor1.getValor());
                Integer b = new Integer((int) valor2.getValor());
                r = a - b;
            }
        }
        return new Valor(r);
    }

    private Valor mul(Valor valor1, Valor valor2) {
        Object r = null;

        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();

        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }

        if (valor1.getValor() instanceof String && valor2.getValor() instanceof Integer) {
            String aux = "";
            for (int i = 0; i++ < (Integer) valor2.getValor(); aux += (String) valor1.getValor());
            r = aux;
        } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof String) {
            String aux = "";
            for (int i = 0; i++ < (Integer) valor1.getValor(); aux += (String) valor2.getValor());
            r = aux;
        } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Double) {
            Double a = new Double((Double) valor1.getValor() + 0.0);
            Double b = new Double((Double) valor2.getValor() + 0.0);
            r = a * b;
        } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Integer) {
            Double a = new Double((Double) valor1.getValor() + 0.0);
            Integer b = new Integer((Integer) valor2.getValor());
            r = a * b;
        } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Double) {
            Integer a = new Integer((Integer) valor1.getValor());
            Double b = new Double((double) valor2.getValor());
            r = a * b;
        } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Integer) {
            Integer a = new Integer((int) valor1.getValor());
            Integer b = new Integer((int) valor2.getValor());
            r = a * b;
        }
        this.valor = new Valor(r);
        return new Valor(r);
    }

    private Valor sum(Valor valor1, Valor valor2) {
        Object r = null;

        while (!basico(valor1)) {
            valor1.ejecutar();
            valor1 = (Valor) valor1.getValor();

        }
        while (!basico(valor2)) {
            valor2.ejecutar();
            valor2 = (Valor) valor2.getValor();
        }

        if (valor1.getValor() instanceof String || valor2.getValor() instanceof String) {

            r = (valor1.getValor() + "") + (valor2.getValor() + "");
        } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Double) {
            Double a = new Double((Double) valor1.getValor() + 0.0);
            Double b = new Double((Double) valor2.getValor() + 0.0);
            r = a + b;

        } else if (valor1.getValor() instanceof Double && valor2.getValor() instanceof Integer) {
            Double a = new Double((Double) valor1.getValor() + 0.0);
            Integer b = new Integer((Integer) valor2.getValor());
            r = a + b;

        } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Double) {
            Integer a = new Integer((Integer) valor1.getValor());
            Double b = new Double((double) valor2.getValor());
            r = a + b;

        } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Integer) {
            Integer a = new Integer((int) valor1.getValor());
            Integer b = new Integer((int) valor2.getValor());
            r = a + b;
        }
        return new Valor(r);
    }

    private boolean basico(Valor valor1) {
        return valor1.getValor() instanceof Integer || valor1.getValor() instanceof Double
                || valor1.getValor() instanceof String || valor1.getValor() instanceof Boolean;//null
    }

}
