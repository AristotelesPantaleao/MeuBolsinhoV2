package exercicio;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nomeDoTitular = "";
		int idade = 0;
		int numeroDaConta = 0;
		double saldoDaConta = 0.0;
		double limiteParaSaque = 0.0;
		double limiteParaEmprestimo = 0.0;
		
		
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial(0, null, 0, 0.0, 0.0, 0.0);
		ContaEmpresarial contaEmpresarial2 = new ContaEmpresarial(0, null, 0, 0.0, 0.0, 0.0);
		
		ContaPessoaFisica contaPessoaFisica = new ContaPessoaFisica(0, null, 0, 0.0, 0.0, 0.0);
		ContaPessoaFisica contaPessoaFisica2 = new ContaPessoaFisica(0, null, 0, 0.0, 0.0, 0.0);
		ContaPessoaFisica contaPessoaFisica3 = new ContaPessoaFisica(0, null, 0, 0.0, 0.0, 0.0);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(0, null, 0, 0.0);
		ContaPoupanca contaPoupanca2 = new ContaPoupanca(0, null, 0, 0.0);
		
		System.out.println("Qual o nome do titular da conta? ");
		nomeDoTitular = input.nextLine();
		
		System.out.println("Qual a sua idade?");
		idade = input.nextInt();
		
		System.out.println("Qual o número da sua conta?");
		numeroDaConta = input.nextInt();
		
		System.out.println("Qual o saldo da sua conta?");
		saldoDaConta = input.nextDouble();
		
		System.out.println("Qual o limite para saque da sua conta?");
		limiteParaSaque = input.nextDouble();
		
		System.out.println("Qual o limite para empréstimo da sua conta?");
		limiteParaEmprestimo = input.nextDouble();	
		
		contaEmpresarial = new ContaEmpresarial(numeroDaConta, nomeDoTitular, idade, saldoDaConta, limiteParaSaque, limiteParaEmprestimo);
		contaEmpresarial2 = new ContaEmpresarial(numeroDaConta, nomeDoTitular, idade, saldoDaConta, limiteParaSaque, limiteParaEmprestimo);
		
		contaPessoaFisica = new ContaPessoaFisica(numeroDaConta, nomeDoTitular, idade, saldoDaConta, limiteParaSaque, limiteParaEmprestimo);
		contaPessoaFisica2 = new ContaPessoaFisica(numeroDaConta, nomeDoTitular, idade, saldoDaConta, limiteParaSaque, limiteParaEmprestimo);
		contaPessoaFisica3 = new ContaPessoaFisica(numeroDaConta, nomeDoTitular, idade, saldoDaConta, limiteParaSaque, limiteParaEmprestimo);
		
		contaPoupanca = new ContaPoupanca(numeroDaConta, nomeDoTitular, idade, saldoDaConta);
		contaPoupanca2 = new ContaPoupanca(numeroDaConta, nomeDoTitular, idade, saldoDaConta);
		
		contaEmpresarial.deposito(1000);
		contaEmpresarial.extrato();
		
		contaEmpresarial2.saque(500);
		contaEmpresarial2.extrato();		
		
		contaPessoaFisica.emprestimo(1000);
		contaPessoaFisica.extrato();
		
		contaPessoaFisica2.saque(1500);
		contaPessoaFisica2.extrato();
		
		contaPessoaFisica3.deposito(2000);
		contaPessoaFisica3.extrato();
		
		contaPoupanca.rendimentos();
		contaPoupanca.extrato();
		
		contaPoupanca2.emprestimo(999999);
		contaPoupanca2.extrato();
		
		input.close();

	}

}
