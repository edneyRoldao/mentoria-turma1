package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        // para adicionar
        nomes.add("maria");
        nomes.add("maria");
        nomes.add("joao");
        nomes.add("joana");
        nomes.add("pedro");

        // for in
        for (var nome : nomes) {
            System.out.println(nome);
        }

        System.out.println();

        // lambda encurtada - v1
        nomes.forEach(nome -> System.out.println(nome));

        System.out.println();

        // lambda encurtada - v2
        // filtrando um elemento na lista
        var nomeFiltrado = nomes
                .stream()
                .filter(nome -> "maria".equals(nome))
                .findAny()
                .get();

        System.out.println(nomeFiltrado);


    }

}
