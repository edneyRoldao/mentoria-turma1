package sistemabancario;

public class Conta {

    private int numero;
    private double saldo;
    private Pessoa pessoa; // composicao

    public Conta() {
    }

    public Conta(int numero, double saldo, Pessoa pessoa) {
        this.numero = numero;
        this.saldo = saldo;
        this.pessoa = pessoa;
    }

    // getters and setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", pessoa=" + pessoa +
                '}';
    }

}
