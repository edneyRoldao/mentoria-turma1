package calculoimposto;

@SuppressWarnings("all")
public class ProdutoService {

    // POLIMORFISMO

    // composicao
    private CalculadoraImposto calculadora;

    public ProdutoService(CalculadoraImposto calculadora) {
        this.calculadora = calculadora;
    }

    public double getValorTotalProdutoComImposto(double valorProduto, int qtd) {
        var valorTotalSemImposto = valorProduto * qtd;
        var valorImposto = calculadora.calcularICMSProduto(valorTotalSemImposto);
        var valorTotalComImposto = valorTotalSemImposto + valorImposto;
        return valorTotalComImposto;
    }

}
