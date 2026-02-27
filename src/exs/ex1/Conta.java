package exs.ex1;

public class Conta {

    public int numeroConta;
	public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor){
        if(this.status){
            this.saldo += valor;
            System.out.println("Deposito concluido!");
        }
    }

    public void sacar(float valor){
        if(this.status && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado!");
        } else if(this.saldo < valor){
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("conta inativa");
        }
    }

    public void encerrarConta(){
        if(this.saldo > 0){
            System.out.println("Saque o valor antes de encerrar sua conta.");
        } else {
            this.status = false;
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    public String toString(){
        return " \n Numero da conta: " + this.numeroConta +
                "\n Agencia: " + this.agencia +
                "\n Nome do cliente: " + this.nomeCliente +
                "\n Saldo: " + this.saldo +
                "\n Status: " + (this.status ? "Ativo" : "Conta encerrada\n");
    }
}
