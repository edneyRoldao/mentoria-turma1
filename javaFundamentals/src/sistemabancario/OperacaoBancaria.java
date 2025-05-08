package sistemabancario;

public class OperacaoBancaria {

    public void saquar(double valorSaque, Conta conta) {
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("realizando saque na conta: " + conta.getNumero());

        var saldoAtualConta = conta.getSaldo();
        System.out.println("Saldo atual da conta: " + saldoAtualConta);

        var novoSaldoConta = saldoAtualConta - valorSaque;
        conta.setSaldo(novoSaldoConta);

        System.out.println("Saque realizado com sucesso. valor: " + valorSaque);
        System.out.println("Agora, o saldo atual é: " + conta.getSaldo());
    }

    public void depositar(double valorDeposito, Conta conta) {
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("realizando deposito na conta: " + conta.getNumero());

        var saldoAtualConta = conta.getSaldo();
        System.out.println("Saldo atual da conta: " + saldoAtualConta);

        var novoSaldoConta = saldoAtualConta + valorDeposito;
        conta.setSaldo(novoSaldoConta);

        System.out.println("Deposito realizado com sucesso. valor: " + valorDeposito);
        System.out.println("Agora, o saldo atual é: " + conta.getSaldo());
    }

    public void transferir(double valorTransferencia, Conta contaOrigem, Conta contaDestino) {
        System.out.println("---------------------------------");
        System.out.println(">>>> inicio Transferencia...");
        saquar(valorTransferencia, contaOrigem);
        depositar(valorTransferencia, contaDestino);
        System.out.println(">>>> fim Transferencia...");
        System.out.println("---------------------------------");
    }

}
