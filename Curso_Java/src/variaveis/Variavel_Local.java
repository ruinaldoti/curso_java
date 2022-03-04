package variaveis;

public class Variavel_Local {
	/* Variavel Global */
	static int maiorIdadeGlobal = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota1 = 30;
		int nota2 = 30;
		int nota3 = 20;
		int nota4 = 60;
		int media= 0;
		
		media= (nota1 + nota2 + nota3 + nota4)/4;
		
		/*
		if(media >=70) {
			System.out.println("Aluno Aprovado: "+ media);
		}else {
			if (media >= 40 && media <=69) {
				System.out.println("Aluno em Recuperação: "+ media);
			}
			else {
				System.out.println("Aluno Reprovado: " + media);
			}
		}
		*/
		
		/*Operadores Ternários são para micro validações*/
		
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <=69) ? "Aluno em Recuperação" : "Aluno Reprovado";
		
		System.out.println(saidaResultado);
		

	}

}
