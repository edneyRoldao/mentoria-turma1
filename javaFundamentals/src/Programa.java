import arquivo.CaixaService;
import arquivo.ContaService;

public class Programa {

    public static void main(String[] args) {

        // todo - testar o saque
        // todo - debugar saque
        // todo - gerar novo arquivo no chatGPT com saldo correto

        var caixaService = new CaixaService();
        caixaService.deposito(10000, 15.0);

//        caixaService.saquar(10000, 10.0);


//        var contaService = new ContaService();
//        contaService.cadastrar("Maria", "123456", "25/12/1850", 50.0);

    }

}
