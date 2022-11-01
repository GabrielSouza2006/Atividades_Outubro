package Atividades;

import java.util.Arrays;
import java.util.Scanner;


public class Atividade5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] vet = new String[5];
		
		System.out.println("Digite 5 nomes: ");
		for(int x=0; x<5; x++) {
			vet[x] = sc.next(); 
			
		}
		
		Arrays.sort(vet);
		
		for(int i=0; i<5 ;i++) {
			System.out.println(vet[i]);
		}
		
	}
}
