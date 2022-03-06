package cursojava.executavel;

import javax.swing.JOptionPane;

import POO.Aluno;
import POO.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno();
		
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String cpf = JOptionPane.showInputDialog("Qual o seu cpf?");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota de AV1");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota de AV2");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota de AV3");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota de AV4");
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setCpf(cpf);
		
		
		System.out.println("Aluno é :"+aluno1.getNome());
		System.out.println("A média do aluno é: "+aluno1.getMediaNota());
		System.out.println("Resultado: "+(aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2: "+aluno1.getAlunoAprovado2());
		
		
		//System.out.println(aluno1.toString()); //Descrição do objeto na memoria
		System.out.println("Media do Aluno = "+aluno1.getMediaNota());
		System.out.println("Resultados: "+aluno1.getAlunoAprovado2());
		
		
		
		
		
	
		
		

	}

}
