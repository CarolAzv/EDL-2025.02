public class No extends Object{
    private Object elemento;
    private Object proximo;
    private Object anterior;

    public No(Object o){
        elemento = o;
        proximo = null;
        anterior = null;
    }

    public void setElemento(Object o){
        this.elemento = o;
    }

    public Object getElemento(){
        return elemento;
    }

    public void setProximo(Object o){
        this.proximo = o;  
    }

    public Object getProximo(){
        if(proximo==null)
            return null;
        return proximo;
    }

    public void setAnterior(Object o){
        this.anterior = o;  
    }

    public Object getAnterior(){
        if(anterior==null)
            return null;
        return anterior;
    }

}

