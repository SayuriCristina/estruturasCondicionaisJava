package aprendendocondicionais;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		int numero = read.nextInt();
		read.nextLine();
		
		if((numero % 2 == 0) && numero > 0) {
			System.out.printf("O Número %d é par e positivo!", numero);
			
		} else if ((numero % 2 == 0) && numero < 0){
			System.out.printf("O Número %d é par e negativo!", numero);
			
		} else if ((numero % 2 == 1) && numero > 0) {
			System.out.printf("O Número %d é ímpar e positivo!", numero);
			
		} else {
			System.out.printf("O Número %d é ímpar e negativo!", numero);
			
		}
		

		read.close();
	}

}
