package Atividades;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de alunos: ");
		int x = sc.nextInt();
		
		String[] nome = new String[x];
		double[] nota1 = new double[x];
		double[] nota2 = new double[x];
		double[] nota3 = new double[x];
		double[] media = new double[x];
		
		System.out.println("Digite o NOME, e depois as NOTAS: ");
		for(int i=0; i<x; i++) {
			nome[i] = sc.next();
			nota1[i] = sc.nextInt();
			nota2[i] = sc.nextInt();
			nota3[i] = sc.nextInt();
			System.out.println("-----------");
			media[i] = (nota1[i] + nota2[i] + nota3[i]) / 3;
		}
		
		for(int i=0; i<x; i++) {
			System.out.print("Nome: ");
			System.out.println(nome[i]);
			System.out.print("M�dia: ");
			System.out.println(media[i]);
		}
	}

}
