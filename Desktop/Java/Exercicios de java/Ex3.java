package umatres;

import java.util.Scanner;

public class Ex3 {

	private static Scanner input;
	
	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		String[] times = new String[5];
		int[] pontuacao = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o nome do time : ");
			times[i] = input.next();
			
			System.out.println("Informe o numero de vitorias : ");
			int vitorias = input.nextInt() * 3;
			System.out.println("Informe o numero de empates : ");
			int empates = input.nextInt();
			
			pontuacao[i] = vitorias + empates;
		}
		
		int compara = 0;
		String temp = "";

		System.out.println("Antes");

		for(int i = 0; i < 5; i++) {
			System.out.println(times[i] + " - " + pontuacao[i]);
		}
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {

				compara = pontuacao[i];
				temp = times[i];
				
				if(compara > pontuacao[j]) {
					pontuacao[i] = pontuacao[j];
					pontuacao[j] = compara;
					times[i] = times[j];
					times[j] = temp;
				}
			
			}
			
		}
		
		System.out.println("Depois");
		
		for(int i = 0; i < 5; i++) {
			System.out.println(times[i] + " - " + pontuacao[i]);
		}
		
	}

}
