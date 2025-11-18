public class ArvoreBinaria implements TADArvore{
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
}
