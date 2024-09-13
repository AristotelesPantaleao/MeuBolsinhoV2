package exercicio;

public class Conta {
	
	private int numeroDaConta;
	private String nomeDoTitular;
	private int idade;
	protected double saldoDaConta;
	
	// Construtor padrão
	public Conta() {
		
	}
	// Construtor personalizado
	public Conta(int numeroDaConta, String nomeDoTitular, int idade, double saldoDaConta) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		this.idade = idade;
		this.saldoDaConta = saldoDaConta;
	}
	// Gets e Sets
	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public int getIdade() {
		return idade;
	}

	public double getSaldoDaConta() {
		return saldoDaConta;
	}
	
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void saldo() {
		System.out.println("O saldo da sua conta é: R$ "+getSaldoDaConta());
	}
	
	public void deposito(double valor) {
		saldoDaConta += valor;
		System.out.println("Você depositou: R$ "+valor);
	}

	public double saque(double saque) {
		if(saque > 0 && saque <= saldoDaConta) {
			saldoDaConta -= saque;
			System.out.println("Valor sacado: "+saque);
		}else {
			System.out.println("Valor de saque inválido ou saldo insuficiente.");
		}
		return saque;
	}
	
	public double emprestimo(double emprestimo) {
		saldoDaConta -= emprestimo;
		return getSaldoDaConta();
	}
	
	public void extrato() {
		System.out.println("Nome do titular: "+getNomeDoTitular());
		System.out.println("Idade: "+getIdade());
		System.out.println("Número da conta: " + getNumeroDaConta());
		System.out.println("Saldo atual: " + getSaldoDaConta());
		System.out.println("------------------------------------");
	}
}
