public class Lista {
    private No Start;
    private No End;
    private int tamanho;

    public Lista(){
        Start = new No("Começo");
        End = new No("Fim");
        Start.setProximo(End);
        End.setAnterior(Start);
        tamanho = 0;
    }

    //Geral
    public int size(){
        return tamanho;
    }

    public boolean isEmpty(){
        if(tamanho==0)
            return true;
        return false;
    }

    public Object first(){
        return Start;
    }

    public Object last(){
        return End;
    }

    public Object before(No o){
        No before = o.getAnterior();
        return before.getElemento();
    }

    public Object after(No o){
        No after = o.getProximo();
        return after.getElemento();
    }

    //atualizar
    public void replaceElement(No n, Object p){
        if(isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        n.setElemento(p);
    }

    public void swapElement(No n, No p){
        if(isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        No nant = n.getAnterior();
        No npro = n.getProximo();
        No pant = p.getAnterior();
        No ppro = p.getProximo();

        n.setAnterior(pant);
        n.setProximo(ppro);
        p.setAnterior(nant);
        p.setProximo(npro);
    }

    public void insertBefore(No n, Object o){
        if(isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        No ant = n.getAnterior();
        No novo = new No(o);

        ant.setProximo(novo);
        novo.setProximo(n);
        novo.setAnterior(ant);
        n.setAnterior(novo);
        tamanho++;
    }

    public void insertAfter(No n, Object o){
        if(isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        No pro = n.getProximo();
        No novo = new No(o);

        pro.setAnterior(novo);
        novo.setProximo(pro);
        novo.setAnterior(n);
        n.setProximo(novo);
        tamanho++;
    }

    public void insertFirst(Object o){
        if(isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        No temp = Start.getProximo();
        No novo = new No(o);

        Start.setProximo(novo);
        temp.setAnterior(novo);
        novo.setAnterior(Start);
        novo.setProximo(temp);
        tamanho++;
    }

    public void insertLast(Object o){
        if(isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        No temp = End.getAnterior();
        No novo = new No(o);

        End.setAnterior(novo);
        temp.setProximo(novo);
        novo.setAnterior(temp);
        novo.setProximo(End);
        tamanho++;
    }

    public void remove(No o){
        if(isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }
        No ant = End.getAnterior();
        No pro = End.getProximo();

        ant.setProximo(pro);
        pro.setAnterior(ant);
        tamanho--;
    }
}
