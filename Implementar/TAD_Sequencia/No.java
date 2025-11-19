public class No{
    private Object elemento;
    private No proximo;
    private No anterior;

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

    public void setProximo(No o){
        this.proximo = o;  
    }

    public No getProximo(){
        if(proximo==null)
            return null;
        return proximo;
    }

    public void setAnterior(No o){
        this.anterior = o;  
    }

    public No getAnterior(){
        if(anterior==null)
            return null;
        return anterior;
    }

}