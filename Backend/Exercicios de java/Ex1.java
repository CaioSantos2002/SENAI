package umatres;

import java.util.Scanner;

public class Ex1 {

	private static Scanner input;
	
	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		String[] nomes = new String[5];
		float[] salarios = new float[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Insira o nome : ");
			nomes[i] = input.next();
			System.out.println("Informe o salário :");
			salarios[i] = input.nextFloat();
		}
		
		System.out.println("Informe a taxa de reajuste :");
		float reajuste = input.nextInt();//

		System.out.println("Nome - Salario Atual - Salario Reajustado");
		float atual = 0;
		
		for(int i = 0; i < 5; i++) {
			atual = salarios[i] + (salarios[i] * (reajuste/100));
			System.out.println(nomes[i] + " - " + salarios[i]  + " - " + atual);
		}
				
	}

}
