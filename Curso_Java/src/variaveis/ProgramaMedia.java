package variaveis;

import javax.swing.JOptionPane;

public class ProgramaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nota1 = JOptionPane.showInputDialog("Informa e nota de AV 1");
		String nota2 = JOptionPane.showInputDialog("Informa e nota de AV 2");
		String nota3 = JOptionPane.showInputDialog("Informa e nota de AV 3");
		String nota4 = JOptionPane.showInputDialog("Informa e nota de AV 4");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 +dNota2 +dNota3+dNota4)/4;
		
		if(media >=50) {
			if(media >=70) {
				JOptionPane.showMessageDialog(null, "Aluno está APROVADO com media de: "+media);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno está de RECUPERAÇÃO com média de "+media);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno foi REPROVADO com nota"+media);
		}
		
	}

}
