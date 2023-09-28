public class Main {
    public static void main(String[] args){
        Banco banco = new Banco();

        // Cria duas contas
        banco.criarConta();
        banco.criarConta();

        // Lista as contas
        banco.listarContas();

        // Realiza um depósito na primeira conta
        banco.realizarDeposito(0, 100);

    }
}