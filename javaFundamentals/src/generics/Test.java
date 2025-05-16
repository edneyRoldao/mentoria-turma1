package generics;

public class Test {

    public static void main(String[] args) {
        int idConta = 2;
        Service service = new Service();
        var tupla = service.getContaInvestimento(idConta);

        // todo - buscar extrato B3 ou BACEN
        if (tupla.getObj2().equals(TipoConsulta.B3)) {
            service.getExtratoFromB3(tupla.getObj1());
        } else {
            service.getExtratoFromBacen(tupla.getObj1());
        }

    }

}
