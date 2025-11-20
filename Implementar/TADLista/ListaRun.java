public class ListaRun{
  private static Lista ll;
  public static void main(String[] args){
    ll = new Lista();
    No temp1;
    No temp2;
    int tam;

    
    //print
    System.out.println("Lista:");
    temp1 = ll.first();
    tam = ll.size();
    for(int i=0; i<tam; i++){
            System.out.println(temp1.getElemento());
            temp1 = ll.after(temp1);
        }
    System.out.println(f.getElemento());

    //Adicionar
    System.out.println("Adicionando 'Cachorro' ao ultimo");
    ll.insertLast("Cachorro");

    //print
    System.out.println("Lista:");
    temp1 = ll.first();
    tam = ll.size();
    for(int i=0; i<tam; i++){
            System.out.println(temp1.getElemento());
            temp1 = ll.after(temp1);
        }
    System.out.println(f.getElemento());

    //Adicionar
    System.out.println("Adicionando 'Gato' no primeiro");
    ll.insertFirst("Gato");

    //print
    System.out.println("Lista:");
    temp1 = ll.first();
    tam = ll.size();
    for(int i=0; i<tam; i++){
            System.out.println(temp1.getElemento());
            temp1 = ll.after(temp1);
        }
    System.out.println(f.getElemento());

    //Remover e Adicionar
    System.out.println("Removendo 'Cachorro' e trocando 'Gato' por 'Coelho");
    ll.remove((ll.first()).after());
    ll.replaceElement((ll.last()).before());

    //print
    System.out.println("Lista:");
    temp1 = ll.first();
    tam = ll.size();
    for(int i=0; i<tam; i++){
            System.out.println(temp1.getElemento());
            temp1 = ll.after(temp1);
        }
    System.out.println(f.getElemento());
  }
}
