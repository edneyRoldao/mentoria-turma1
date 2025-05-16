package generics;

import classe_object.ContaInvestimento;

public class PesquisaConta {

    private ContaInvestimento conta;
    private TipoConsulta tipoConsulta;

    public PesquisaConta(ContaInvestimento conta, TipoConsulta tipoConsulta) {
        this.conta = conta;
        this.tipoConsulta = tipoConsulta;
    }

    public ContaInvestimento getConta() {
        return conta;
    }

    public void setConta(ContaInvestimento conta) {
        this.conta = conta;
    }

    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(TipoConsulta tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
}
