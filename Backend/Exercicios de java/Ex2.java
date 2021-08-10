package umatres;

import java.util.Scanner;

public class Ex2 {

	private static Scanner input;
	
	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		String[] mercadoria = new String[5];
		float[] valor = new float[5];
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("Informe o nome da mercadoria : ");
			mercadoria[i] = input.next();
			System.out.println("Informe o valor da mercadoria : ");
			valor[i] = input.nextFloat();
		}

		System.out.println("Produto  -  Valor atualizado");
		float valorAtualizado = 0;
		
		for(int i = 0; i <= 4; i++) {
			if(valor[i] < 1000) {
				valorAtualizado = valor[i] + (valor[i] * 0.05f);
			}else {
				valorAtualizado = valor[i] + (valor[i] * 0.07f);
			}
			
			System.out.println(mercadoria[i] + " - R$ " + valorAtualizado);
		}
 		
	}

}
