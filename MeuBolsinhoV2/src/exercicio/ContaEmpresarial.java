package exercicio;

public class ContaEmpresarial extends Conta {

	private double limiteParaSaque;
	private double limiteParaEmprestimo;
	
	// Construtor padrão
	public ContaEmpresarial() {
		
	}
	// Construtor personalizado
	public ContaEmpresarial(int numeroDaConta, String nomeDoTitular, int idade, double saldoDaConta, double limiteParaSaque, double limiteParaEmprestimo) {
		super(numeroDaConta, nomeDoTitular, idade, saldoDaConta);
		this.limiteParaSaque = limiteParaSaque;
		this.limiteParaEmprestimo = limiteParaEmprestimo;
	}
	// Gets e Sets
	public double getLimiteParaSaque() {
		return limiteParaSaque;
	}

	public double getLimiteParaEmprestimo() {
		return limiteParaEmprestimo;
	}

	public void setLimiteParaSaque(double limiteParaSaque) {
		this.limiteParaSaque = limiteParaSaque;
	}
	
	public void setLimiteParaEmprestimo(double limiteParaEmprestimo) {
		this.limiteParaEmprestimo = limiteParaEmprestimo;
	}
	
	@Override
	public double emprestimo(double emprestimo) {
		if(emprestimo > 0 && emprestimo <= limiteParaEmprestimo ) {
			saldoDaConta = saldoDaConta - emprestimo - 50.00;
		}else {
			System.out.println("Valor de empréstimo inválido");
		}
		return emprestimo;
	}
	
	@Override
	public double saque(double saque) {
		if(saque > 0 && saque <= saldoDaConta && saque <= limiteParaSaque) {
			saldoDaConta = saldoDaConta - saque - 5.00;
			System.out.println("Valor sacado: "+saque);
		}else {
			System.out.println("Valor de saque inválido ou saldo insuficiente.");
		}
		return saque;
	}
	
	
}
