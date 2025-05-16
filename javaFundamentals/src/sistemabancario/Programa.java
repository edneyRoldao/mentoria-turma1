package sistemabancario;

public class Programa {

    public static void main(String[] args) {
        var operacao = new OperacaoBancaria();
        var pessoa = new Pessoa("Joao", "123456789");
        var conta = new Conta(1, 100.00, pessoa);

        operacao.saquar(20.0, conta);
        operacao.depositar(70.0, conta);

        var pessoa2 = new Pessoa("Maria", "123455675");
        var conta2 = new Conta(2, 200.00, pessoa2);

        // Maria vai mandar 50 para Joao
        operacao.transferir(50.0, conta2, conta);

        System.out.println();
        System.out.println(conta.getPessoa().getNome() + " - " + conta.getSaldo());
        System.out.println(conta2.getPessoa().getNome() + " - " + conta2.getSaldo());
    }

}


