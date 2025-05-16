package classe_object;

import java.util.Objects;

public class ContaInvestimento {

    int id;
    String nomeCorretora;
    double valorInvestido;

    public ContaInvestimento(int id, String nomeCorretora, double valorInvestido) {
        this.id = id;
        this.nomeCorretora = nomeCorretora;
        this.valorInvestido = valorInvestido;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContaInvestimento that = (ContaInvestimento) o;
        return id == that.id && Double.compare(valorInvestido, that.valorInvestido) == 0 && Objects.equals(nomeCorretora, that.nomeCorretora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeCorretora, valorInvestido);
    }

}
