public class Duplamente implements Sequencia{
    private No Start;
    private No End;
    private int tamanho;

    public Duplamente(){
        Start = new No("Começo");
        End = new No("Fim");
        Start.setProximo(End);
        End.setAnterior(Start);
        tamanho = 0;
    }

    public int size(){
        return tamanho;
    }

    public boolean isEmpty(){
        if(tamanho == 0)
            return true;
        return false;
    }

    public void insert(Object o){
        No novo = new No(o);
        Object before = End.getAnterior();

        before.setProximo(novo);
        novo.setAnterior(before);
        novo.setProximo(End);
        End.setAnterior(novo);
        tamanho++;
    }

    public void insertAtRank(int n, Object o){

    }

    public Object elemAtRank(int n){
        if(isEmpty())
            throw new ESequenciaVazia("Sequencia Vazia");
        if(n<0 || n>size()){
            throw new ESequenciaVazia("Indice Invalido");
        }
        No atual = Start;
        int contar = 0;
        while(contar!=n){
            atual = atual.proximo;
            contar++;
        }
    }

    public void replaceAtRank(int n, Object o){
    }

    public void removeAtRank(int n){
    }
}