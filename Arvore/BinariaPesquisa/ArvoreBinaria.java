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

    public Iterator children(NoTri no){
        NoTri child[] = new NoTri[2];
        child[0] = no.getEsquerda();
        child[1] = no.getDireita();
        return child.iterator();
    }


    //informação
    public int size(){
        return tamanho;
    }

    public int height(){
        if(raiz == null){
            return -1;
            
        }else if(raiz.getEsquerda() == null && raiz.getDireita() == null){
            return 0;
            
        }else if(raiz.getEsquerda() == null){
            return 1 + raiz.getDireita().height();

        }else if(raiz.getDireita() == null){
            return 1 + raiz.getEsquerda().height();

        }else{
            int Hesq = raiz.getEsquerda().height();
            int Hdir = raiz.getDireita().height();
            if(Hesq > Hdir){
                return 1 + Hesq;
            }else{
                return 1 + Hdir;
            }
        }
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public Object elements(){
        // Implementação futura
        return null;
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

    public void addChild(NoTri no, Object o){
        NoTri novo = new NoTri(o);
        NoTri seeing = no;
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
