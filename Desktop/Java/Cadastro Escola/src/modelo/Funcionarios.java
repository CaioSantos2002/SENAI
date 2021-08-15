package modelo;

public class Funcionarios extends Pessoas {

	private Float salario;
	private Float cargaHoraria;

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public Float getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Float cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}
