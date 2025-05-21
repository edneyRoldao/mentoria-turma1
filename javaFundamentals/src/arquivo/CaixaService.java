package arquivo;

import dominio.Linha;
import dominio.Operacao;

import java.util.List;

public class CaixaService {

    private final ArquivoService arquivoService = new ArquivoService();

    public void saquar(Integer numeroConta, Double valor) {
        List<Linha> eventosConta = arquivoService.getLinhasPorNumeroConta(numeroConta);
        if (eventosConta.isEmpty()) throw new IllegalArgumentException("conta nao existe");

        var saldo = calcularSaldo(eventosConta);

        if (valor > saldo) throw new RuntimeException("saldo insulficiente");

        var eventoSaque = Linha.createLinhaSaque(numeroConta, valor);
        arquivoService.adicionarOperacaoArquivo(eventoSaque, Operacao.SAQUE);
    }

    public double calcularSaldo(List<Linha> eventos) {
        var eventoCadastro = eventos
                .stream()
                .filter(linha -> linha.getCodigoOperacao().equals("CADASTRO"))
                .findAny()
                .orElse(new Linha());

        var eventosDeposito = eventos
                .stream()
                .filter(linha -> linha.getCodigoOperacao().equals("DEPOSITO"))
                .toList();

        var eventosSaque = eventos
                .stream()
                .filter(linha -> linha.getCodigoOperacao().equals("SAQUE"))
                .toList();

        var saldoInicial = eventoCadastro.getSaldo();

        var totalDepositos = eventosDeposito
                .stream()
                .map(Linha::getValor)
                .reduce(0.0, Double::sum);

        var totalSaques = eventosSaque
                .stream()
                .map(Linha::getValor)
                .reduce(0.0, Double::sum);

        return (saldoInicial + totalDepositos) - totalSaques;
    }

}
