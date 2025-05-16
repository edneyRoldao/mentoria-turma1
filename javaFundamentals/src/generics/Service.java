package generics;

import classe_object.ContaInvestimento;

import java.util.HashMap;
import java.util.Map;

public class Service {

    public Tupla<ContaInvestimento, TipoConsulta> getContaInvestimento(int id) {
        if (id % 2 == 0) {
            System.out.println("busca realizada na B3");
            var conta = new ContaInvestimento(id, "inter", 20000);
            return new Tupla<>(conta, TipoConsulta.B3);
        } else {
            System.out.println("busca realizada na bacen");
            var conta = new ContaInvestimento(id, "inter", 20000);
            return new Tupla<>(conta, TipoConsulta.BACEN);
        }
    }

    public Map<TipoConsulta, ContaInvestimento> getContaInvestimento2(int id) {
        Map<TipoConsulta, ContaInvestimento> mapConta = new HashMap<>();

        if (id % 2 == 0) {
            System.out.println("busca realizada na B3");
            var conta = new ContaInvestimento(id, "inter", 20000);
            mapConta.put(TipoConsulta.B3, conta);
            return mapConta;
        } else {
            System.out.println("busca realizada na bacen");
            var conta = new ContaInvestimento(id, "inter", 20000);
            mapConta.put(TipoConsulta.BACEN, conta);
            return mapConta;
        }
    }

    public void getExtratoFromB3(ContaInvestimento conta) {
        System.out.println("buscando... extrato na B3");
    }

    public void getExtratoFromBacen(ContaInvestimento conta) {
        System.out.println("buscando... extrato no Bacen");
    }

}
