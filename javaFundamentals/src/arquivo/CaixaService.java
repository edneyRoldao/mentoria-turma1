package arquivo;

import dominio.Linha;

import java.util.List;

public class CaixaService {

    private final ArquivoService arquivoService = new ArquivoService();

    public void saquar(Integer numeroConta, Double valor) {
        List<Linha> conta = arquivoService.getLinhasPorNumeroConta(numeroConta);
        if (conta.isEmpty()) throw new IllegalArgumentException("conta nao existe");


    }

    public double calcularSaldo(List<Linha> eventos) {
        Linha eventoCadastro = eventos
                .stream()
                .filter(linha -> isLinhaOperacaoCadastro(linha))
                .findAny()
                .get();

        /*\
            achar o saldo
            1 - achar saldo inicial
            2 - achar todos os depositos
            3 - somar saldo inicial + todos os depositos
            4 - achar saques
            5 - achar transferencias
            6 - somar saques + transferencias
            7 - saldo = (passo 3 - passo 7)
        */

        return 0.0;
    }

    private boolean isLinhaOperacaoCadastro(Linha linha) {
        return linha.getCodigoOperacao().equals("CADASTRO");
    }

}
