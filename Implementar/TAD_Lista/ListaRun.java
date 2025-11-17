import java.util.Scanner;
public class ListaRun extends Object{
  private static No s;
  private static No f;
  public static void main(String[] args){
    Object temp1;
    Object temp2;
    s = new No("Começo");
    f = new No("Fim");
    s.setProximo(f);
    f.setAnterior(s);

    
    //print
    System.out.println("Lista:");
    temp1 = (No) s.getProximo();
    while(temp1 != f){
            System.out.println(((No)temp1).getElemento());
            temp1 = (No) ((No)temp1).getProximo();
        }
    System.out.println(f.getElemento());

    //Adicionar
    System.out.println("Adicionando 'Cachorro'");
    temp1 = f.getAnterior();
    temp2 = new No("Cachorro");
    ((No)temp2).setAnterior(temp1);
    ((No)temp2).setProximo(f);
    ((No)temp1).setProximo(temp2);
    f.setAnterior(temp2);

    System.out.println("Adicionando 'Gato'");
    temp1 = f.getAnterior();
    temp2 = new No("Gato");
    ((No)temp2).setAnterior(temp1);
    ((No)temp2).setProximo(f);
    ((No)temp1).setProximo(temp2);
    f.setAnterior(temp2);

    //print
    System.out.println("Lista:");
    temp1 = (No) s.getProximo();
    while(temp1 != f){
            System.out.println(((No)temp1).getElemento());
            temp1 = (No) ((No)temp1).getProximo();
        }
    System.out.println(f.getElemento());

    //Remover
    System.out.println("Removendo último elemento");
    temp1 = f.getAnterior();
    No prev = (No) ((No)temp1).getAnterior();
    prev.setProximo(f);
    f.setAnterior(prev);

    //print
    System.out.println("Lista:");
    temp1 = (No) s.getProximo();
    while(temp1 != f){
            System.out.println(((No)temp1).getElemento());
            temp1 = (No) ((No)temp1).getProximo();
        }
    System.out.println(f.getElemento());
  }
}