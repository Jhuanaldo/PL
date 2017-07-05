package analizadores;

public class Operacion extends Valor {

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
                this.valor = sum(valor1, valor2);
                break;
            case "-":
                this.valor = sub(valor1, valor2);
                break;
            case "x":
                this.valor = mul(valor1, valor2);
                break;
            case "/":
                this.valor = div(valor1, valor2);
                break;
            case "%":
                this.valor = mod(valor1, valor2);
                break;
            case "**":
                this.valor = exp(valor1, valor2);
                break;
            case "<":
                this.valor = less(valor1, valor2);
                break;
            case ">":
                this.valor = greater(valor1, valor2);
                break;
            case "<=":
                this.valor = less_equal(valor1, valor2);
                break;
            case ">=":
                this.valor = greater_equal(valor1, valor2);
                break;
            case "=":
                this.valor = equal(valor1, valor2);
                break;
            case "!":
                this.valor = not(valor1);
                break;
            case "!=":
                this.valor = not_equal(valor1, valor2);
                break;
            case "||":
                this.valor = or(valor1, valor2);
                break;
            case "&&":
                this.valor = and(valor1, valor2);
                break;
        }
        return this.valor;
    }

    private Valor not_equal(Valor valor1, Valor valor2) {
        return not(equal(valor1, valor2));
    }

    private Valor not(Valor valor1) {
        valor1.getValor();
        System.out.println("no: "+getBoolean(valor1));
        return new Valor(!getBoolean(valor1));
    }

    private Valor and(Valor valor1, Valor valor2) {
        valor1.getValor();
        valor2.getValor();
        return new Valor(getBoolean(valor1) && getBoolean(valor2));
    }

    private Valor or(Valor valor1, Valor valor2) {
        valor1.getValor();
        valor2.getValor();
        return new Valor(getBoolean(valor1) || getBoolean(valor2));
    }

    private Valor equal(Valor valor1, Valor valor2) {
        Object r = null;
        Object v1 = valor1.getValor();
        Object v2 = valor2.getValor();
        if (v1 instanceof Valor) {
            v1 = ((Valor) v1).getValor();
        }
        if (v2 instanceof Valor) {
            v2 = ((Valor) v2).getValor();
        }
        if (!(v1 instanceof String) && !(v2 instanceof String)) {
            if (v1 instanceof Double && v2 instanceof Double) {
                r = ((Double) v1) == ((Double) v2);

            } else if (v1 instanceof Integer && v2 instanceof Double) {
                r = ((Integer) v1).doubleValue() == ((Double) v2);
            } else if (v1 instanceof Double && v2 instanceof Integer) {
                r = ((Double) v1) == ((Integer) v2).doubleValue();

            } else if (v1 instanceof Integer && v2 instanceof Integer) {
                r = ((Integer) v1) == ((Integer) v2);
            }
        } else {
            //no se comparan string
        }
        return new Valor(r);
    }

    private Valor greater_equal(Valor valor1, Valor valor2) {
        Object r = null;
        Object v1 = valor1.getValor();
        Object v2 = valor2.getValor();
        if (v1 instanceof Valor) {
            v1 = ((Valor) v1).getValor();
        }
        if (v2 instanceof Valor) {
            v2 = ((Valor) v2).getValor();
        }
        if (!(v1 instanceof String) && !(v2 instanceof String)) {
            if (v1 instanceof Double && v2 instanceof Double) {
                r = ((Double) v1) >= ((Double) v2);

            } else if (v1 instanceof Integer && v2 instanceof Double) {
                r = ((Integer) v1).doubleValue() >= ((Double) v2);
            } else if (v1 instanceof Double && v2 instanceof Integer) {
                r = ((Double) v1) >= ((Integer) v2).doubleValue();

            } else if (v1 instanceof Integer && v2 instanceof Integer) {
                r = ((Integer) v1) >= ((Integer) v2);
            }
        } else {
            //no se comparan string
        }
        return new Valor(r);
    }

    private Valor less_equal(Valor valor1, Valor valor2) {
        Object r = null;
        Object v1 = valor1.getValor();
        Object v2 = valor2.getValor();
        if (v1 instanceof Valor) {
            v1 = ((Valor) v1).getValor();
        }
        if (v2 instanceof Valor) {
            v2 = ((Valor) v2).getValor();
        }
        if (!(v1 instanceof String) && !(v2 instanceof String)) {
            if (v1 instanceof Double && v2 instanceof Double) {
                r = ((Double) v1) <= ((Double) v2);

            } else if (v1 instanceof Integer && v2 instanceof Double) {
                r = ((Integer) v1).doubleValue() <= ((Double) v2);
            } else if (v1 instanceof Double && v2 instanceof Integer) {
                r = ((Double) v1).doubleValue() <= ((Integer) v2);

            } else if (v1 instanceof Integer && v2 instanceof Integer) {
                r = ((Integer) v1) <= ((Integer) v2);
            }
        } else {
            //no se comparan string
        }
        return new Valor(r);
    }

    private Valor greater(Valor valor1, Valor valor2) {
        Object r = null;
        Object v1 = valor1.getValor();
        Object v2 = valor2.getValor();
        if (v1 instanceof Valor) {
            v1 = ((Valor) v1).getValor();
        }
        if (v2 instanceof Valor) {
            v2 = ((Valor) v2).getValor();
        }
        if (!(v1 instanceof String) && !(v2 instanceof String)) {
            if (v1 instanceof Double && v2 instanceof Double) {
                r = ((Double) v1) > ((Double) v2);

            } else if (v1 instanceof Integer && v2 instanceof Double) {
                r = ((Integer) v1).doubleValue() > ((Double) v2);
            } else if (v1 instanceof Double && v2 instanceof Integer) {
                r = ((Double) v1) > ((Integer) v2).doubleValue();

            } else if (v1 instanceof Integer && v2 instanceof Integer) {
                r = ((Integer) v1) > ((Integer) v2);
            }
        } else {
            //no se comparan string
        }
        return new Valor(r);
    }

    private Valor less(Valor valor1, Valor valor2) {
        Object r = null;
        Object v1 = valor1.getValor();
        Object v2 = valor2.getValor();
        if (v1 instanceof Valor) {
            v1 = ((Valor) v1).getValor();
        }
        if (v2 instanceof Valor) {
            v2 = ((Valor) v2).getValor();
        }
        if (!(v1 instanceof String) && !(v2 instanceof String)) {
            if (v1 instanceof Double && v2 instanceof Double) {
                r = ((Double) v1) < ((Double) v2);

            } else if (v1 instanceof Integer && v2 instanceof Double) {
                r = ((Integer) v1).doubleValue() < ((Double) v2);
            } else if (v1 instanceof Double && v2 instanceof Integer) {
                r = ((Double) v1) < ((Integer) v2).doubleValue();

            } else if (v1 instanceof Integer && v2 instanceof Integer) {
                r = ((Integer) v1) < ((Integer) v2);
            }
        } else {
            //no se comparan string
        }
        return new Valor(r);
    }

    private Valor exp(Valor valor1, Valor valor2) {
        Object r = null;
        Object v1 = valor1.getValor();
        Object v2 = valor2.getValor();
        if (v1 instanceof Valor) {
            v1 = ((Valor) v1).getValor();
        }
        if (v2 instanceof Valor) {
            v2 = ((Valor) v2).getValor();
        }
        if (!(v1 instanceof String) && !(v2 instanceof String)) {
            if (v1 instanceof Double && v2 instanceof Double) {
                r = Math.pow(((Double) v1), ((Double) v2));

            } else if (v1 instanceof Integer && v2 instanceof Double) {
                r = Math.pow(((Integer) v1).doubleValue(), ((Double) v2));

            } else if (v1 instanceof Double && v2 instanceof Integer) {
                r = Math.pow(((Double) v2), ((Integer) v1).doubleValue());
            } else if (v1 instanceof Integer && v2 instanceof Integer) {
                r = Math.pow(((Integer) v1).doubleValue(), ((Integer) v2).doubleValue());
            }
        } else {
            //error exponente solo con numeros
        }
        return new Valor(r);
    }

    private Valor mod(Valor valor1, Valor valor2) {
        Object r = null;
        Object v1 = valor1.getValor();
        Object v2 = valor2.getValor();
        if (v1 instanceof Valor) {
            v1 = ((Valor) v1).getValor();
        }
        if (v2 instanceof Valor) {
            v2 = ((Valor) v2).getValor();
        }
        if (!(v1 instanceof String || v2 instanceof String)) {

            if (v1 instanceof Double || v2 instanceof Double) {
                r = ((Double) v1) % ((Double) v2);

            } else if (v1 instanceof Integer && v2 instanceof Integer) {
                r = ((Integer) v1) % ((Integer) v2);
            }
        } else {
            //error semantico no se pueden dividir string
        }
        return new Valor(r);
    }

    private Valor div(Valor valor1, Valor valor2) {
        Object r = null;
        Object v1 = valor1.getValor();
        Object v2 = valor2.getValor();
        if (v1 instanceof Valor) {
            v1 = ((Valor) v1).getValor();
        }
        if (v2 instanceof Valor) {
            v2 = ((Valor) v2).getValor();
        }
        if (!(v1 instanceof String) && !(v2 instanceof String)) {
            if (v1 instanceof Double || v2 instanceof Double) {
                r = ((Double) v1) / ((Double) v2);
            } else if (valor1.getValor() instanceof Integer && valor2.getValor() instanceof Integer) {
                r = ((Integer) v1) / ((Integer) v2);
            }
        } else {
            //error semantico no se pueden dividir string
        }
        return new Valor(r);
    }

    private Valor sub(Valor valor1, Valor valor2) {
        Object r = null;
        Object v1 = valor1.getValor();
        Object v2 = valor2.getValor();
        if (v1 instanceof Valor) {
            v1 = ((Valor) v1).getValor();
        }
        if (v2 instanceof Valor) {
            v2 = ((Valor) v2).getValor();
        }
        if (!(v1 instanceof String || v2 instanceof String)) {

            if (v1 instanceof Double || v2 instanceof Double) {
                r = ((Double) v1) - ((Double) v2);
            } else if (v1 instanceof Double && v2 instanceof Integer) {
                r = ((Double) v1) - ((Integer) v2);
            } else if (v1 instanceof Integer && v2 instanceof Double) {
                r = ((Integer) v1) - ((Double) v2);
            } else if (v1 instanceof Integer && v2 instanceof Integer) {
                r = ((Integer) v1) - ((Integer) v2);
            }
        } else {
            //error semantico no se pueden restar string
        }
        return new Valor(r);
    }

    private Valor mul(Valor valor1, Valor valor2) {
        Object r = null;
        Object v1 = valor1.getValor();
        Object v2 = valor2.getValor();
        if (v1 instanceof Valor) {
            v1 = ((Valor) v1).getValor();
        }
        if (v2 instanceof Valor) {
            v2 = ((Valor) v2).getValor();
        }
        if (v1 instanceof String && v2 instanceof Integer) {
            String aux = "";
            for (int i = 0; i++ < (Integer) v2; aux += (String) v1);
            r = aux;
        } else if (v1 instanceof Integer && v2 instanceof String) {
            String aux = "";
            for (int i = 0; i++ < (Integer) v1; aux += (String) v2);
            r = aux;
        } else if (v1 instanceof Double && v2 instanceof Double) {
            r = ((Double) v1) * ((Double) v2);
        } else if (v1 instanceof Double && v2 instanceof Integer) {
            r = ((Double) v1) * ((Integer) v2);
        } else if (v1 instanceof Integer && v2 instanceof Double) {
            r = ((Integer) v1) * ((Double) v2);
        } else if (v1 instanceof Integer && v2 instanceof Integer) {
            r = ((Integer) v1) * ((Integer) v2);

        }
        return new Valor(r);
    }

    private Valor sum(Valor valor1, Valor valor2) {
        Object r = null;
        Object v1 = valor1.getValor();
        Object v2 = valor2.getValor();
        if (v1 instanceof Valor) {
            v1 = ((Valor) v1).getValor();
        }
        if (v2 instanceof Valor) {
            v2 = ((Valor) v2).getValor();
        }
        if (v1 instanceof String && v2 instanceof String) {
            r = ((String) v1) + ((String) v2);
        } else if (v1 instanceof String && v2 instanceof Integer) {
            r = ((String) v1) + ((Integer) v2);
        } else if (v1 instanceof Integer && v2 instanceof String) {
            r = ((Integer) v1) + ((String) v2);
        } else if (v1 instanceof Double && v2 instanceof Double) {
            r = ((Double) v1) + ((Double) v2);
        } else if (v1 instanceof Double && v2 instanceof Integer) {
            r = ((Double) v1) + ((Integer) v2);
        } else if (v1 instanceof Integer && v2 instanceof Double) {
            r = ((Integer) v1) + ((Double) v2);
        } else if (v1 instanceof Integer && v2 instanceof Integer) {
            r = ((Integer) v1) + ((Integer) v2);
        }
        return new Valor(r);
    }

    private Boolean getBoolean(Object v) {
        Boolean r = false;
        if (v instanceof Valor) {
            v=((Valor)v).getValor();
        }
        if (v instanceof Boolean) {
            r = (Boolean) v;
        } else if (v instanceof Integer) {
            r = ((Integer) v) >= 1;
        } else if (v == null) {
            r = false;
        } else if (v instanceof String) {
            try {
                Double s;
                s = new Double((String) v);
                r = s >= 1;

            } catch (NumberFormatException e1) {
                try {
                    Integer i;
                    i = new Integer((String) v);
                    r = i >= 1;
                } catch (NumberFormatException e2) {
                    boolean a = ((String) v).equals("true");
                    r = a;
                }
            }
        }
        return r;
    }

    @Override
    public Object getValor() {
        return this.valor;
    }

}
