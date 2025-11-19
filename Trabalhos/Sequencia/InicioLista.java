public class InicioLista{
    private Object elemento;
    private Object proximo;

    public InicioLista(Object o){
        elemento = o;
        proximo = null;
    }

    public Object getProximo(){
        if(proximo==null)
            return null;
        return proximo;
    }

    public Object getElemento(){
        return elemento;
    }

    public void setElemento(Object o){
        this.elemento = o;
    }

    public void setProximo(Object o){
        this.proximo = o;  
    }

}
