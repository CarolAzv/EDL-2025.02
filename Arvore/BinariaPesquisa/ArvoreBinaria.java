public class ArvoreBinaria{
    private NoTri raiz;
    private int tamanho;

    public ArvoreBinaria(){
        raiz = null;
        tamanho = 0;
    }

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


    //acesso
    public NoTri root(){
        return raiz;
    }
    
    public NoTri parent(NoTri no){
        return no.getPai();
    }

    public Object children(NoTri no){
        return [no.getEsquerda, no.getDireita];
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

    public void replace(NoTri no, Object o){
        // Implementação futura
    }
}
