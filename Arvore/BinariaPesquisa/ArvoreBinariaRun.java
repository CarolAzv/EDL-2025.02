import java.util.ArrayList;
import java.util.Iterator;
public class ArvoreBinariaRun{
    private static ArvoreBinaria arvore;

    public static void main (String[] args){
        arvore = new ArvoreBinaria(10);
        int altura;
        int quantos = 1;
        int tempalt;
        int tempqua=1;
        String space = " ";
        String sasa;

        //Add
        arvore.addChild(5);
        arvore.addChild(2);
        arvore.addChild(8);
        arvore.addChild(15);
        arvore.addChild(22);

        //print
        arvore.elementos();
        altura = arvore.altura()-1;
        tempalt = altura;

        Iterator<Object> it = arvore.elementos();
        while(arvore!=null){
            while(tempalt>=0){
                sasa = space.repeat(altura);
                tempalt--;
            }

            while(tempqua>0){
                sasa = sasa + it.next() + sasa;
                tempqua--;
            }

            for(Iterator<Object> it = arvore.elementos(); it.hasNext();){
                sasa = space.repeat(altura);
                System.out.println(sasa + it.next() + sasa);
                altura = altura/2;
            }
        }
        
        //System.out.println("teste print");

        //Add
        arvore.addChild(25);

        //print
        System.out.println("teste print");

        //remove
        arvore.remove(25);

        //print
        System.out.println("teste print");
    }
}
