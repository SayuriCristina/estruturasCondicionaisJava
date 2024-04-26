package aprendendocondicionais;

import java.util.Scanner;

public class Comparador {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
	
		int a = read.nextInt();
		read.nextLine();
		
		System.out.print("Digite o número B: ");
		int b = read.nextInt();
		read.nextLine();
		
		System.out.print("Digite o número C: ");
		int c = read.nextInt();
		read.nextLine();
		
		int resultado = a + b;
		
		if (resultado > c) {
			System.out.printf("%d + %d = %d > %d"
					+ "\nA Soma de A + B é Maior do que C", a, b, resultado, c);
		} else if (resultado < c) {
			System.out.printf("%d + %d = %d < %d"
					+ "\nA Soma de A + B é Menor do que C", a, b, resultado, c);
		} else {
			System.out.printf("%d + %d = %d = %d"
					+ "\nA Soma de A + B é Igual a C", a, b, resultado, c);
		}
		
		read.close();
	}

}
