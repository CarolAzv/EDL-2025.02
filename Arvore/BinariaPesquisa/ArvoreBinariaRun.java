import java.util.ArrayList;
import java.util.Iterator;
public class ArvoreBinariaRun{
    private static ArvoreBinaria arvore;

    public static void main (String[] args){
        arvore = new ArvoreBinaria(10);
        Object temp;
        int i;

        //Add
        arvore.addChild(5);
        arvore.addChild(2);
        arvore.addChild(8);
        arvore.addChild(15);
        arvore.addChild(22);

        //print
        arvore.elementos();
        for(Iterator<Object> it = arvore.elementos(); it.hasNext();){
            System.out.println(it.next());
        }

        //Add
        arvore.addChild(25);

        //print

        //remove
        arvore.remove(25);

        //print
    }
}
