package Atividades;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nome = new String[5];
		String[] email = new String[5];
		int[] idade = new int[5];
		
		System.out.println("Digite primero o nome, depois email e idade: ");
		for(int x=0; x<5; x++) {
			nome[x] = sc.next(); 
			email[x] = sc.next();
			idade[x] = sc.nextInt();
		}
		
		System.out.println();
		
		for(int i=0; i<5 ;i++) {
			System.out.println("Pessoa #" + (i+1));
			System.out.print("Nome: ");
			System.out.println(nome[i]);
			System.out.print("email: ");
			System.out.println(email[i]);
			System.out.print("Idade: ");
			System.out.println(idade[i]);
		}
	}

}
