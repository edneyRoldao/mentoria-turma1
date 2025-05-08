package array;

import sistemabancario.Conta;
import sistemabancario.Pessoa;

import java.util.ArrayList;
import java.util.List;

// conseguimos derivar um array com os dados da lista principal, ou seja,
// podemos extrair as pessoas que estão na lista de contas
public class ExemploMap {

    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta(1, 1000, new Pessoa(10, "edney", "1234")));
        contas.add(new Conta(2, 500, new Pessoa(10, "Joao", "5678")));

        List<Pessoa> pessoas = contas
                .stream()
                .map(itemDoArray -> itemDoArray.getPessoa())
                .toList();

        System.out.println(pessoas);

    }

}
