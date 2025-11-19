public class Duplamente{
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

    //Geral 1
    public int size(){
        return tamanho;
    }

    public boolean isEmpty(){
        if(tamanho==0)
            return true;
        return false;
    }

    //Geral 2
    public void insert(Object o){
        No novo = new No(o);
        No antes = End.getAnterior();

        antes.setProximo(novo);
        novo.setAnterior(antes);
        novo.setProximo(End);
        End.setAnterior(novo);
        tamanho++;
    }

    public Object atRank(int r){
        No node;
        if(r <= size()/2){
            node = Start.getProximo();
            for(int i=0; i<r; i++);
                node = node.getProximo();
        }else{
            node = End.getAnterior();
            for(int i=0; i<size()-r-1 ; i++)
                node = node.getAnterior();
        }
        return node;
    }

    public int rankOf(No o){
        No n = Start.getProximo();
        int r = 0;
        while(n!=o && n!=End) {
        n = n.getProximo();
        r++;
        }
        return r;
    }


    //Detalhe
    public void insertAtRank(int n, Object o){
        if(isEmpty())
            throw new Error("Sequencia Vazia");
        if(n<0 || n>size()){
            throw new Error("Indice Invalido");
        }
        No novo = new No(o);
        No node = Start;

        for(int i=0; i<n; i++){
            node = node.getProximo();
        }

        No antes = (node).getAnterior();

        novo.setAnterior(antes);
        node.setAnterior(novo);

        novo.setProximo(node);
        antes.setProximo(novo);
        tamanho++;

    }

    public Object elemAtRank(int n){
        if(isEmpty())
            throw new Error("Sequencia Vazia");
        if(n<0 || n>size()){
            throw new Error("Indice Invalido");
        }

        No atual = Start;
        for(int i=0; i<n; i++){
            atual = atual.getProximo();
        }
        return atual.getElemento();
    }

    public void replaceAtRank(int n, Object o){
        if(isEmpty())
            throw new Error("Sequencia Vazia");
        if(n<0 || n>size()){
            throw new Error("Indice Invalido");
        }

        No atual = Start;
        for(int i=0; i<n; i++){
            atual = atual.getProximo();
        }

        atual.setElemento(o);
    }

    public void removeAtRank(int n){
        if(isEmpty())
            throw new Error("Sequencia Vazia");
        if(n<0 || n>size()){
            throw new Error("Indice Invalido");
        }

        No atual = Start;
        for(int i=0; i<n; i++){
            atual = atual.getProximo();
        }

        No ante = atual.getAnterior();
        No dep = atual.getProximo();

        ante.setProximo(dep);
        dep.setAnterior(ante);
        tamanho--;
    }
}