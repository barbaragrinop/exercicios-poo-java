public class Conta {

    private int numero;
    private String titular;
    private float saldo;

    public Conta() {
        this.numero = 0;
        this.titular = "";
        this.saldo = 0;
    }

    public int getNumero() {
        return this.numero;
    }

    public void sacar(float valor) {
        this.saldo -= valor;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "Número: " + this.numero + ", Titular: " + this.titular + ", Saldo: " + this.saldo;
    }
}