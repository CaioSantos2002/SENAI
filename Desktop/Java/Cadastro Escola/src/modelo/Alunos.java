package modelo;

public class Alunos extends Pessoas {

	private String matricula;
	private Float media;
	private String curso;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Float getMedia() {
		return media;
	}

	public void setMedia(Float media) {
		this.media = media;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
