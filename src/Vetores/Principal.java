package Vetores;

import java.util.Scanner;

import VetoresEntities.Produto;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos vao ser alugados? ");
		int n = sc.nextInt();
		
		Produto[] vect = new Produto[n];
		
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Quarto alugado: " + i );
			System.out.println("Name: ");
			String nome = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Produto(nome, email,room);
		}
		
		for (int i = 0 ; i < vect.length ; i++ ) {
			
			if( vect[i] != null ) {
			System.out.println("==========");
			System.out.println("Quarto alugado: " + i );
			System.out.println("Name: ");
			vect[i].getName();
			System.out.println("Email: ");
			vect[i].getEmail();
			System.out.println("Room: ");
			vect[i].getRoom();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		


	}

}
