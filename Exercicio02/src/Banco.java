import java.util.ArrayList;

public class Banco {
    private int numContas;

    public void setNumContas(int numContas){
        this.numContas = numContas;
    }

    public int getNumContas(){
        return this.numContas;
    }

    public void criarConta(){
        numContas++;
    }

    public void listarContas(){}
    public void realizarDeposito(){}
    public void realizarSaque(){}
    public void localizarConta(){}


}

