package calculoimposto;

public class CalculadoraImpostoGO implements CalculadoraImposto {

    @Override
    public double calcularICMSProduto(double valorProduto) {
        return (valorProduto/100) * 19;
    }

}
