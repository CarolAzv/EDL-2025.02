public class NoTriplo extends Object{
    private Object elemento;
    private No pai;
    private No esquerda;
    private No direita;

    public NoTriplo(Object o){
        elemento = o;
        pai = null
        esquerda = null;
        direita = null;
    }

  
    public void setElemento(Object o){
        this.elemento = o;
    }

    public Object getElemento(){
        return elemento;
    }

  
    public void setEsquerda(No o){
        this.esquerda = o;  
    }

    public No getEsquerda(){
        if(esquerda==null)
            return null;
        return esquerda;
    }

  
  public void setDireita(No o){
        this.direita = o;  
    }

    public No getDireita(){
        if(direita==null)
            return null;
        return direita;
    }

  
    public void setPai(No o){
        this.pai = o;  
    }

    public No getPai(){
        if(pai==null)
            return null;
        return pai;
    }

}
