package BancoObj;

public class Contas {
	
	private int Conta;
	private String Titular;
	private double Saldo;
	
	public Contas(int Conta, String Titular, double Saldo) {
		this.Conta = Conta;
		this.Titular = Titular;
		this.Saldo = Saldo;
		
	}

	public int getConta() {
		return Conta;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String Titular) {
		this.Titular = Titular;
	}

	public double getSaldo() {
		return Saldo;
	}
	
	
	
	public void Deposito(double Saldo ) {
		this.Saldo += Saldo;
	}
	
	public void Saque(double Saldo) {
		this.Saldo -= Saldo + 5;
	}
	
	
	
	

}
