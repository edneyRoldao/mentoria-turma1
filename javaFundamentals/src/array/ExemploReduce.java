package array;

import sistemabancario.Conta;
import sistemabancario.Pessoa;

import java.util.ArrayList;
import java.util.List;

// reduce -> serve para somar os valores de uma lista
public class ExemploReduce {

    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta(1, 1000, new Pessoa(10, "edney", "1234")));
        contas.add(new Conta(2, 500, new Pessoa(20, "Joao", "5678")));
        contas.add(new Conta(3, 10000, new Pessoa(30, "Maria", "4564")));

        double total = contas
                .stream()
                .map(Conta::getSaldo)
                .reduce(10.0, (subtotal, proximo) -> subtotal + proximo);

        System.out.println(total);
    }
}
