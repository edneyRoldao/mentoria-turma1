import arquivo.ContaService;

public class Programa {

    public static void main(String[] args) {

        // todo - testar o saque

        var contaService = new ContaService();
        contaService.cadastrar("Maria", "123456", "25/12/1850", 50.0);

    }

}
