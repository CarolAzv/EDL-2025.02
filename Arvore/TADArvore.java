public interface TADArvore {
    // Métodos genéricos:
    public int size();
        //retorna o numero de nós da árvore
    public int height();
        //retorna a altura da árvore
    public boolean isEmpty();
        //verifica se a árvore estiver vazia
    public Object elements(); //Iterator?
        //retorna um iterador para os elementos da árvore
    public Object nos(); //Iterator?
        //retorna um iterador para os nós da árvore

    // Métodos de acesso:
    public NoTri root();
        //retorna o nó raiz
    public NoTri parent(NoTri no);
        //retorna o nó pai de um nó
    public Object children(NoTri no); //Iterator?
        //retorna um iterador para os filhos de um nó

    // Métodos de consulta:
    public boolean isInternal(NoTri no);
        //verifica se o nó for interno
    public boolean isExternal(NoTri no);
            //verifica se o nó é externo ou folha
    public boolean isRoot(NoTri no);
        //verifica se o nó é raiz
    public int depth(NoTri no);
        //retorna a profundidade do um nó

    // Métodos de atualização:
    public Object replace(NoTri no, Object o);
        //altera o elemento armazenado em um nó
}