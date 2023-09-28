public class Banco {

    private int numContas;

    public Banco() {
        this.numContas = 0;
    }

    public void criarConta() {
        Conta conta = new Conta();
        this.numContas++;
    }

    public void listarContas() {
        for (int i = 0; i < this.numContas; i++) {
            System.out.println(this.contas[i]);
        }
    }

    public void realizarDeposito(int numero, float valor) {
        this.contas[numero].depositar(valor);
    }

    public void realizarSaque(int numero, float valor) {
        this.contas[numero].sacar(valor);
    }

    public void mostraSaldo(int numero) {
        System.out.println(this.contas[numero].getSaldo());
    }

    public Conta localizarConta(int numero) {
        for (int i = 0; i < this.numContas; i++) {
            if (this.contas[i].getNumero() == numero) {
                return this.contas[i];
            }
        }
        return null;
    }
}
