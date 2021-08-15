package visao;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Alunos;
import modelo.Funcionarios;
import modelo.Professores;

public class MainMenu {

	static Scanner leia = new Scanner(System.in);
	static int menu = 0, subMenu, i, posicao;

	static Alunos aluno;
	static Professores professor;
	static Funcionarios funcionario;

	static ArrayList<Alunos> alunos1 = new ArrayList<>();
	static ArrayList<Professores> professores1 = new ArrayList<>();
	static ArrayList<Funcionarios> funcionarios1 = new ArrayList<>();

	public static boolean cadastro() {
		subMenu = 0;
		System.out.println("Digite a opção: 1.Aluno 2.Professor 3.Funcionario");
		subMenu = leia.nextInt();
		if (subMenu == 1) {
			System.out.println("Digite os campos abaixo para o aluno:");
			System.out.println("Nome Data de Nascimento Sexo Documento");
			aluno = new Alunos();
			aluno.setNome(leia.next());
			aluno.setDataNascimento(leia.next());
			aluno.setSexo(leia.next());
			aluno.setDocumento(leia.next());
			System.out.println("Informe a matrícula do aluno:");
			aluno.setMatricula(leia.next());
			System.out.println("Informe a media:");
			aluno.setMedia(leia.nextFloat());
			System.out.println("Informe o curso:");
			aluno.setCurso(leia.next());
			alunos1.add(posicao, aluno);
			return true;
		} else if (subMenu == 2) {
			System.out.println("Digite os campos abaixo para o professor:");
			System.out.println("Nome Data de Nascimento Sexo Documento");
			professor = new Professores();
			professor.setNome(leia.next());
			professor.setDataNascimento(leia.next());
			professor.setSexo(leia.next());
			professor.setDocumento(leia.next());
			System.out.println("Informe a disciplina do professor:");
			professor.setDisciplina(leia.next());
			professores1.add(professor);
			return true;
		} else if (subMenu == 3) {
			System.out.println("Digite os campos abaixo para o funcionario:");
			System.out.println("Nome Data de Nascimento Sexo Documento");
			funcionario = new Funcionarios();
			funcionario.setNome(leia.next());
			funcionario.setDataNascimento(leia.next());
			funcionario.setSexo(leia.next());
			funcionario.setDocumento(leia.next());
			System.out.println("Informe o salario do funcionario:");
			funcionario.setSalario(leia.nextFloat());
			System.out.println("Informe a carga horaria do funcionario:");
			funcionario.setCargaHoraria(leia.nextFloat());
			funcionarios1.add(funcionario);
			return true;
		} else {
			return false;
		}
	}

	public static void consulta(int opcao) {
		i = 0;
		if (opcao == 1) {
			System.out.println("Num\tNome\tData de Nascimento\tSexo\tDocumento\tMatricula\tMedia\tCurso");
			for (Alunos a : alunos1) {
				System.out.print(i + "\t");
				i++;
				System.out.print(a.getNome() + "\t");
				System.out.print(a.getDataNascimento() + "\t");
				System.out.print(a.getSexo() + "\t");
				System.out.print(a.getDocumento() + "\t");
				System.out.print(a.getMatricula() + "\t");
				System.out.print(a.getMedia() + "\t");
				System.out.print(a.getCurso() + "\n");

			}
		} else if (opcao == 2) {
			System.out.println("Num\tNome\tData de Nascimento\tSexo\tDocumento\tDisciplina");
			for (Professores p : professores1) {
				System.out.print(i + "\t");
				i++;
				System.out.print(p.getNome() + "\t");
				System.out.print(p.getDataNascimento() + "\t");
				System.out.print(p.getSexo() + "\t");
				System.out.print(p.getDocumento() + "\t");
				System.out.print(p.getDisciplina() + "\n");
			}
		} else if (opcao == 3) {
			System.out.println("Num\tNome\tData de Nascimento\tSexo\tDocumento\tSalario\tCarga Horaria");
			for (Funcionarios f : funcionarios1) {
				System.out.print(i + "\t");
				i++;
				System.out.print(f.getNome() + "\t");
				System.out.print(f.getDataNascimento() + "\t");
				System.out.print(f.getSexo() + "\t");
				System.out.print(f.getDocumento() + "\t");
				System.out.print(f.getSalario() + "\t");
				System.out.print(f.getCargaHoraria() + "\n");

			}
		}
	}

