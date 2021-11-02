package Dolar;

import java.util.Scanner;

import Dolar_Math.Calculos;

public class principal {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		double valor;
		
		System.out.println("Qual o preço do Dolar? " + Calculos.DOLAR);
		System.out.println("Quanto vai comprar? \n: ");
		valor = sc.nextDouble();
		System.out.println("Valor pago em reais = " + Calculos.Conversao(valor));
		
		
		sc.close();
		
		
		

	}

}
