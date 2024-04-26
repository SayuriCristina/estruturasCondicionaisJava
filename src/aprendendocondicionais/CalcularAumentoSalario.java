package aprendendocondicionais;

import java.util.Scanner;

public class CalcularAumentoSalario {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		System.out.print("Nome do colaborador: ");
		String colaborador = read.nextLine();
		
		System.out.println("Digite o código do cargo do colaborador conforme abaixo:"
				+ "\n1 - Gerente"
				+ "\n2 - Vendedor"
				+ "\n3 - Supervisor"
				+ "\n4 - Motorista"
				+ "\n5 - Estoquista"
				+ "\n6 - Técnico de TI");
		int cargo = read.nextInt();
		
		System.out.print("Salário do colaborador: R$");
		float salario = read.nextFloat();
		
		float novoSalario;
		
		switch(cargo) {
		case 1:
			novoSalario = salario + (0.1f * salario);
			System.out.printf("Nome do colaborador: %s \n"
					+ "Cargo: Gerente\n"
					+ "Salário: %.2f", colaborador, novoSalario);
			break;
		case 2:
			novoSalario = salario + (0.07f * salario);
			System.out.printf("Nome do colaborador: %s \n"
					+ "Cargo: Vendedor\n"
					+ "Salário: %.2f", colaborador, novoSalario);
			break;
		case 3:
			novoSalario = salario + (0.09f * salario);
			System.out.printf("Nome do colaborador: %s \n"
					+ "Cargo: Supervisor\n"
					+ "Salário: %.2f", colaborador, novoSalario);
			break;
		case 4:
			novoSalario = salario + (0.06f * salario);
			System.out.printf("Nome do colaborador: %s \n"
					+ "Cargo: Motorista\n"
					+ "Salário: %.2f", colaborador, novoSalario);
			break;
		case 5:
			novoSalario = salario + (0.05f * salario);
			System.out.printf("Nome do colaborador: %s \n"
					+ "Cargo: Estoquista\n"
					+ "Salário: %.2f", colaborador, novoSalario);
			break;
		case 6:
			novoSalario = salario + (0.08f * salario);
			System.out.printf("Nome do colaborador: %s \n"
					+ "Cargo: Técnico de TI\n"
					+ "Salário: %.2f", colaborador, novoSalario);
			break;
		default:
			System.out.println("Dados inválidos.");
		
		}
		
		read.close();

	}

}
