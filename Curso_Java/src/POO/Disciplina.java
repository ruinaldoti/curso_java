package POO;

import java.util.Objects;

public class Disciplina {
	
	private String Disciplina;
	private double nota;
	
	
	
	
	public Disciplina() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getDisciplina() {
		return Disciplina;
	}




	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}




	public double getNota() {
		return nota;
	}




	public void setNota(double nota) {
		this.nota = nota;
	}




	@Override
	public String toString() {
		return "Disciplina [Disciplina=" + Disciplina + ", nota=" + nota + "]";
	}




	@Override
	public int hashCode() {
		return Objects.hash(Disciplina, nota);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(Disciplina, other.Disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	

	}
