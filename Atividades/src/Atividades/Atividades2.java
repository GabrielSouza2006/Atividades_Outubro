package Atividades;

import java.util.Scanner;

public class Atividades2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int num;
		
		System.out.println("Digite 10 n?meros: ");
		for(int x=0; x<10; x++) {
			vetor[x] = sc.nextInt(); 
			
		}
		
		System.out.println("N?meros digitados invertidos: ");
		for(int x=9; x>=0; x--) {
			System.out.println(vetor[x]);
		}
	}

}
