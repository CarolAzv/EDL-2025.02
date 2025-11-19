public interface Sequencia{
    //generico
    public int size();
    public boolean isEmpty();
    //vetor
    public Object elemAtRank(int n) throws ESequenciaVazia;
    public void replaceAtRank(int n, Object o) throws ESequenciaVazia;
    public void insertAtRank(int n, Object o) throws ESequenciaVazia;
    public void removeAtRank(int n) throws ESequenciaVazia;
    //ponte
    public Object atRank(int r);
    public Object rankOf(Object o);

    //lista
    /*
     * public Object first();
     * public Object last();
     * public Object before(Object n);
     * public Object after(Object n);
     * public void replaceElement(Object n, Object o);
     * public void swapElementElement(Object n, Object o);
     * public Object insertBefore(Object n, Object o);
     * public Object insertAfter(Object n, Object o);
     * public Object insertFirst(Object o);
     * public Object insertLast(Object o);
     * public void remove(Object n);
     */
}