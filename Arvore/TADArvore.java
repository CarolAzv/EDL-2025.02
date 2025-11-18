Public interface TADArvore{
  //Métodos genéricos:
  integer size();
  integer height();
  boolean isEmpty();
  Iterator elements();
  Iterator nos();
    
  //Métodos de acesso:
  No root();
  No parent(No);
  Iterator children(No);
    
  //Métodos de consulta:
  boolean isInternal(No);
  boolean isExternal(No);
  boolean isRoot(No);
  integer depth(No);
                  
  //Métodos de atualização:
  Object replace(No, o);
}
