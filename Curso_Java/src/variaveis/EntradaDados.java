package variaveis;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String carros = JOptionPane.showInputDialog("Informe a quantidade de Carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de Pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"Divis�o para pessoas deu "+divisao);
		}else {
			System.out.println("N�o quis ver o resultado!!");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divis�o?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"o resto da divis�o � "+resto);
		}else {
			System.out.println("N�o quis ver o resultado!!");
		}
		
		
		
	}

}
