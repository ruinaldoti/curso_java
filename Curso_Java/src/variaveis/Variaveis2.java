package variaveis;

public class Variaveis2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int nota1 = 85;
		int nota2 = 90;
		int nota3 = 95;
		int nota4 = 90;
		int media= 0;
		
		media= (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media >= 50) {
			if(media >=70 ) {
				if(media >= 90) {
					System.out.println("Parabéns você vai ganhar um computador!");
				}
				else {
					System.out.println("Aluno está aprovado direto");
				}
				
			}else {
				System.out.println("Aluno está em recuperação");
			}
		}else {
			System.out.println("Aluno Reprovado");
		}

	}

}
