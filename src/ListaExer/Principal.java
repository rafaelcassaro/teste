package ListaExer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import ListaExerEntities.entities;
import java.util.stream.Collectors;


public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employes will be registered ?");
		int qnt = sc.nextInt();
		
		List<entities> dados = new ArrayList<>();
		
		for(int i =0 ; i<qnt; i++) {
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			
			System.out.println("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Salary: ");
			Double salario = sc.nextDouble();
			
			dados.add(new entities(id,nome,salario));
			
		}
		
		for(entities jef : dados) {
			System.out.println(jef);
		}
		
		
		
		
		sc.close();
		


	}

}
