package poo.classeContaBancaria;

public class Main {
	private String nomeTitular;
    private int agencia;
    private int conta;
    private float saldo;
    private String tipoConta;
    private String funcaoConta;

    public void ContaBancaria() {

        this.nomeTitular = "Luisa Melo";
        this.agencia = 3941;
        this.conta = 8244561-4;
        this.saldo = 1200f;
        this.tipoConta = "Conta corrente";
        this.funcaoConta = "Débito";
    }

    public void imprimirSaldo() {
        System.out.println("Saldo da conta: " + saldo);
    }

    public void statusConta() {
        
        if (saldo < 0) {
            System.out.println("Conta está negativada.");
        } else
            System.out.println("Conta está positiva.");
    }

    public void informacoesConta() {
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Agência da conta: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Função da conta: " + funcaoConta + "\n");
    }

}
