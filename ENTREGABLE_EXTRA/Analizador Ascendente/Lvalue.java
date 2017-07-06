package analizadores;

/**
 *
 * @author ordenador
 */
public class Lvalue  extends Valor {
    
    protected String id;
    
    public Lvalue(String id){
        super(null);
        this.id=id;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public Object ejecutar(){
        return this.getValor();
    }
    
    @Override
    public Object getValor(){
        Expresion e=TablaSimbolos.getTablaSimbolos().get(id);
        valor =e;
        if(!(e instanceof Valor)){
            e.ejecutar();
        }
        return  e.getValor();
    }
    
    public Expresion getExpresion(){
        Expresion e=(Expresion) this.valor;
        if(e==null){
            e=TablaSimbolos.getTablaSimbolos().get(id);
        }
        return e;
    }
    
    
    
    
}
