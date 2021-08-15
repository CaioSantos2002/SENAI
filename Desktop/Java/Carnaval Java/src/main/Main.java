package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;
		
		Scanner input = new Scanner (System.in);
		
		do{
			System.out.println("Escolha uma opção : ");
			System.out.println("1 - Exercicio 1");
			System.out.println("2 - Exercicio 2");
			System.out.println("3 - Exercicio 3");
			System.out.println("4 - Exercicio 4");
			System.out.println("0 - Finalizar");
			
			
		opcao = input.nextInt();
		
		switch(opcao) {
		case 1:
			//Exercicio 1
			float valorHora = 5.625f;
			float valorHextra = valorHora + (valorHora * 0.75f);
			
			System.out.println("Informe as horas trabalhadas :");
			float horaTrabalhada = input.nextFloat();
			
			System.out.println("Informe as horas extras trabalhadas :");
			float horaEtrabalhada = input.nextFloat();
			
			float salario = valorHora * horaTrabalhada;
			
			float salarioE = valorHextra * horaEtrabalhada;
			
			System.out.printf("O salário reajustado é de : R$" + "%.2f \r\n", (salario+salarioE));
			
			break;
			
		case 2:
			//Exercicio 2
			String[] escolas = new String[5];
			int[] bateria = new int[5];
			int[] sambaenredo = new int[5];
			int[] fantasia = new int[5];
			
			for(int i = 0; i < 5; i++) {
				
				System.out.println("Informe o nome da escola :");
				escolas[i] = input.next();
				
				System.out.println("Informe a nota da bateria :");
				bateria[i] = input.nextInt();
				
				System.out.println("Informe a nota do samba-enredo :");
				sambaenredo[i] = input.nextInt();
				
				System.out.println("Informe a nota da fantasia :");
				fantasia[i] = input.nextInt();
			}
			
			String campea = "";
			float media = 0;
			float mediat = 0;
			
			for(int i = 0; i < 5 ; i++) {
				
				System.out.println("Escola " + escolas[i]);
				mediat =(float)((bateria[i] + sambaenredo[i] + fantasia[i]) / 3); 
				
				if( mediat > media ){
					campea = escolas[i];
					media = mediat;
				}
				System.out.println("Media " + mediat);
				
			}
			
			System.out.println("Escola campeã : " + campea);
			break;
			
		case 3:
			//Exercicio 3
			String[] material = {"Lantejola", "Pena", "Seda"};
			int[] peso = new int[3];
			float[] valor = new float[3];
			float[] valorEstimado = new float[3];
			
			for(int i = 0; i < 3; i++) {
				
				System.out.println("Material " + material[i]);
				
				System.out.println("Informe o peso comprado : ");
				peso[i] = input.nextInt();
				
				System.out.println("Informe o preço do kg : ");
				valor[i] = input.nextFloat();
				
				System.out.println("Informe o valor estimado : ");
				valorEstimado[i] = input.nextFloat();
			}
			
			for(int i = 0; i <= 2; i++) {
				
				float val = peso[i] * valor[i];
				
				if(val > valorEstimado[i]) {
					System.out.println("Material : " + material[i]);
					System.out.println("Valor Gasto : " + val);
					System.out.println("Valor Estimado : " + valorEstimado[i]);
					System.out.println("Deficit: " + (valorEstimado[i] - val));
				}
			}
			break;
			
		case 4:
			//Exercicio 4
			String[] bloco = {"Comissão de frente", "Abre-Alas", "Ala das Baianas", "Carros Alegoricos",
					"Mestre Sala e Porta Bandeira", "Bateria",
					"Rainha de bateria", "Recuo da bateria"};
			
			float porcentagem[] = {0.15f, 0.05f, 0.15f, 0.20f,
									0.03f, 0.20f, 0.02f, 0.20f};
			
			System.out.println("Informe o total de participantes :");
			int participantes = input.nextInt();
			
			for(int i = 0; i < bloco.length; i++) {
				System.out.println("Bloco " + bloco[i] + " : "
											+ (participantes * porcentagem[i]));
			}
			
			break;
			
		}
		
		
		
		
		
		
		}while(opcao != 0);

	}

}
