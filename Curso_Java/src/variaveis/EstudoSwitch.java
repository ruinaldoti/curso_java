package variaveis;

public class EstudoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota1 = 85;
		int nota2 = 90;
		int nota3 = 95;
		int nota4 = 90;
		int media= 0;
		
		media= (nota1 + nota2 + nota3 + nota4)/4;
		
		int dia =  1;
		switch(dia){
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		
		default: System.out.println("Outro dia qualquer");
		}
	}

}
