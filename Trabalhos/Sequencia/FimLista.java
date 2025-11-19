public class FimLista{
    private Object elemento;
    private Object anterior;

    public FimLista(Object o){
        elemento = o;
        anterior = null;
    }

    public Object getElemento(){
        return elemento;
    }

    public Object getAnterior(){
        if(anterior==null)
            return null;
        return anterior;
    }

    public void setElemento(Object o){
        this.elemento = o;
    }

    public void setAnterior(Object o){
        this.anterior = o;  
    }
}