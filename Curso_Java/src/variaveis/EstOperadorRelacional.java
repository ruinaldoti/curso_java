package variaveis;

public class EstOperadorRelacional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota1 = 85;
		int nota2 = 90;
		int nota3 = 95;
		int nota4 = 90;
		int media= 0;
		
		media= (nota1 + nota2 + nota3 + nota4)/4;
		
		if (nota1 == nota2) {
			System.out.println("As notas s�o iguais");
		}else {
			System.out.println("As notas s�o diferentes");
		}
		
		if (nota1 != nota2) {
			System.out.println("As notas s�o diferentes");
		}else {
			System.out.println("As notas s�o iguais");
		}
		
		if (nota1 > nota2) {
			System.out.println("A nota � maior");
		}else {
			System.out.println("A nota � menor");
		}
		
		if (nota1 < nota2) {
			System.out.println("A nota � menor");
		}else {
			System.out.println("A nota � maior");
		}
	}

}
