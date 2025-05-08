package heranca;

public abstract class Pessoa {

    protected String nome;
    protected String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public abstract String getDocumentoFormatado();

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public String formatarDocumento(String documento) {
        return formatarDocumento(documento, TipoDocumento.CPF);
    }

    public String formatarDocumento(String documento, TipoDocumento tipo) {
        if (tipo == TipoDocumento.CPF) {
            return String.format("%s.%s.%s-%s",
                    documento.substring(0,3),
                    documento.substring(3, 6),
                    documento.substring(6, 9),
                    documento.substring(9));
        } else {
            return String.format("%s.%s.%s/%s-%s",
                    documento.substring(0,2),
                    documento.substring(2, 5),
                    documento.substring(5, 8),
                    documento.substring(8, 12),
                    documento.substring(12));
        }

    }




}
