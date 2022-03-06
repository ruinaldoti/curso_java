package cursojava.executavel;

import javax.swing.JOptionPane;

import POO.Aluno;
import POO.Disciplina;

public class PrimeiraClasse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Qual o nome?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String cpf = JOptionPane.showInputDialog("Qual o seu cpf?");
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setCpf(cpf);
		
		for(int pos = 1; pos<=4;pos++) {
			String nomeDisplina = JOptionPane.showInputDialog("Nome da Disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover almua disciplina?");
		if(escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1,2,3 ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-1);
		}
		
		
		
		System.out.println("Aluno é :"+aluno1.getNome());
		System.out.println("A média do aluno é: "+aluno1.getMediaNota());
		System.out.println("Resultado: "+(aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2: "+aluno1.getAlunoAprovado2());

	}

}
