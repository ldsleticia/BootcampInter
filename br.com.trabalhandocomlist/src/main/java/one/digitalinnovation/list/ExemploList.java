package one.digitalinnovation.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();

        nomes.add("Amora");
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        for (String nomeDoItem: nomes){
            System.out.println(nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
