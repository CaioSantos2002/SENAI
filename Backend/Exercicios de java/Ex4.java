package correcao2703;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		ArrayList<String> mercadoria = new ArrayList();
		ArrayList<Float> valores = new ArrayList();
		
		float desconto = 0;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Informe o nome da mercadoria : ");
			mercadoria.add(input.next());
			
			System.out.println("Informe o valor da mercadoria : ");
			valores.add(input.nextFloat());
			
		}
		
		System.out.println("Informe a porcentagem de desconto : ");
		desconto = input.nextFloat() / 100;
		
		System.out.println("Nome - Valor Atual - Valor com Desconto");
		
		for(int i = 0; i <= 9; i++) {
			System.out.print(mercadoria.get(i) + " - ");
			System.out.print("R$ " + valores.get(i) + " - ");
			System.out.print("R$ " + (valores.get(i) + (valores.get(i) * desconto)));
			System.out.println("");
		}
		
	}

}
