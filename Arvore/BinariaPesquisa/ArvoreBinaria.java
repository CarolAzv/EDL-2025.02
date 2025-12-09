import java.util.ArrayList;
import java.util.Iterator;
public class ArvoreBinaria{
    NoTri raiz;
    int tamanho;

    public ArvoreBinaria(Object o){
        raiz = new NoTri(o);
        tamanho = 1;
    }

    //acesso
    public NoTri root(){
        return this.raiz;
    }
    
    public NoTri parent(NoTri no){
        return no.getPai();
    }

    public Iterator<Object> children(NoTri no){
        ArrayList<Object> child = new ArrayList<>();
        child.add(no.getEsquerda());
        child.add(no.getDireita());
        return child.iterator();
    }


    //informação
    public int size(){
        return tamanho;
    }

    public int altura(){
        ArrayList<Integer> altura = new ArrayList<>();
        NoTri no = raiz;
        int deep = 0;
        alturaCheck(no, deep, altura);
        int maior = 0;
        for(int i=0; i<altura.size(); i++){
            int see = altura.get(i);
            if(see>maior){
                maior = see;
            }
        }
        return maior;
    }

    public void alturaCheck(NoTri no, int deep, ArrayList<Integer> altura){
        if(no.getElemento() == null){
            altura.add(deep);
            return;
        }
        deep++;
        alturaCheck(no.getEsquerda(), deep, altura);
        alturaCheck(no.getDireita(), deep, altura);
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public Iterator<Object> elementos(){
        ArrayList<Object> elementos = new ArrayList<>();
        NoTri no = raiz;
        elementosCheck(no, elementos);
        return elementos.iterator();
    }

    public void elementosCheck(NoTri no, ArrayList<Object> elementos){
        if(no.getElemento() == null){
            return;
        }
        elementos.add(no.getElemento());
        elementosCheck(no.getEsquerda(), elementos);
        elementosCheck(no.getDireita(), elementos);
    }

    public Object nos(){
        // Implementação futura
        return null;
    }


    //consulta
    public boolean isInternal(NoTri no){
        if(no.getEsquerda() == null && no.getDireita() == null){
            return false;
        }
        return true;
    }
    
    public boolean isExternal(NoTri no){
        if(no.getEsquerda() == null && no.getDireita() == null){
            return true;
        }
        return false;
    }

    public boolean isRoot(NoTri no){
        if(no==raiz){
            return true;
        }
        return false;
    }

    public int depth(NoTri no){
        if(no==raiz){
            return 0;
        }
        return 1+depth(parent(no));
    }


    //addicionar
    public void replace(NoTri no, int o){
        // Implementação futura
    }

    public void addChild(Object o){
        NoTri novo = new NoTri(o);
        NoTri seeing = raiz;
        int foi = 0;
        while(foi!=1){
            if(seeing.getElemento()>o){
                if(seeing.getEsquerda()==null){
                    novo.setPai(seeing);
                    seeing.setEsquerda(novo);
                    tamanho++;
                    foi++;
                }
                seeing=seeing.getEsquerda();
            }
            else if(seeing.getElemento()<o){
                if(seeing.getDireita()==null){
                    novo.setPai(seeing);
                    seeing.setDireita(novo);
                    tamanho++;
                    foi++;
                }
                seeing=seeing.getDireita();
            }
            else if(seeing.getElemento()==o){
                System.err.println("Indece já existe!");
                foi++;
            }
        }
    }


    //remover
    public void remove(Object o){
        NoTri seeing = raiz;
        while(raiz.getElemento()!=o){
            if(seeing.getElemento()>o){
                seeing=seeing.getEsquerda();
            }
            else if(seeing.getElemento()<o){
                seeing=seeing.getDireita();
            }
        }

        if(seeing.getEsquerda()==null && seeing.getDireita()==null){
            if(seeing.getElemento>seeing.getPai().getElemento){
                seeing.getPai().setDireita(null);
            }
            else{
                seeing.getPai().setEsquerda(null);
            }
        }

        else if(seeing.getEsquerda()!=null && seeing.getDireita()==null){
            if(seeing.getElemento>seeing.getPai().getElemento()){
                seeing.getPai().setDireita(seeing.getEsquerda());
            }
            else{
                seeing.getPai().setEsquerda(seeing.getEsquerda());
            }
        }
        else if(seeing.getEsquerda()==null && seeing.getDireita()!=null){
            if(seeing.getElemento>seeing.getPai().getElemento()){
                seeing.getPai().setDireita(seeing.getDireita());
            }
            else{
                seeing.getPai().setEsquerda(seeing.getDireita());
            }
        }

        else{
            //not done
            if(seeing.getElemento>seeing.getPai().getElemento()){
                seeing.getPai().setDireita(seeing.getDireita());
            }
            //not done
            else{
                seeing.getPai().setEsquerda(seeing.getDireita());
            }
        }
    }
}
