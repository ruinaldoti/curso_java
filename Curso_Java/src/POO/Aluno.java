package POO;

/*Esta � a nossa classe/objeto que representa o Aluno*/
public class Aluno {
	
	private String nome;
	private int idade;
	private String dataNasc;
	private String registroGeral;
	private String cpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private int numMatricula;
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	
	public Aluno() {
		
	}
	
	public double getMediaNota() {
		double media = (nota1 + nota2 + nota3 +nota4)/4;
		return media;
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media>= 7.0) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media>= 7.0) {
			return "Aluno Aprovado";
		}else {
			return "Aluno Reprovado";
		}
	}
	
	public double getNota1() {
		return nota1;
	}



	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}



	public double getNota2() {
		return nota2;
	}



	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}



	public double getNota3() {
		return nota3;
	}



	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}



	public double getNota4() {
		return nota4;
	}



	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	
	
	
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", nota3=" + nota3 + ", nota4=" + nota4 + "]";
	}
	
	
	
	
	
	

}
