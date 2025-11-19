public class SequenciaRun{
    private static Duplamente dd;

    public static void main (String[] args){
        dd = new Duplamente();

        //print
        int tam = dd.size();
        System.out.println("Tamanho: "+ tam);
        boolean emp = dd.isEmpty();
        System.out.println("Tamanho: "+ emp);

        //Add
        System.out.println("Adicionando Animais");
        dd.insert("Cachorro");
        dd.insert("Gato");
        dd.insert("Coelho");

        //print
        Object temp;
        tam = dd.size();
        System.out.println("Tamanho: "+ tam);
        emp = dd.isEmpty();
        System.out.println("Tamanho: "+ emp);
        for(int i=1; i<tam; i++){
            temp = dd.atRank(i);
            System.out.println(temp);
        }

        //Add at rank
        System.out.println("Adicionando ao rank 2");
        dd.insertAtRank(2, "Cavalo");

        //print
        tam = dd.size();
        System.out.println("Tamanho: "+ tam);
        emp = dd.isEmpty();
        System.out.println("Tamanho: "+ emp);
        for(int i=1; i<tam; i++){
            temp = dd.atRank(i);
            System.out.println(temp);
        }

        //remove at rank
        System.out.println("Removendo o rank 3");
        dd.removeAtRank(3);

        //print
        tam = dd.size();
        System.out.println("Tamanho: "+ tam);
        emp = dd.isEmpty();
        System.out.println("Tamanho: "+ emp);
        for(int i=1; i<tam; i++){
            temp = dd.atRank(i);
            System.out.println(temp);
        }
    }
}
