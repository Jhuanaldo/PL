import java.util.ArrayList;

/**
 *
 * @author ordenador
 */
public class Ifstatement extends Expresion{

    protected boolean condicion;
    protected ListaExpresion listaIf;
    protected ListaExpresion listaElse;
    protected Ifstatement elsif;


    public Ifstatement(Object condicion,ListaExpresion listaBloqueIf){
        this.condicion=getCondicion(condicion);
        this.listaIf=listaBloqueIf;
        this.listaElse=null;
        this.elsif=null;
    }
    public Ifstatement(Object condicion,ListaExpresion listaBloqueIf,ListaExpresion listaBloqueElse){
        this.condicion=getCondicion(condicion);
        this.listaIf=listaBloqueIf;
        this.listaElse=listaBloqueElse;
        this.elsif=null;
    }
    public Ifstatement(Object condicion,ListaExpresion listaBloqueIf,Ifstatement elsif){
        this(condicion,listaBloqueIf);
        this.elsif=elsif;
    }

    @Override
    public void ejecutar() {
        if(this.condicion){
            this.listaIf.ejecutar();
        }else{
            if(this.listaElse!=null){
                this.listaElse.ejecutar();
            }else if(elsif!=null){
                elsif.ejecutar();
            }
        }
    }

    private boolean getCondicion(Object condicion) {
        boolean r=false;  //repasar como se forman las condiciones en ruby
        if(condicion instanceof String){
        }
        return r;
    }
}