package array;

import sistemabancario.Conta;
import sistemabancario.Pessoa;

import java.util.ArrayList;
import java.util.List;

// filtrando a lista
public class ExemploFilter {

    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta(1, 1000, new Pessoa(10, "edney", "1234")));
        contas.add(new Conta(2, 500, new Pessoa(20, "Joao", "5678")));
        contas.add(new Conta(3, 10000, new Pessoa(30, "Maria", "4564")));

        List<Pessoa> pessoasFiltrada = contas
                .stream()
                .filter(conta -> conta.getSaldo() >= 1000)
                .map(conta -> {
                    return conta.getPessoa();
                })
                .toList();

        System.out.println(pessoasFiltrada);

    }

}
