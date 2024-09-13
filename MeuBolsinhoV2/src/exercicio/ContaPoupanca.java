package exercicio;

public class ContaPoupanca extends Conta {

	
	private final double RENDIMENTO = 0.07;
	
	// Construtor Padrão
	public ContaPoupanca() {
		
	}
	
	// Construtor personalizado
	public ContaPoupanca(int numeroDaConta, String nomeDoTitular, int idade, double saldoDaConta) {
		super(numeroDaConta, nomeDoTitular, idade, saldoDaConta);
	}

	public double getRENDIMENTO() {
		return RENDIMENTO;
	}
	
	public void rendimentos() {
		saldoDaConta = saldoDaConta + (saldoDaConta * getRENDIMENTO());
	}
	
	@Override
	public double emprestimo(double emprestimo) {
		System.out.println("Não é possível realizar empréstimo para Conta Poupança");
		System.out.println("Seu saldo da conta é: "+getSaldoDaConta());
		return getSaldoDaConta();
	}
}
