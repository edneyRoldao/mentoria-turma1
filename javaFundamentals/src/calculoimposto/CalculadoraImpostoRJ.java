package calculoimposto;

public class CalculadoraImpostoRJ implements CalculadoraImposto {

    @Override
    public double calcularICMSProduto(double valorProduto) {
        return (valorProduto/100) * 22;
    }

}
