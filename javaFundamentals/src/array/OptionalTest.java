package array;

import sistemabancario.Pessoa;

import java.util.Optional;

public class OptionalTest {

    // exemplo - NullPointerException
    // é quando tentamos acessar um metodo de um objeto que está nulo

    public static void main(String[] args) {
        var p = getPessoa().orElseThrow(() -> new RuntimeException("pessoa não existe"));
        imprimir(p);
    }

    static Optional<Pessoa> getPessoa() {
        return Optional.empty();
    }

    static void imprimir(Pessoa p) {
        System.out.println(p.getNome());
        System.out.println(p.getDocumento());
    }

}
