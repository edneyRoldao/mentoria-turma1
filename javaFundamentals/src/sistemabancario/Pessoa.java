package sistemabancario;

public class Pessoa {

    private Integer id;
    private String nome;
    private String documento;

    public Pessoa () {}

    public Pessoa(String nome, String documento) {
        this.nome  = nome;
        this.documento = documento;
    }

    public Pessoa(Integer id, String nome, String documento) {
        this.id = id;
        this.nome  = nome;
        this.documento = documento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }

}
