public class SequenciaRun{
    private static Duplamente dd;

    public static void main (String[] args){
        dd = new Duplamente();
        Object temp;
        int i;

        //print
        int tam = dd.size();
        System.out.println("Tamanho: "+ tam);
        boolean emp = dd.isEmpty();
        System.out.println("Tamanho: "+ emp);

        //Add
        System.out.println("- Adicionando Animais");
        dd.insert("Cachorro");
        dd.insert("Gato");
        dd.insert("Coelho");

        //print
        tam = dd.size();
        System.out.println("Tamanho: "+ tam);
        emp = dd.isEmpty();
        System.out.println("Tamanho: "+ emp);
        for(i=1; i<tam+1; i++){
            temp = dd.elemAtRank(i);
            System.out.println(temp);
        }

        //Rank of
        temp = dd.rankOf("Cachorro");
        System.out.println("- Rank do item 'Cachorro': " + temp);

        //At rank
        temp = dd.atRank(2);
        System.out.println("- Item do rank 2: " + temp);

        //Add at rank
        System.out.println("- Adicionando ao rank 2");
        dd.insertAtRank(2, "Cavalo");

        //print
        tam = dd.size();
        System.out.println("Tamanho: "+ tam);
        emp = dd.isEmpty();
        System.out.println("Tamanho: "+ emp);
        for(i=1; i<tam+1; i++){
            temp = dd.elemAtRank(i);
            System.out.println(temp);
        }

        //remove at rank
        System.out.println("- Removendo o rank 3");
        dd.removeAtRank(3);

        //print
        tam = dd.size();
        System.out.println("Tamanho: "+ tam);
        emp = dd.isEmpty();
        System.out.println("Tamanho: "+ emp);
        for(i=1; i<tam+1; i++){
            temp = dd.elemAtRank(i);
            System.out.println(temp);
        }

        //replace at rank
        System.out.println("- Substituindo o rank 1 por 'Papagaio'");
        dd.replaceAtRank(1, "Papagaio");

        //print
        tam = dd.size();
        System.out.println("Tamanho: "+ tam);
        emp = dd.isEmpty();
        System.out.println("Tamanho: "+ emp);
        for(i=1; i<tam+1; i++){
            temp = dd.elemAtRank(i);
            System.out.println(temp);
        }
    }
}