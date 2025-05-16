package heranca;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, String sobrenome, String documento) {
        // como chamar o construtor do pai
        super(nome, sobrenome);
        cnpj = documento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getDocumentoFormatado() {
        return String.format("%s.%s.%s/%s-%s",
                cnpj.substring(0,2),
                cnpj.substring(2, 5),
                cnpj.substring(5, 8),
                cnpj.substring(8, 12),
                cnpj.substring(12));
    }

}
