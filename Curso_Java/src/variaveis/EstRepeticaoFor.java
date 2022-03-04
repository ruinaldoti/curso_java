package variaveis;

public class EstRepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		for(int num = 0; num <=10 ;num++ ) {
			System.out.println("Numero atual é: "+num);
		}
		
		System.out.println("------------------------");
		
		for(int num = 10; num >= 0 ;num-- ) {
			System.out.println("Numero atual é: "+num);
		}
		*/
		/*Estrutura de for com break*/
		/*
		for(int num = 10; num >= 0 ;num-- ) {
			if(num == 7 ) {
				System.out.println("Encontrei o numero procurado");
				break;
			}
			System.out.println("Numero atual é: "+num);
		}
		
		*/
		/*Estrutura de for e Continue*/
		
		for(int num = 10; num >= 0 ;num-- ) {
			if(num == 7 || num == 5 || num == 1) {
				System.out.println("Encontrei o numero procurado: "+num);
				System.out.println("Numero atual é: "+num);
				continue;
			}
			
			
		}
	}

}
