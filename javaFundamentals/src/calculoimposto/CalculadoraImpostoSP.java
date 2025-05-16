package calculoimposto;

public class CalculadoraImpostoSP implements CalculadoraImposto {

    @Override
    public double calcularICMSProduto(double valorProduto) {
        return (valorProduto/100) * 18;
    }

}
