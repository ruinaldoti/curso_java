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
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"Divisão para pessoas deu "+divisao);
		}else {
			System.out.println("Não quis ver o resultado!!");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"o resto da divisão é "+resto);
		}else {
			System.out.println("Não quis ver o resultado!!");
		}
		
		
		
	}

}
