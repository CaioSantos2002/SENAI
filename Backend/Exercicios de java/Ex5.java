package correcao2703;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		ArrayList<String> indice = new ArrayList();
		ArrayList<String> nome = new ArrayList();
		ArrayList<String> dia = new ArrayList();
		ArrayList<Integer> mes = new ArrayList();
		ArrayList<Float> valor = new ArrayList();
		
		int opcao = 0;
		
		do {
			
			System.out.println("1 - Cadastrar Compra");
			System.out.println("2 - Listar Aluno");
			System.out.println("3 - Total");
			System.out.println("0 - Sair");
			
			System.out.println("Escolha um opcao : ");
			opcao = input.nextInt();
			
			switch(opcao) {
				case 1:
					
					System.out.println("Informe o nome do aluno : ");
					String busca = input.next();
					
					if(!indice.contains(busca)) {
						indice.add(busca);
					}
					
					nome.add(busca);
					
					System.out.println("Informe o valor do pedido : ");
					valor.add(input.nextFloat());
					
					System.out.println("Informe o dia : ");
					dia.add(input.next());
					
					System.out.println("Informe o mes : ");
					mes.add(input.nextInt());
					
					break;
					
				case 2:
					
					System.out.println("Informe o nome do aluno : ");
					busca = input.next();
					float total = 0;
					
					if(indice.contains(busca)) {
						
						for(int i = 0; i < nome.size(); i++) {
							if(nome.get(i).equals(busca)) {
								int index = nome.indexOf(busca);
								total += valor.get(i);
							}
						}
						
						System.out.println("Aluno " + busca);
						System.out.println("Total R$ " + total);
						
					}else {
						
						System.out.println("O Aluno nao fez nenhuma compra");
						
					}
					
					break;
					
				case 3:
					
					float subtotal = 0;
					total = 0;
					
					for(int i = 0; i < indice.size(); i++) {
						
						for(int j = 0; j < nome.size(); j++) {
							
							if(indice.get(i).equals(nome.get(j))) {
								subtotal += valor.get(j);
							}
							
						}

						System.out.print(indice.get(i) + "	");
						System.out.print("R$ " + subtotal);
						System.out.println("");
						
						total += subtotal;
						subtotal = 0;
						
					}
					
					System.out.println("Total	R$ " + total);
					
					break;
				case 0:
					System.out.println("Obrigado !");
					break;
				default:
					System.out.println("Opcao Invalida");
					break;
			}
			
		}while(opcao != 0);
		
	}
	
}
