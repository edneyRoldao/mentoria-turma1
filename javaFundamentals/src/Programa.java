import arquivo.ContaService;

public class Programa {

    public static void main(String[] args) {

        var contaService = new ContaService();
        contaService.cadastrar("Maria", "123456", "25/12/1850", 50.0);

    }

}
