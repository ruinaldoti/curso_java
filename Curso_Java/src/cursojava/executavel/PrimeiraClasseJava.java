package cursojava.executavel;

import javax.swing.JOptionPane;

import POO.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Qual o nome?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String cpf = JOptionPane.showInputDialog("Qual o seu cpf?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota de AV1");
		String nota2 = JOptionPane.showInputDialog("Qual a nota de AV2");
		String nota3 = JOptionPane.showInputDialog("Qual a nota de AV3");
		String nota4 = JOptionPane.showInputDialog("Qual a nota de AV4");
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setCpf(cpf);
		
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		/*
		System.out.println("Aluno é :"+aluno1.getNome());
		System.out.println("A média do aluno é: "+aluno1.getMediaNota());
		System.out.println("Resultado: "+(aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2: "+aluno1.getAlunoAprovado2());
		*/
		
		System.out.println(aluno1.toString()); //Descrição do objeto na memoria
		System.out.println("Media do Aluno = "+aluno1.getMediaNota());
		System.out.println("Resultados: "+aluno1.getAlunoAprovado2());
		
		
		
		
	
		
		

	}

}
