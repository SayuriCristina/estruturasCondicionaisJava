package aprendendocondicionais;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite dois números:");
		
		int numero1 = read.nextInt();
		read.nextLine();
		int numero2 = read.nextInt();
		read.nextLine();
		
		
		System.out.println("Selecione uma opção:");
		        System.out.println("*** 1 - Somar os numeros ***");
		        System.out.println("*** 2 - Subtrair os numeros ***");
		        System.out.println("*** 3 - Multiplicar os numeros ***");
		        System.out.println("*** 4 - Dividir o primeiro pelo segundo ***");
		        
		int opcao = read.nextInt(); 
		read.close();
		
		switch(opcao) {
		case 1:
			System.out.println(numero1 + numero2);
			break;
			
		case 2:
			if(numero1 > numero2) {
				System.out.println(numero1 - numero2);
			} else {
				System.out.println(numero2 - numero1);
			}
			break;
			
		case 3:
			System.out.println(numero1 * numero2);
			if ((numero1 * numero2) % 2 == 0) {
				System.out.printf("O número é par.");
			} else {
				System.out.println("O número é ímpar.");
			}
			break;
			
		case 4: 
			if (numero2 == 0) {
				System.out.println("Não dá pra dividir por 0.");
			} else {
				System.out.println(numero1 / numero2 + " com resto " + numero1 % numero2);
			}
			break;
			
		default: 
			System.out.println("Por favor, selecione uma opção válida.");
		}
		
		 
	}

}
