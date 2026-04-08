import java.util.ArrayList;
import java.util.List;

public class Liste {

    public static void main(String []args){

        //crearea unei liste - v1
        List<String> listaStringuri = new ArrayList<>();

        //creare unei liste - v2
        List<Integer> listaInteger = List.of(1, 2, 23, 534);

        //afisarea listei - v1
        System.out.println("afisearea listei - v1");
        System.out.println(listaStringuri);
        System.out.println(listaInteger);

        //afisarea listei - v2
        System.out.println("afisearea listei - v2");
        for(int i = 0; i < listaInteger.size(); i++){
            System.out.println(listaInteger.get(i));
        }

        //afisearea listei - v3
        System.out.println("afisearea listei - v3");
        for(Integer item : listaInteger) {
            System.out.println(item);
        }


        //Operatii de baza
        List<String> fructe = new ArrayList<>();

        //adaugare elemente in lista
        fructe.add("apple");
        fructe.add("banana");
        fructe.add("orange");

        fructe.add(1, "kiwi");

        System.out.println(fructe);

        //afisarea unui anumit element din lista
        String item = fructe.get(2);
        System.out.println(item);

        //modificarea unui element din lista
        fructe.set(3, "Orange");
        System.out.println(fructe);

        //stergerea unui element din lista
        fructe.remove("kiwi");
        System.out.println(fructe);

        fructe.remove(1);
        System.out.println(fructe);

        //dimensiunea unei lista
        int dimensiuneaListei = fructe.size();
        System.out.println(dimensiuneaListei);

    }
}