	public static boolean alteracao(int opcao) {
		if (opcao == 1) {
			consulta(opcao);
			System.out.println("Digite a posição do aluno a ser alterada:");
			posicao = leia.nextInt();
			System.out.println("Digite os campos abaixo para o aluno:");
			System.out.println("Nome Data de Nascimento Sexo Documento");
			aluno = new Alunos();
			aluno.setNome(leia.next());
			aluno.setDataNascimento(leia.next());
			aluno.setSexo(leia.next());
			aluno.setDocumento(leia.next());
			System.out.println("Informe a matrícula do aluno:");
			aluno.setMatricula(leia.next());
			System.out.println("Informe a media:");
			aluno.setMedia(leia.nextFloat());
			System.out.println("Informe o curso:");
			aluno.setCurso(leia.next());
			alunos1.remove(posicao);
			alunos1.add(posicao, aluno);
			return true;
		} else if (opcao == 2) {
			consulta(opcao);
			System.out.println("Digite a posição do professor a ser alterada:");
			posicao = leia.nextInt();
			System.out.println("Digite os campos abaixo para o Professor:");
			System.out.println("Nome Data de Nascimento Sexo Documento");
			professor = new Professores();
			professor.setNome(leia.next());
			professor.setDataNascimento(leia.next());
			professor.setSexo(leia.next());
			professor.setDocumento(leia.next());
			System.out.println("Informe a disciplina do professor:");
			professor.setDisciplina(leia.next());
			professores1.remove(posicao);
			professores1.add(professor);
			return true;
		} else if (opcao == 3) {
			consulta(opcao);
			System.out.println("Digite os campos abaixo para o Funcionario:");
			System.out.println("Nome Data de Nascimento Sexo Documento");
			funcionario = new Funcionarios();
			funcionario.setNome(leia.next());
			funcionario.setDataNascimento(leia.next());
			funcionario.setSexo(leia.next());
			funcionario.setDocumento(leia.next());
			System.out.println("Informe o salario do funcionario:");
			funcionario.setSalario(leia.nextFloat());
			System.out.println("Informe a carga horaria do funcionario:");
			funcionario.setCargaHoraria(leia.nextFloat());
			funcionarios1.remove(posicao);
			funcionarios1.add(funcionario);
			return true;
		} else {
			return false;
		}
	}

	public static boolean exclusao(int opcao) {
		consulta(opcao);
		if (opcao == 1) {
			System.out.println("Digite a posição do Aluno a ser excluido na lista:");
			alunos1.remove(leia.nextInt());
			return true;
		} else if (opcao == 2) {
			System.out.println("Digite a posição do professor a ser excluido na lista:");
			professores1.remove(leia.nextInt());
			return true;
		} else if (opcao == 3) {
			System.out.println("Digite a posição do funcionario a ser excluido na lista:");
			funcionarios1.remove(leia.nextInt());
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		while (menu != 5) {
			System.out.println("\n\n1.Cadastro\n2.Consulta\n3.Alteração\n4.Exclusão\n5.Fim\n\n");
			menu = leia.nextInt();
			switch (menu) {
			case 1:
				if (cadastro()) {
					System.out.println("Pessoa cadastrada com sucesso.");
				} else {
					System.out.println("Opção invalida.");
				}
				break;
			case 2:
				System.out.println("Digite a opção: 1.Aluno 2.Professor 3. Funcionario");
				consulta(leia.nextInt());
				break;
			case 3:
				System.out.println("Digite a opção: 1.Aluno 2.Professor 3. Funcionario");
				if (alteracao(leia.nextInt())) {
					System.out.println("Pessoa alterada com sucesso.");
				} else {
					System.out.println("Erro ao alterar a pessoa");
				}
				break;
			case 4:
				System.out.println("Digite a opção: 1.Aluno 2.Professor 3. Funcionario");
				if (exclusao(leia.nextInt())) {
					System.out.println("Pessoa excluida com sucesso");
				} else {
					System.out.println("Erro ao excluir pessoa");
				}
				break;
			case 5:
				System.out.println("Falou");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}

}
