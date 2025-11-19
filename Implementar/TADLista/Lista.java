import ESequenciaVazia;


public interface Lista{
    //generico
    public int size();
    public boolean isEmpty();
    //fila
    public boolean isFirst(Object n) throws ESequenciaVazia;
    public boolean isLast(Object n) throws ESequenciaVazia;
    //acessar
    public Object first();
    public Object last();
    public Object before(Object p);
    public Object after(Object p);
    //atualizar
    public Object replaceElement(Object n, Object o);
    public Object swapElement(Object n, Object q);
    public Object insertBefore(Object n, Object o);
    public Object insertAfter(Object n, Object o);
    public Object insertFirst(Object o);
    public Object insertLast(Object o);
    public void remove(Object n);
}