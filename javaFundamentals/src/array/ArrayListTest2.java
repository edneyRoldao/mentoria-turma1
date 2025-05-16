package array;

import sistemabancario.Pessoa;

import java.util.ArrayList;
import java.util.List;

import java.lang.String;

public class ArrayListTest2 {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("edney", "123"));
        pessoas.add(new Pessoa("caio", "456"));
        pessoas.add(new Pessoa("otavio", "789"));

        List<String> nomes = pessoas
                .stream()
                .map(item -> item.getNome())
                .toList();

        System.out.println(nomes);
    }

}
