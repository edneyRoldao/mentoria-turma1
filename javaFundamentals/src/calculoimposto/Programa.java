package calculoimposto;

public class Programa {

    public static void main(String[] args) {
        double valorProduto = 100;
        int quantidade = 3;

        ProdutoService produtoService = new ProdutoService(new CalculadoraImpostoGO());
        var total = produtoService.getValorTotalProdutoComImposto(valorProduto, quantidade);
        System.out.println(total);

    }

}
