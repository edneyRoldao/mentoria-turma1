package heranca;

public class PessoaFisica extends Pessoa {

    private String cpf;


    public PessoaFisica(String nome, String sobrenome, String documento) {
        // como chamar o construtor do pai
        super(nome, sobrenome);
        cpf = documento;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getDocumentoFormatado() {
        return String.format("%s.%s.%s-%s",
                cpf.substring(0,3),
                cpf.substring(3, 6),
                cpf.substring(6, 9),
                cpf.substring(9));
    }

    @Override
    public String getNomeCompleto() {
        return String.format("SUB_CLASS PessoaFisica: %s %s", nome, sobrenome);
    }

}
