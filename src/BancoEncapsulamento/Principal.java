package BancoEncapsulamento;

import java.util.Scanner;
import BancoObj.Contas;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CONTA NOVA");
		System.out.println("Entre com o numero da conta: ");
		int Conta = sc.nextInt();
		System.out.println("Entre com o nome da conta: ");
		String Nome = sc.next();
		System.out.println("Deposito inicial ? (Y / N) ");
		char resposta = sc.next().charAt(0);
		double Saldo = 0;
		
		if (resposta == 'Y') {
			System.out.println("Digite o valor do deposito: ");
			Saldo = sc.nextDouble();
		}
		
		Contas conta = new Contas(Conta, Nome , Saldo);

		
		System.out.println("Dados da conta: \n Conta: " + conta.getConta() + " |Holder: "+ conta.getTitular() + " |Balance " + conta.getSaldo() );
		
		System.out.println("Enter a deposit value: ");
		Saldo = sc.nextDouble();
		conta.Deposito(Saldo);
		System.out.println("Dados da conta: \n Conta: " + conta.getConta() + " |Holder: "+ conta.getTitular() + " |Balance " + conta.getSaldo() );
		
		System.out.println("Enter a Withdraw value: ");
		Saldo = sc.nextDouble();
		conta.Saque(Saldo);
		System.out.println("Dados da conta: \n Conta: " + conta.getConta() + " |Holder: "+ conta.getTitular() + " |Balance " + conta.getSaldo() );
		
	
		sc.close();	
	}

}
