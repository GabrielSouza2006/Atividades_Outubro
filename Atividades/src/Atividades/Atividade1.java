package Atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int num;
		
		System.out.println("Digite 10 n�meros: ");
		for(int x=0; x<10; x++) {
			vetor[x] = sc.nextInt(); 
			
		}
		
		System.out.println("N�meros digitados: ");
		for(int x=0; x<10; x++) {
			System.out.println(vetor[x]);
		}
	}

}
