// Conta possui uma agencia, um numero, um saldo e um cliente

public class Conta{

    // atributos
    private int agencia_da_conta;
    private int numero_da_conta;
    private double saldo_da_conta;
    private Cliente cliente_da_conta;

    // metodos
    public Conta(int num_agencia, int num_conta, Cliente cliente){ // construtor
        this.agencia_da_conta = num_agencia;
        this.numero_da_conta = num_conta;
        this.cliente_da_conta = cliente;
        this.saldo_da_conta = 0;
    }

    public void setAgencia(int num_agencia){ // setter agencia
        this.agencia_da_conta = num_agencia;
    }

    public int getAgencia(){ // getter agencia
        return this.agencia_da_conta;
    }

    public void setNumero(int num_conta){ // setter numero da conta
        this.numero_da_conta = num_conta;
    }

    public int getNumero(){ // getter numero da conta
        return this.numero_da_conta;
    }

    public void depositar(double valor){ // setter saldo
        this.saldo_da_conta += valor;
    }

    public void sacar(double valor){
        this.saldo_da_conta -= valor;
    }

    public double consultarSaldo(){ // getter saldo
        return this.saldo_da_conta;
    }

}